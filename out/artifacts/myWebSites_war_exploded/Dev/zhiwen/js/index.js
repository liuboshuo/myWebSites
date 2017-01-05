/**
 * Created by ls-mac on 2016/12/31.
 */
$(function () {

    $(".search_button").button();

    $(".question_button").button();




    $("#reg").buttonset();
    $("#birthday").datepicker();
    $("#reg input[title]").tooltip();

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

    })


});