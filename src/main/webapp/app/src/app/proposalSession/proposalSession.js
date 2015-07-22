angular.module('ngBoilerplate.proposalSession', [
    'ui.router', 'ngResource', 'hateoas', 'angular-growl', 'kendo.directives'
])
.config(function($stateProvider, growlProvider) {
    $stateProvider.state('manageProposalSession', {
            url:'/manage/proposalSession',
            views: {
                'main': {
                    templateUrl:'proposalSession/manage-proposal-session.tpl.html',
                    controller: 'ManageProposalSessionCtrl'
                }
            },
            data : { pageTitle : "Proposal Session" }
    });

    /* Growl Configuration */
    growlProvider.onlyUniqueMessages(false);
    growlProvider.globalTimeToLive(5000);
})
.directive('customerGoal', function() {
    return {
        restrict: 'A',
        templateUrl: 'proposalSession/customer-goal.tpl.html'
    };
})
.directive('jpmModel', function() {
    return {
        restrict: 'A',
        templateUrl: 'proposalSession/jpm-model.tpl.html'
    };
})
.directive('assumedSalesCalc', function() {
    return {
        restrict: 'A',
        templateUrl: 'proposalSession/assumed-sales-calc.tpl.html'
    };
})
.directive('commissionCalc', function() {
    return {
        restrict: 'A',
        templateUrl: 'proposalSession/commission-calc.tpl.html'
    };
})
.directive('recruitingEffortCalc', function() {
    return {
        restrict: 'A',
        templateUrl: 'proposalSession/recruiting-effort-calc.tpl.html'
    };
})
.directive('advancedDebtCalc', function() {
    return {
        restrict: 'A',
        templateUrl: 'proposalSession/advanced-debt-calc.tpl.html'
    };
})
.directive('proposalOutput', function() {
    return {
        restrict: 'A',
        templateUrl: 'proposalSession/proposal-output.tpl.html'
    };
})
.factory('proposalSessionService', function($resource, $q, $http) {
    var service = {};

    service.createProposalSession = function(proposalSession) {
        var ProposalSession = $resource("/jpm-lead-gen/rest/proposalSession");
        return ProposalSession.save({}, proposalSession).$promise;
    };

    service.updateProposalSession = function(proposalSession) {
        var ProposalSession = $resource("/jpm-lead-gen/rest/proposalSession/:proposalSessionId");
        return ProposalSession.save({proposalSessionId: proposalSession.rid}, proposalSession).$promise;
    };

    service.findProposalSession = function(passedProposalSessionId) {
        var ProposalSession = $resource("/jpm-lead-gen/rest/proposalSession/:proposalSessionId");
        return ProposalSession.get({proposalSessionId: passedProposalSessionId}).$promise;
    };

    return service;
})
.controller("ManageProposalSessionCtrl", function($scope, $rootScope, proposalSessionService, customerService, $state, growl) {
    /* Initialization and setting up watch to detect changes to forms */
    $scope.proposalSession = {
        rid: -1,
        customerGoal: {
            rid: -1,
            customer: {
                rid: -1
            }
        }
    };

    // If a Proposal Session was already active, then fetch its proposalSessionId from the rootScope
    // and re-load it at the beginning of this scope. This will help reload the Proposal Session
    // when navigating away from the Proposal Session menu and returning to it during the user session.
    if ($rootScope.proposalSessionId !== undefined && $rootScope.proposalSessionId !== -1) {
        proposalSessionService.findProposalSession($rootScope.proposalSessionId).then(function(data) {
            $scope.proposalSession = data;
            delete $scope.proposalSession.links;
            delete $scope.proposalSession.customerGoal.links;
            delete $scope.proposalSession.customerGoal.customer.links;

            $scope.proposalSessionPristine = angular.copy($scope.proposalSession);
            $scope.proposalSessionChanged = false;
            $scope.companyNameLookup = $scope.proposalSession.customerGoal.customer.companyName;
        });
    }

    // Keep a copy of the proposalSession Scope Object for comparison to check for changes
    $scope.proposalSessionPristine = angular.copy($scope.proposalSession);
    $scope.proposalSessionChanged = false;

    // Angular watch on the proposalSession Scope Object to trigger a save
    $scope.$watch('proposalSession', function(newValue, oldValue) {
        if (newValue != oldValue) {
            $scope.proposalSessionChanged = ! angular.equals($scope.proposalSession, $scope.proposalSessionPristine);
        }
    }, true);

    // Subscribe to the stateChangeStart Event that occurs when navigating between menu item. Need to trigger save here also
    var stateChangeStartHandle = $rootScope.$on('$stateChangeStart', function(event, toState, toParams, fromState, fromParams) {
        savePending();
    });

    // Un-Subscribe from the stateChangeStart Event when the Scope is destroyed
    $scope.$on('$destroy', stateChangeStartHandle);

    /* Kendo UI Tabstrip Configuration Options and Events */
    $scope.proposalFormKendoTabStrip = {
        tabPosition: "top",
        animation: {
            close: {
                duration: 200,
                effects: "fadeOut"
            },
            open: {
                duration: 200,
                effects: "fadeIn"
            }
        },
        select: proposalFormKendoTabStrip_onSelect
    };

    // Fired when tab strip selection is changed
    function proposalFormKendoTabStrip_onSelect(e) {
//        console.log("Selected: " + $(e.item).find("> .k-link").text());
        savePending();
    }

    // This function performs saving of the data if pending changes to be updated.
    function savePending() {
        if ($scope.proposalSessionChanged) {
            console.log("Proposal Session Changed: " + $scope.proposalSessionChanged + "... saving.");

            if ($scope.proposalSession.rid === -1) {
                proposalSessionService.createProposalSession($scope.proposalSession).then(
                    function(data) {
                        $scope.proposalSession.rid = data.rid;
                        $rootScope.proposalSessionId = data.rid;
                        growl.success('Proposal Session Created');

                        $scope.proposalSessionPristine = angular.copy($scope.proposalSession);
                        $scope.proposalSessionChanged = false;
                    },
                    function(error) {
                        growl.error(error.data.errorMessage);
                    }
                );
            } else {
                proposalSessionService.updateProposalSession($scope.proposalSession).then(
                    function(data) {
                        growl.success('Proposal Session Updated');

                        $scope.proposalSessionPristine = angular.copy($scope.proposalSession);
                        $scope.proposalSessionChanged = false;
                    },
                    function(error) {
                        growl.error(error.data.errorMessage);
                    }
                );
            }
        }
    }

    /* Kendo UI Options common across Forms */
    $scope.kendoNumericTextBoxOptions = {
        min: "0",
        max: "100000000",
        format: "c2",      // Currency with 2 decimal places
        spinners: false
    };

    /* Customer Goal Form Control Options */
    $scope.lagTimeTextBoxOptions = {
        min: "0",
        max: "12",
        format: "#"
    };

    // Company Name Lookup AutoComplete Backing Code
    $scope.customerAutoComplete = {
        minLength: 2,
        dataTextField: 'companyName',
        dataSource: new kendo.data.DataSource({
            serverFiltering: true,
            transport: {
                read: function(options) {
                    if ($scope.companyNameLookup.length >= 2) {
                        customerService.getCustomersLike($scope.companyNameLookup).then(function(data) {
                            return options.success(data.customers);
                        });
                    } else {
                        return options.success([]);
                    }
                }
            }
        }),
        select: function(e) {
            var dataItem = this.dataItem(e.item.index());
            $scope.proposalSession.customerGoal.customer.rid = dataItem.rid;
            $scope.proposalSession.customerGoal.customer.contactName = dataItem.contactName;
        }
    };
})
;