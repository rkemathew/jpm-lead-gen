angular.module('ngBoilerplate.customer', ['ui.router', 'ngResource', 'hateoas'])
.config(function($stateProvider) {
    $stateProvider.state('manageCustomers', {
            url:'/manage/customers',
            views: {
                'main': {
                    templateUrl:'customer/manage-customer.tpl.html',
                    controller: 'ManageCustomerCtrl'
                }
            },
            data : { pageTitle : "Customers" }
    });
})
.factory('customerService', function($resource, $q) {
      var service = {};
      service.createCustomer = function(customer) {
        var Customer = $resource("/jpm-lead-gen/rest/customers");
        return Customer.save({}, customer).$promise;
      };
      service.getAllCustomers = function() {
        var Customer = $resource("/jpm-lead-gen/rest/customers");
        return Customer.get().$promise.then(function(data) {
            return data.customers;
        });
      };
      return service;
})
.controller("ManageCustomerCtrl", function($scope, customerService, $state) {
    $scope.createCustomer = function() {
        customerService.createCustomer($scope.customer);
    };
});