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

    service.createOrUpdateProposalSession = function(proposalSession) {
        var ProposalSession = $resource("/jpm-lead-gen/rest/proposalSession");
        return ProposalSession.save({}, proposalSession).$promise;
    };

    return service;
})
.controller("ManageProposalSessionCtrl", function($scope, proposalSessionService, customerService, $state, growl) {
    /* Initialization and setting up watch to detect changes to forms */
    $scope.proposalSession = {
        rid: -1,
        customerGoal: {
            rid: -1,
            customerRid: -1
        }
    };

    $scope.proposalSessionPristine = angular.copy($scope.proposalSession);
    $scope.proposalSessionChanged = false;

    $scope.$watch('proposalSession', function(newValue, oldValue) {
        if (newValue != oldValue) {
            $scope.proposalSessionChanged = ! angular.equals($scope.proposalSession, $scope.proposalSessionPristine);
        }
    }, true);

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

    function proposalFormKendoTabStrip_onSelect(e) {
//        console.log("Selected: " + $(e.item).find("> .k-link").text());

        if ($scope.proposalSessionChanged) {
            console.log("Proposal Session Changed: " + $scope.proposalSessionChanged + "... saving.");

            proposalSessionService.createOrUpdateProposalSession($scope.proposalSession).then(
                function(data) {
                    if ($scope.proposalSession.rid === -1) {
                        $scope.proposalSession.rid = data.rid;
                        growl.success('Proposal Session Created');
                    } else {
                        growl.success('Proposal Session Updated');
                    }

                    $scope.proposalSessionPristine = angular.copy($scope.proposalSession);
                    $scope.proposalSessionChanged = false;
                },
                function(error) {
                    growl.error(error.data.errorMessage);
                }
            );
        }
    }

    /* Kendo UI Options common across Forms */
    $scope.kendoNumericTextBoxOptions = {
        min: "0",
        max: "100000000",
        format: "c2",
        spinners: false
    };

    /* Customer Goal Form Control Options */
    $scope.lagTimeTextBoxOptions = {
        min: "0",
        max: "12",
        format: "#"
    };

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
            $scope.proposalSession.customerGoal.customerRid = dataItem.rid;
            $scope.proposalSession.customerGoal.contactName = dataItem.contactName;
        }
    };
})
;