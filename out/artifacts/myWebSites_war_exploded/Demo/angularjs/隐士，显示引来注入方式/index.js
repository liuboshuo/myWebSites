/**
 * Created by ls-mac on 2017/6/10.
 */
var app = angular.module("myApp",[], function () {

})

// 隐士注入的
app.controller("firstController" ,  function ($scope) {

    console.log($scope)
})

//显示(推荐)
app.controller("secondController" ,["$scope", function (b) {
    console.log(b +"" + b)
}])