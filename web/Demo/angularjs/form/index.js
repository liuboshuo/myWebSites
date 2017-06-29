/**
 * Created by ls-mac on 2017/6/25.
 */
/**
 * Created by ls-mac on 2017/6/10.
 */
var app = angular.module("myApp",[], function () {

}).controller("firstController" ,  function ($scope) {

    $scope.users = [
        {
            id:1,
            name:"张三"
        },
        {
            id:2,
            name:"李思"
        }
    ]
    $scope.name = "张三";

})