/**
 * Created by ls-mac on 2017/6/25.
 */
/**
 * Created by ls-mac on 2017/6/10.
 */
var app = angular.module("myApp",[], function () {

}).controller("firstController" ,  function ($scope) {
    $scope.citys = [
        {
            name: '上海',
            parent: 0,
            id: 1
        },
        {
            name: '上海市',
            parent: 1,
            id: 2
        },
        {
            name: '徐汇区',
            parent: 2,
            id: 8
        },
        {
            name: '长宁区',
            parent: 2,
            id: 3
        },
        {
            name: '北京',
            parent: 0,
            id: 4
        },
        {
            name: '北京市',
            parent: 4,
            id: 5
        },
        {
            name: '东城区',
            parent: 5,
            id: 6
        },
        {
            name: '丰台区',
            parent: 5,
            id: 7
        },
        {
            name: '浙江',
            parent: 0,
            id: 9
        },
        {
            name: '杭州',
            parent: 9,
            id: 100
        },
        {
            name: '宁波',
            parent: 9,
            id: 11
        },
        {
            name: '西湖区',
            parent: 100,
            id: 12
        },
        {
            name: '北仑区‎',
            parent: 11,
            id: 13
        }
    ],
    $scope.hobbies = [
        {
            id: 1,
            name: '玩游戏'
        },
        {
            id: 2,
            name: '写代码'
        },
        {
            id: 3,
            name: '睡觉'
        },
    ];

    $scope.data={
        hobbies:[1,2],
        // city:3,
    }
    $scope.origData = angular.copy($scope.data)
    $scope.reset = function () {
        $scope.data = angular.copy($scope.origData);
        console.log($scope.data)
        this.initCity();
        $scope.form.$setPristine();
    }

    this.findCityId = function (parent) {
        var parentId;
        angular.forEach($scope.citys, function (city) {
            if (city.id === parent) {
                parentId = city.parent;
                return;
            }
        })
        return parentId;
    }

    this.initCity = function(){
        if ($scope.data.city !== undefined) {
            $scope.data.area = this.findCityId($scope.data.city);
            $scope.data.province = this.findCityId($scope.data.area);
        }
    }

    // 第一次打开页面 需要初始化一下
    this.initCity.call(this);

    $scope.changeCkecked = function(hobby){
        var index = -1;
        if ($scope.hobbies == undefined){
            $scope.data.hobbies = [];
        }else {
           index = $scope.data.hobbies.indexOf(hobby.id);
        }
        if (index == -1){
            $scope.data.hobbies.push(hobby.id)
        }else {
            $scope.data.hobbies.splice(index,1)
        }
        console.log($scope.data)
    }

}).directive("textArea",function () {

    return {
        restrict:"ECMA",
        replace:true,
        template:"<div><textarea></textarea></div>",
    }

}).filter("cityFilter",function () {
    return function (city,parent) {
        var filterCity = [];
        angular.forEach(city,function (obj) {
            if (obj.parent == parent){
                filterCity.push(obj)
            }
        })
        console.log(filterCity)
        return filterCity;
    }
})