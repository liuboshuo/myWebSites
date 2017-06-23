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

}).directive("customTags",function () {
    return {
        restrict:"ECAM", //E:元素,C:style，A:属性
        template:"<div>2313<p ng-transclude></p></div>",
        replace:true,
        compile:function () {
            console.log("test")
        },
        transclude:true,
    }
}).directive("hello",function () {
    return {
        restrict:"E", //E:元素,C:style，A:属性
        templateUrl:"temp/index.html",
        replace:true,
    }
}).directive("customTags1",function () {
    return {
        restrict:"ECAM", //E:元素,C:style，A:属性
        template:"<div>{{user.name}}</div>",
        replace:true,
        // compile----dom
        compile:function (tElement,tAttrs,transclude) {
            console.log("正在编译")
            tElement.append(angular.element("<div>aaa</div>"))
            return {
                pre:function preLink(scope,iElement,iAttrs,controller) {
                    console.log("链接前")
                },
                // postLink = link  == 界面事件绑定
                post:function preLink(scope,iElement,iAttrs,controller) {
                    console.log("链接完成")
                    iElement.on("click",function () {
                        scope.$apply(function () {
                            scope.user.name = "test"
                        })
                    })
                }
            }
        }

    }
}).directive("customTags2",function () {
    return {
        restrict:"E", //E:元素,C:style，A:属性
        replace:true,
        compile:function (tElement,tAttrs,transclude) {
            console.log("正在编译")
            return {
                pre:function preLink(scope,iElement,iAttrs,controller) {
                    console.log("链接前")
                },
                post:function preLink(scope,iElement,iAttrs,controller) {
                    console.log("链接完成")
                }
            }
        },
    }
})