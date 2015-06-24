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
    //$scope.customerDataSource = proposalService.getCustomersLike($scope.proposalSession.customerGoal.companyName);
    $scope.customerAutoComplete = {
        dataTextField: 'companyName',
        dataSource: new kendo.data.DataSource({
            transport: {
                read: function(options) {
                    return customerService.getAllCustomers(options);
                }
            }
        })
    };
});