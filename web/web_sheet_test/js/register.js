

$(function () {
    $("#nav_left_image").click(function () {
        window.history.back();
    });

    var applicationThemeColor = "darkorange";

    //许可协议点击
    $("#look_agreement").click(function () {
        window.location.href = 'license.html';
    });
    // 允许许可协议事件的点击
    $("#checkbox").click(function () {
        alert($(this).attr("src"));
        var selectname = "../images/icon_reg_check_on@2x.png";
        var unselectname = "../images/icon_reg_check@2x.png";
        if($(this).attr("src").indexOf(selectname) != -1){
            $(this).attr("src",unselectname);
            $("#register_btn").css({
                background:"#eeeeee"
            });
            $("#register_btn").attr("disabled",true);
        }else{
            $(this).attr("src",selectname);
            $("#register_btn").css({
                background:applicationThemeColor
            });
            $("#register_btn").attr("disabled",false);
        }
    });

    //注册
    $("#register_btn").click(function () {
       //注册
    });
});