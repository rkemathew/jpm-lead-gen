angular.module('ngBoilerplate.customer', [
    'ui.router', 'ui.bootstrap', 'ngResource', 'hateoas', 'angular-growl', 'kendo.directives'
])
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

    service.updateCustomer = function(customer) {
        var Customer = $resource("/jpm-lead-gen/rest/customers/:customerId");
        return Customer.save({customerId: customer.rid}, customer).$promise;
    };

    service.getAllCustomers = function() {
        var Customer = $resource("/jpm-lead-gen/rest/customers");
        return Customer.get().$promise;
    };

    service.getCustomersLike = function(companyName) {
        var Customer = $resource("/jpm-lead-gen/rest/customers?paramCompanyName=:paramCompanyName");
        return Customer.get({paramCompanyName: companyName}).$promise;
    };

    return service;
})
.controller("ManageCustomerCtrl", function($scope, customerService, $state, growl, $compile) {
    function resetCustomer() {
        delete $scope.customer;

        $scope.customer = {
            zip: '',
            phone1: '',
            phone2: ''
        };

        $scope.editMode = "add";
    }

    resetCustomer();

    $scope.editMode = "add";

    /* Configuration and event handling for the Customer Edit Confirmation Dialog */
    $("#customerEditConfirmDialog").kendoWindow({
        visible: false,
        modal: true,
        width: "350px",
        actions: [ "Close" ],
        title: "Edit Customer Confirmation"
    });

    var customerEditConfirmDialog = $("#customerEditConfirmDialog").data("kendoWindow");

    $scope.customerEditConfirmYes = function() {
        $scope.customer = $scope.errorObject;
        delete $scope.customer.links;
        $scope.editMode = "edit";

        customerEditConfirmDialog.close();
    };

    $scope.customerEditConfirmNo = function() {
        customerEditConfirmDialog.close();
    };

    /* Function for creating a new customer in the database */
    $scope.createCustomer = function() {
        customerService.createCustomer($scope.customer).then(
            function(data) {
                resetCustomer();
                growl.success('Customer Created: ' + data.companyName);
            },
            function(error) {
                var errorMessage = error.data.errorMessage;
                var errorObject = error.data.errorObject;
                $scope.errorMessage = errorMessage;
                $scope.errorObject = errorObject;
                growl.error(errorMessage);

                var content = $compile($("#customerEditConfirmationDialogTemplate").html())($scope);
                customerEditConfirmDialog.content(content);
                customerEditConfirmDialog.center().open();
            }
        );
    };

    /* Function for updating an existing customer in the database */
    $scope.updateCustomer = function() {
        customerService.updateCustomer($scope.customer).then(
            function(data) {
                resetCustomer();
                growl.success('Customer Updated: ' + data.companyName);
            },
            function(error) {
                var errorMessage = error.data.errorMessage;
                var errorObject = error.data.errorObject;
                $scope.errorMessage = errorMessage;
                $scope.errorObject = errorObject;
                growl.error(errorMessage);

                var content = $compile($("#customerEditConfirmationDialogTemplate").html())($scope);
                customerEditConfirmDialog.content(content);
                customerEditConfirmDialog.center().open();
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
        { 'value': 'NH', 'display': 'New Hampshire' },
        { 'value': 'NJ', 'display': 'New Jersey' },
        { 'value': 'NM', 'display': 'New Mexico' },
        { 'value': 'NY', 'display': 'New York' },
        { 'value': 'NC', 'display': 'North Carolina' },
        { 'value': 'ND', 'display': 'North Dakota' },
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
        { 'value': 'WV', 'display': 'West Virginia' },
        { 'value': 'WI', 'display': 'Wisconsin' },
        { 'value': 'WY', 'display': 'Wyoming' }
    ];
})
.directive('rawMask', function($parse) {
    function link(scope, element, attrs) {
        var field = attrs.rawMask;

        setTimeout(function() {
            var widget = element.data("kendoMaskedTextBox");
            var widgetValue = scope.$eval(field);

            widget.value(widgetValue);
            widget.bind("change", function() {
                scope.$apply(function() {
                    var model = $parse(field);
                    model.assign(scope, widget.raw());
                });
            });

            scope.$watch(field, function(newValue, oldValue) {
                if (newValue !== oldValue) {
                    widget.value(newValue);
                }
            });
        }, 10);
    }

    return {
        restrict: 'A',
        link: link
    };
})
;
