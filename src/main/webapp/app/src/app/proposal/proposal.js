angular.module('ngBoilerplate.proposal', [
    'ui.router', 'ngResource', 'hateoas', 'angular-growl', 'ui.utils.masks', 'kendo.directives'
])
.config(function($stateProvider, growlProvider) {
    $stateProvider.state('manageProposal', {
            url:'/manage/proposal',
            views: {
                'main': {
                    templateUrl:'proposal/manage-proposal.tpl.html',
                    controller: 'ManageProposalCtrl'
                }
            },
            data : { pageTitle : "Proposal" }
    });

    growlProvider.onlyUniqueMessages(false);
    growlProvider.globalTimeToLive(5000);
})
.factory('proposalService', function($resource, $q, $http) {
    var service = {};

    return service;
})
.controller("ManageProposalCtrl", function($scope, proposalService, customerService, $state, growl) {
    $scope.kendoNumericTextBoxOptions = {
        min: "0",
        max: "100000000",
        format: "c2",
        spinners: false
    };

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
                    if ($scope.proposalSession.customerGoal.companyName.length >= 2) {
                        customerService.getCustomersLike($scope.proposalSession.customerGoal.companyName).then(function(data) {
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
            $scope.proposalSession.customerGoal.contactName = dataItem.contactName;
        }
    };
})
.directive('customerGoal', function() {
    return {
        restrict: 'A',
        transclude: false,
        templateUrl: 'proposal/customer-goal.tpl.html'
    };
})
.directive('jpmModel', function() {
    return {
        restrict: 'A',
        templateUrl: 'proposal/jpm-model.tpl.html'
    };
})
.directive('assumedSalesCalc', function() {
    return {
        restrict: 'A',
        templateUrl: 'proposal/assumed-sales-calc.tpl.html'
    };
})
.directive('commissionCalc', function() {
    return {
        restrict: 'A',
        templateUrl: 'proposal/commission-calc.tpl.html'
    };
})
.directive('recruitingEffortCalc', function() {
    return {
        restrict: 'A',
        templateUrl: 'proposal/recruiting-effort-calc.tpl.html'
    };
})
.directive('advancedDebtCalc', function() {
    return {
        restrict: 'A',
        templateUrl: 'proposal/advanced-debt-calc.tpl.html'
    };
})
.directive('proposalOutput', function() {
    return {
        restrict: 'A',
        templateUrl: 'proposal/proposal-output.tpl.html'
    };
})
;