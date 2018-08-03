$("#loginForm").hide();
$("#registrationForm").hide();
$("#shadowBack").hide();

$(function () {
    $(".logInBtn").on('click', function () {
        $("#registrationForm").fadeOut(300);
        $("#loginForm").fadeToggle(500);
        $("#shadowBack").fadeIn(500);
    });
});

$(function () {
    $(".regBtn").on("click", function () {
        $("#loginForm").fadeOut(300);
        $("#registrationForm").fadeToggle(500);
        $("#shadowBack").fadeIn(500);
    });
});

$(function () {
    $("#shadowBack").on("click", function () {
        $("#loginForm").fadeOut(500);
        $("#registrationForm").fadeOut(500);
        $("#shadowBack").fadeOut(500);
    });
});