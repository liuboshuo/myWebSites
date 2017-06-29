/**
 * Created by ls-mac on 2017/6/24.
 */
var myApp = angular.module("myApp",[]);

myApp.directive("kittencupGroup",function () {
    return {
        restrict:"E",
        replace:true,
        template:"<div ng-transclude=''></div>",
        transclude:true,
        controller:function () {
            this.groups = [];
            this.closeOther = function (now) {
                angular.forEach(this.groups,function (scope) {
                    if(scope !== now) scope.isOpen = true
                })
            }
        },
        controllerAs:"controllerAs"
    }
})

myApp.directive("kittencupCollapse",function () {
    return {
        restrict:"E",
        replace:true,
        templateUrl:"kittencupCollapse.html",
        scope:{
            heading:"@heading"
        },
        require:"^kittencupGroup",
        transclude:true,
        link:function (scope,element,attrs,controllerAs) {
            scope.isOpen = true;
            scope.changeOpen = function () {
                scope.isOpen = !scope.isOpen
                controllerAs.closeOther(scope);
            }
            controllerAs.groups.push(scope);
        }
    }
})

myApp.controller("firstController",["$scope",function($scope) {
    $scope.datas = [
        {
            title:'标题一',
            content:"内容一"
        },
        {
            title:'标题二',
            content:"内容二"
        },
        {
            title:'标题三',
            content:"内容三"
        }
    ]
}]);