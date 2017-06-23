/**
 * Created by ls-mac on 2017/6/10.
 */
var app = angular.module("myApp",[],function () {

}).factory("Data",function () {
    return {
        msg:"这是共享数据"
    }
})

app.controller("firstController" ,  function ($scope,Data) {


    $scope.data = {
        name:'张三'
    }
    $scope.Data = Data

}).controller("secondController" , function ($scope,Data) {

    $scope.data = $scope.$$prevSibling.data
    $scope.Data = Data

})