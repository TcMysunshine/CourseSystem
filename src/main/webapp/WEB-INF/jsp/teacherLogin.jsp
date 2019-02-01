<%@ page language="java" import="java.util.*" pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML>
<html >
<head>
<meta charset="UTF-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge"> 
<meta name="viewport" content="width=device-width, initial-scale=1"> 
<title>login</title>
<link rel="stylesheet" type="text/css" href="css/login/normalize.css" />
<link rel="stylesheet" type="text/css" href="css/login/demo.css" />
<!--必要样式-->
<link rel="stylesheet" type="text/css" href="css/login/component.css" />
<!--[if IE]>
<script src="js/login/html5.js"></script>
<![endif]-->
</head>
<body>
		<div class="container demo-1">
			<div class="content">
				<div id="large-header" class="large-header">
					<canvas id="demo-canvas"></canvas>
					<div class="logo_box">
						<h3>教务系统教师登录</h3>
						<form action="#" name="f" method="post">
							<div class="input_outer">
								<span class="u_user"></span>
								<input name="logname" class="text" style="color: #FFFFFF !important" type="text" placeholder="请输入账户">
							</div>
							<div class="input_outer">
								<span class="us_uer"></span>
								<input name="logpass" class="text" style="color: #FFFFFF !important; position:absolute; z-index:100;"value="" type="password" placeholder="请输入密码">
							</div>
							<div class="mb2"><a class="act-but submit" href="javascript:;" style="color: #FFFFFF">登录</a></div>
						</form>
					</div>
				</div>
			</div>
		</div><!-- /container -->

	</body>
<script src="js/login/TweenLite.min.js"></script>
<script src="js/login/EasePack.min.js"></script>
<script src="js/login/rAF.js"></script>
<script src="js/login/demo-1.js"></script>
<script src="js/jquery-3.3.1.js"></script>
<script src="js/jquery.cookie.js"></script>
<script type="text/javascript">
    $(function () {
        if ($.cookie("username") != "") {

            $("input[name='username']").val($.cookie("username"));
            $("input[name='password']").val($.cookie("password"));
            $("input[type='checkbox']").attr("checked", true);
        } else {
            $("input[type='checkbox']").attr("checked", false);
        }
    });
    $(".submit").click(function () {
        var username = $("input[name='logname']").val();
        var password = $("input[name='logpass']").val();
        if ( username == ""|| password == "") {
            alert("用户名或者密码不能为空！");

</script>
</html>