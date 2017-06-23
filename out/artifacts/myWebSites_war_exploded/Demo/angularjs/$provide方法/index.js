/**
 * Created by ls-mac on 2017/6/10.
 */
var app = angular.module("myApp",[],function ($provide) {

    $provide.provider("CustomService",function () {
        this.$get = function () {
            return {
                msg:"1"
            }
        }
    })


    $provide.factory("Customfactory",function () {
            return "2"
    })

    $provide.service("CustomService1",function () {
        return {
            msg:"3"
        }
    })
})


app.controller("firstController",function ($scope,CustomService,Customfactory,CustomService1) {
    console.log(Customfactory);

    console.log(CustomService1)

    console.log(CustomService)
});