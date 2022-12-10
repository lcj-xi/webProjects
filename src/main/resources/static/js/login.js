function findByNameAndPassword() {


    var username = $("#username").val();
    var password=$("#password").val();

    $.ajax(
        {
            url: "/webapi/login",
            data: {name: username,password:password},
            type: "get",
            success: function (rs) {
                if (rs.code!=0) {
                    alert("账户或密码错误！！！");
                    $("#username").val("");
                    $("#password").val("");
                } else {
                    window.location.href="/list";

                }
            },
            error: function () {
                alert("出错了！！！");

            }
        }
    )
}
