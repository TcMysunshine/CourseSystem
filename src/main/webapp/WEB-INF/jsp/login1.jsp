<%@ page language="java" import="java.util.*" pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML>
<html >
<head>
	<meta charset="utf-8" />
	<title></title>
	<link rel="stylesheet" type="text/css" href="css/login/index.css"/>
	<style type="text/css">
		body{
           background: url(img/4.jpg) no-repeat;
			background-size: 100%;
        }

	</style>
</head>
<body>
<div class="bg">
	<div class="wel">教务系统登录</div>
	<div class="user">
		<div id="yonghu" style="">用户名</div>
		<input name="logname"  type="text" name="用户"  value="" />
	</div>
	<div class="password" >
		<div id="yonghu" >密&nbsp;&nbsp;&nbsp;码</div>
		<input name="logpass" class="" type="password" name="密码" value="" />
	</div>


	<div class="role1">
		<input type="checkbox" name="role" id="student" />
		<div id="role1">
			学生
		</div>
	</div>
	<div class="role2">
	<input type="checkbox" name="role" id="teacher" />
		<div id="role1">
			教师
		</div>
	</div>
	<div class="role3">
		<input type="checkbox" name="role"  id="super" />
		<div id="role1">
			管理员
		</div>

	</div>

	<div class="rem" >
		<input type="checkbox" name="checkbox" name="" id="" value="" />
		<div id="reb">
			记住密码
		</div>
	</div>
	<div class="fg" >
		<div style="font-size: 11px;margin-top: 11px;">
			<a style="font-size: 11px;" href="#">忘记密码？</a>
		</div>
	</div>
	<input class="btn submit" type="button" name="登录" value="登录" />
</div>
</body>
<script src="js/jquery-3.3.1.js"></script>
<script src="js/jquery.cookie.js"></script>
<script type="text/javascript">
    $(function () {
        if ($.cookie("username") != "") {

            $("input[name='username']").val($.cookie("username"));
            $("input[name='password']").val($.cookie("password"));
            $("input[name='checkbox']").attr("checked", true);
        } else {
            $("input[name='checkbox']").attr("checked", false);
        }
        $("input[name='role']").attr("checked", false);
        $("#student").attr("checked", true);
        $("input[name='role']").each(function(){
            $(this).click(function(){
                if($(this).is(':checked')){
                    $("input[name='role']").prop('checked', false);
                    $(this).prop('checked',true);
                }
            });
        });
    });
    $(".submit").click(function () {
        var username = $("input[name='logname']").val();
        var password = $("input[name='logpass']").val();
        var url="";
        var href="";
        if ($("#student").is(':checked')){
            url="studentLogin/confirm";
            href='studentInfo';
            data1={
                username: username,
                password: password,
            }
        }else if($("#teacher").is(':checked')){
            url="/teacherLogin.do";
            href='teacherInfo';
            data1={
                teacherCount: username,
                teacherPass: password,
            }
        }else if($("#super").is(':checked')){
            url="superLogin/confirm";
            href='superInfo';
        }
        if ( username == ""|| password == "") {
            alert("用户名或者密码不能为空！");
        } else {
            $.ajax({
                url:url ,
                type: "get",
                dataType: "json",
                data: data1,
				success:function (data) {
					var newData=eval(data);
                    window.location.href = href;
                },
				error:function () {
					alert("用户名和密码错误！")
                }
                
            });
        }

	})
</script>
</html>