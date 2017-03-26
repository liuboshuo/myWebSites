/**
 * Created by ls-mac on 2017/3/26.
 */
$(function () {
    $("#nav_left_image").click(function () {
        window.history.back();
    });

    $("#forgetPassword_btn").click(function () {
        if ($("#newPwd").val() == "" || $("#newPwd").val() == null){
            return;
        }
        if ($("#newPwd").val() != $("#confirmPwd").val()){
            return;
        }
        //找回密码
    })
});