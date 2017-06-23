/**
 * Created by ls-mac on 2017/6/10.
 */
angular.module("myApp",[])
    
    .controller("controller",function ($scope,$filter) {
        $scope.today = new Date()
        $scope.data = "Hello word"
        $scope.filters = [
            {name:"北京",en:"beijing"},
            {name:'上海',en:'shanghai'},
            {name:'四川',en:'sichaun'}
        ]

        var number = $filter("number")(30000);
        console.log(number)

        var json = $filter('json')($scope.filters)
        console.log(json)


        $scope.checkName = function (temp) {
            if (temp.en.indexOf("g") != -1){
                return false
            }
            return true
        }
    })