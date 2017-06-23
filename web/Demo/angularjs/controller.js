/**
 * Created by liushuo on 17/1/4.
 */
var myApp = angular.module("myApp",[]);

myApp.controller('phoneController',function( $scope ){
    $scope.indexs = [1,2,3,4,5,6];

        $scope.phones = [
            {"name": "Nexus S",
                "snippet": "Fast just got faster with Nexus S.","description":"1"},
            {"name": "Motorola XOOM™ with Wi-Fi",
                "snippet": "The Next, Next Generation tablet.","description":"2"},
            {"name": "MOTOROLA XOOM™",
                "snippet": "The Next, Next Generation tablet.","description":"3"}
        ];
    $scope.myclick = function(params){
        console.log("---11" +  params);
    }

    $scope.orderModel = "description";
    });