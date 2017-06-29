/**
 * Created by ls-mac on 2017/6/24.
 */
var myApp = angular.module("myApp",[]);

myApp.controller("firstController",["$scope",function ($scope) {
    $scope.books = [{name:"php"},{name:"javascript"},{name:"java"},{name:"angularJS"},{name:"test"},{name:"android"}]
    $scope.test = "test";
    console.log($scope)
}]);
myApp.directive("bookList",function () {
   return {
       restrict:"ECAM",
       replace:true,
       template:"<ul><li ng-repeat='book in books'>{{book.name}}</li></ul>",
       //scope:true, // false继承controller true不继承单还是可以拿到controller的数据
       scope:{
           //将books封装成函数
           // a:"&books",
           b:"=parentBooks", //双
           c:"@parentTitle" // 单 只能传基本类型
       },
       controller:function ($scope) { //$scope 的 作用域根据 scope
           console.log($scope)
           console.log($scope.c)
           // $scope.books = $scope.a(); //&books

           $scope.books = $scope.b;



       }
   }
});