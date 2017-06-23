/**
 * Created by ls-mac on 2017/6/10.
 */

function firstController($scope){
    $scope.user = {
        name:"张三",
        age:10
    }

    $scope.date = new Date(0)

    setInterval(function () {
        $scope.$apply(function () {
            $scope.date = new Date()
        })
    },1000)
}