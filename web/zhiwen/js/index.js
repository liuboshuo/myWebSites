/**
 * Created by ls-mac on 2016/12/31.
 */
$(function () {

    $(".search_button").button();

    $(".question_button").button();



    $("#reg_a").click(function () {


        $("#reg").buttonset();


        $("#reg").dialog({

            autoOpen:true,
            modal:true,
            width:320,
            height:340,
            resizable:false,
            buttons:{
                "提交":function(){
                    $("#reg").submit();
                }
            }
        });

        $("#reg").validate({
            submitHandler: function () {

                alert("验证成功");

            },

            showErrors: function (errorMap , errorList) {
                var errors = this.numberOfInvalids();
                if (errors > 0){
                    $("#reg").dialog('option',"height",errors * 20 + 340);
                }else {
                    $("#reg").dialog('option',"height",340);
                }
                this.defaultShowErrors();
            },

            highlight:function (element,errorClass) {
                $(element).css("border","1px solid #630");
            },
            unhighlight:function (element,errorClass) {
                $(element).css("border","1px solid #ccc");
                $(element).parent().find("span").html('&nbsp').addClass("succ");
            },
            errorLabelContainer:'ol.reg_error',
            wrapper:'li',

            rules:{
                user:{
                    required:true,
                    minlength:2
                },
                pass:{
                    required:true,
                    minlength:6
                },
                email:{
                    required:true,
                    email:true
                },
                birthday:{
                    date:true
                }
            },

            messages:{
                user:{
                    required:"账号不可以为空",
                    minlength:jQuery.format("账号不可以小于{0}位")
                },
                pass:{
                    required:"密码不可以为空",
                    minlength:jQuery.format("密码不可以小于{0}位")
                },
                email:{
                    required:"邮箱不可以为空",
                    minlength:"请输入正确邮箱地址"
                }
            }
        });

        $("#birthday").datepicker({
            dateFormat:"yy-mm-dd",
            // dayNames:["星期日","星期一","星期二","星期三","星期四","星期五","星期六"],
            // dayNamesShort:["星期日","星期一","星期二","星期三","星期四","星期五","星期六"],

            dayNamesMin:["日","一","二","三","四","五","六"],
            monthNames:["一月","二月","三月","四月","五月","六月","七月","八月","九月","十月","十一月","十二月"],
            monthNamesShort:["一","二","三","四","五","六","七","八","九","十","十一","十二"],

            // appendText:"日历",
            // showWeek:true,
            // weekHeader:"周",

            firstDay:1,

            changeMonth: true,
            changeYear: true,
            prevText:"上一月",
            nextText:"下一月",
            yearSuffix:"年",
            showMonthAfterYear:true,

            maxDate:0,
            minDate:-8000,//优先级最高
            hideIfNoPrevNext: true,
            yearRange:"1950:2020", // 优先级低
        });


        $("#email").autocomplete({
            delay:0,
            autoFocus: true,
            source: function(request,response) {

                var hosts = ["qq.com","163.com","sina.com.cn","gmail.com","hotmail.com"];
                var term = request.term;
                var name = term;
                var host = "";
                var ix = name.indexOf("@");
                var result = [];
                if (ix > -1){
                    name = term.slice(0,ix);
                    host = term.slice(ix + 1);
                }
                if (name){
                    var findHosts = [];
                    if (host){
                        findHosts = $.grep(hosts,function(value){
                            return value.indexOf(host) > -1;
                        });
                    }else {
                        findHosts = hosts;
                    }
                    var findHostRes = $.map(findHosts,function(value){
                        return name + "@" + value;
                    });
                    result = findHostRes;
                }
                response(result);
            }
        });

    })



});