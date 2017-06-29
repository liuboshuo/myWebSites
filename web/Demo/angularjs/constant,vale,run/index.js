/**
 * Created by ls-mac on 2017/6/24.
 */

var myApp = angular.module("myApp",[]);

myApp.config(function (APPNAME) {

    console.log(APPNAME)
});
myApp.run(["APPNAME","VERSION",function (APPNAME,VERSION) {

    console.log("run");

    console.log(VERSION)

    console.log(APPNAME)

}])

//controller , service , factory , config,run....
myApp.constant("APPNAME","APPNAME")

// controller , service , factory ,run....
myApp.value("VERSION","1.0.1");


myApp.controller("firstController",["$scope","APPNAME","VERSION",function ($scope,APPNAME,VERSION) {

    console.log("controller")

    console.log(APPNAME)

    console.log(VERSION)

}]);