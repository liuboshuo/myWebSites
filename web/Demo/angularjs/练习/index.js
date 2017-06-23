/**
 * Created by ls-mac on 2017/6/10.
 */

function firstController($scope){
    $scope.cart = [
        {
            id: 1000,
            name: 'iphone5s',
            quantity: 3,
            price: 4300
        },
        {
            id: 3300,
            name: 'iphone5',
            quantity: 30,
            price: 3300
        },
        {
            id: 232,
            name: 'imac',
            quantity: 4,
            price: 23000
        },
        {
            id: 1400,
            name: 'ipad',
            quantity: 5,
            price: 6900
        }
    ];
    $scope.price = function () {
        var total = 0;
        angular.forEach($scope.cart,function (item) {
            total = total + item.quantity * item.price
        })
        return total;
    }
    $scope.count = function () {
        var total = 0;
        angular.forEach($scope.cart,function (item) {
            total = total + item.quantity
        })
        return total;
    }
    var find = function (item) {
        var removeIndex = -1;
        angular.forEach($scope.cart,function (cart,index) {
            if (item.id == cart.id){
                removeIndex = index
                return;
            }
        })
        return removeIndex;
    }
    $scope.$watch("cart",function (newValue,oldValue) {
        angular.forEach(newValue,function (item,index) {
            if (item.quantity < 1){
                var returnKey = confirm("是否从购物车中删除该产品");
                if (returnKey){
                    $scope.remove(item);
                }else {
                    item.quantity = oldValue[index].quantity
                }
            }
        })
    },true)
    $scope.remove = function(item){
        var removeIndex = find(item);
        if (removeIndex != -1){
            $scope.cart.splice(removeIndex,1);
        }
    }
    $scope.add = function(item){
        item.quantity++;
    }
    $scope.reduce = function(item){
        var quantity = item.quantity;
        if (quantity > 1){
            item.quantity--;
        }else if(quantity == 1){
            var returnKey = confirm("是否从购物车中删除该产品");
            if (returnKey){
                $scope.remove(item);
            }
        }
    }
}