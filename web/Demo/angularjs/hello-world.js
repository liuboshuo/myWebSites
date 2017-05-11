/**
 * Created by ls-mac on 2017/5/11.
 */
module.exports = function (ngModule) {
    ngModule.directive('hell-world',helloWorldFn);
    require('./hello-world.css');
    function helloWorldFn() {
        return {
            restrict:'E',
            scope:{},
            templateUrl:'./hello-world.html',
            controllerAs:'vm',
            controller:function () {
                var vm = this;
                vm.greeting = '你好';
            }
        }
    }
}