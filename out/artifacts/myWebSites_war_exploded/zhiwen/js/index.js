/**
 * Created by ls-mac on 2016/12/31.
 */
$(function () {

    $(".search_button").button();

    $(".question_button").button();




    $("#reg").buttonset();
    $("#birthday").datepicker();
    // $("#reg input[title]").tooltip();

    $("#reg_a").click(function () {

        $("#reg").dialog({

            autoOpen:true,
            modal:true,
            width:320,
            height:340,
            resizable:false,
            buttons:{
                "提交":function(){
                    $("#reg").dialog("destroy");
                }
            }

        });
        //d
        // $("#reg").dialog("open");



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