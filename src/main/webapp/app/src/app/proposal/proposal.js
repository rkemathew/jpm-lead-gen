angular.module('ngBoilerplate.proposal', ['ui.router', 'ngResource', 'hateoas', 'angular-growl'])
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
.factory('proposalService', function($resource, $q) {
    var service = {};

    return service;
})
.controller("ManageProposalCtrl", function($scope, proposalService, $state, growl) {
    $scope.createCustomer = function() {
    };
});