/**
 * Created by ls-mac on 2017/6/10.
 */
var app = angular.module("myApp",[],function () {

});
app.directive("bookList",function () {

    return {
        restrict:"ECAM", //E:元素,C:style，A:属性
        template:"<div><ul><li ng-repeat='book in books'>{{book.name}}</li></ul><boo-add></boo-add></div>",
        replace:true,
        controller:function ($scope) {
            $scope.books = [
                {
                    name:"php"
                },
                {
                    name:"javascript"
                },
                {
                    name:"python"
                }
            ]
            this.add = function () {
                $scope.$apply(function () {
                    $scope.books.push({
                        name:"angularJs"
                    })
                })
            }
        },
        controllerAs:"bookList",
    }
}).directive("booAdd",function () {
    return {
        restrict: "ECAM", //E:元素,C:style，A:属性
        template: "<div>添加</div>",
        replace: true,
        require: "^bookList",
        link: function (scope, iElement, iAttrs, bookList) {
            iElement.on("click", bookList.add)
        }
    }
});
app.controller("firstController",function ($scope) {




})