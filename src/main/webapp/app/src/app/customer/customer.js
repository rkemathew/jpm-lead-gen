angular.module('ngBoilerplate.customer', ['ui.router', 'ngResource', 'hateoas', 'angular-growl', 'ui.select2'])
.config(function($stateProvider, growlProvider) {
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

    growlProvider.onlyUniqueMessages(false);
    growlProvider.globalTimeToLive(5000);
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
.controller("ManageCustomerCtrl", function($scope, customerService, $state, growl) {
    $scope.createCustomer = function() {
        customerService.createCustomer($scope.customer).then(
            function(data) {
                growl.success('Customer Created: ' + data.companyName);
            },
            function(error) {
                growl.error(error.data.errorMessage);
            }
        );
    };

    $scope.states = [
        { 'value': 'AL', 'display': 'Alabama' },
        { 'value': 'AK', 'display': 'Alaska' },
        { 'value': 'AS', 'display': 'American Samoa' },
        { 'value': 'AZ', 'display': 'Arizona' },
        { 'value': 'AR', 'display': 'Arkansas' },
        { 'value': 'CA', 'display': 'California' },
        { 'value': 'CO', 'display': 'Colorado' },
        { 'value': 'CT', 'display': 'Connecticut' },
        { 'value': 'DC', 'display': 'Washington DC' },
        { 'value': 'DE', 'display': 'Delaware' },
        { 'value': 'FL', 'display': 'Florida' },
        { 'value': 'GA', 'display': 'Georgia' },
        { 'value': 'GU', 'display': 'Guam' },
        { 'value': 'HI', 'display': 'Hawaii' },
        { 'value': 'ID', 'display': 'Idaho' },
        { 'value': 'IL', 'display': 'Illinois' },
        { 'value': 'IN', 'display': 'Indiana' },
        { 'value': 'IA', 'display': 'Iowa' },
        { 'value': 'KS', 'display': 'Kansas' },
        { 'value': 'KY', 'display': 'Kentucky' },
        { 'value': 'LA', 'display': 'Louisiana' },
        { 'value': 'ME', 'display': 'Maine' },
        { 'value': 'MD', 'display': 'Maryland' },
        { 'value': 'MA', 'display': 'Massachusetts' },
        { 'value': 'MI', 'display': 'Michigan' },
        { 'value': 'MN', 'display': 'Minnesota' },
        { 'value': 'MS', 'display': 'Mississippi' },
        { 'value': 'MO', 'display': 'Missouri' },
        { 'value': 'MT', 'display': 'Montana' },
        { 'value': 'NE', 'display': 'Nebraska' },
        { 'value': 'NV', 'display': 'Nevada' },
        { 'value': 'NH', 'display': 'NewHampshire' },
        { 'value': 'NJ', 'display': 'NewJersey' },
        { 'value': 'NM', 'display': 'NewMexico' },
        { 'value': 'NY', 'display': 'NewYork' },
        { 'value': 'NC', 'display': 'NorthCarolina' },
        { 'value': 'ND', 'display': 'NorthDakota' },
        { 'value': 'MP', 'display': 'Northern Mariana Islands' },
        { 'value': 'OH', 'display': 'Ohio' },
        { 'value': 'OK', 'display': 'Oklahoma' },
        { 'value': 'OR', 'display': 'Oregon' },
        { 'value': 'PA', 'display': 'Pennsylvania' },
        { 'value': 'PR', 'display': 'Puerto Rico' },
        { 'value': 'RI', 'display': 'Rhode Island' },
        { 'value': 'SC', 'display': 'SouthCarolina' },
        { 'value': 'SD', 'display': 'SouthDakota' },
        { 'value': 'TN', 'display': 'Tennessee' },
        { 'value': 'TX', 'display': 'Texas' },
        { 'value': 'UT', 'display': 'Utah' },
        { 'value': 'VT', 'display': 'Vermont' },
        { 'value': 'VA', 'display': 'Virginia' },
        { 'value': 'VI', 'display': 'US Virgin Islands' },
        { 'value': 'WA', 'display': 'Washington' },
        { 'value': 'WV', 'display': 'WestVirginia' },
        { 'value': 'WI', 'display': 'Wisconsin' },
        { 'value': 'WY', 'display': 'Wyoming' }
    ];
});