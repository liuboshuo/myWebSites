/**
 * Created by ls-mac on 2017/6/10.
 */
function firstController($scope){
    $scope.user = {
        name:"张三",
        age:10
    }
    $scope.$watch("user",function (newValue,oldValue) {
        $scope.countText++;
        if($scope.countText>30){
            $scope.name = "改变了30辞了，不能改变了啊"
        }
    },true);
    //观察属性 false观察对象值

    $scope.name = "张三"
    $scope.countText = 0;

    $scope.$watch("name",function (newValue,oldValue) {
        $scope.countText++;
        if($scope.countText>30){
            $scope.name = "改变了30辞了，不能改变了啊"
        }
    })
}