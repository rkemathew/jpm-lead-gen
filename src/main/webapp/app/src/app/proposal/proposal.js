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
});