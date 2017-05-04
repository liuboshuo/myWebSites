/**
 * Created by liushuo on 17/3/28.
 */
$(function () {
    //底部按钮点击
    $(".footer_item").click(function () {
        var url = $(this).attr("load_html");
        $("#content").load(url);
        $(this).siblings().css("color","#333");
        $(this).css("color","darkorange");
    });
    $("div .footer_item")[0].click();
});