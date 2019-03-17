'use strict';

// Declare app level module which depends on views, and components
var app = angular.module('produtoApp', ['ngRoute']);

app.
config(['$routeProvider', function($routeProvider) {
  $routeProvider.when('/produto', {templateUrl: 'views/partials/produto.html', controller: 'ProdutoController' });
  $routeProvider.when('/categoria', {templateUrl: 'views/partials/categoria.html', controller: 'CategoriaController' });
  //$routeProvider.otherwise({redirectTo: '/index'});
}]);
