<%@ page language="java" import="java.util.*" pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fn" uri = "http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html lang="en">
<head>
    <meta charset="utf-8" />
    <link rel="apple-touch-icon" sizes="76x76" href="assets/img/apple-icon.png">
    <link rel="icon" type="image/png" sizes="96x96" href="assets/img/favicon.png">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />

    <title>学生信息</title>

    <meta content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0' name='viewport' />
    <meta name="viewport" content="width=device-width" />


    <!-- Bootstrap core CSS     -->
    <link href="assets/css/bootstrap.min.css" rel="stylesheet" />

    <!-- Animation library for notifications   -->
    <link href="assets/css/animate.min.css" rel="stylesheet"/>

    <!--  Paper Dashboard core CSS    -->
    <link href="assets/css/paper-dashboard.css" rel="stylesheet"/>

    <!--  CSS for Demo Purpose, don't include it in your project     -->
    <link href="assets/css/demo.css" rel="stylesheet" />

    <!--  Fonts and icons     -->
    <link href="http://maxcdn.bootstrapcdn.com/font-awesome/latest/css/font-awesome.min.css" rel="stylesheet">
    <link href='https://fonts.googleapis.com/css?family=Muli:400,300' rel='stylesheet' type='text/css'>
    <link href="assets/css/themify-icons.css" rel="stylesheet">

</head>
<body>

<div class="wrapper">
    <div class="sidebar" data-background-color="white" data-active-color="danger">

        <div class="sidebar-wrapper">
            <div class="logo">
                <a href="/studentInfo" class="simple-text">
                    管理员
                </a>
            </div>

            <ul class="nav">

                <li class="active">
                    <a href="/studentInfo">
                        <i class="ti-user"></i>
                        <p>账号管理</p>
                    </a>
                </li>
                <li>
                    <a href="/showCourse">
                        <i class="ti-view-list-alt"></i>
                        <p>课程管理</p>
                    </a>
                </li>


            </ul>
        </div>
    </div>

    <div class="main-panel">
        <div id="nav1" class="nav1 portlet-title" style="background-color: #eceaea">
            <ul class="tab-menu">
                <li > <a class="aaaa" href='/superInfo' >学生</a></li>
                <li class="active" > <a class="aaaa" href='/superTeacher'  >教师</a></li>
            </ul>
        </div>
        <div class="row">

            <div class="col-md-12">
                <div class="card card-plain">
                    <div class="header">
                        <%--<div class="addStudent">
                            <h4 class="title" style="margin-bottom: 30px">添加教师账号</h4>
                            <label style="width: 70px;float: left;height: 30px;font-size: 20px;margin-left: 20px">数目：</label>
                            <input type="text" class="form-control border-input" style="width: 100px;float: left;height: 30px;" name="studentNum"  placeholder="1">
                            <button  class="btn btn-info btn-fill btn-wd btn-addStudent" style="margin-left: 40px;height: 30px;width:150px;padding: 0px;">添加教师</button>
                        </div>--%>

                        <div class="form-group" style="margin-top: 100px">
                            <h4 class="title" style="margin-bottom: 30px">账号查询</h4>
                            <label style="width: 70px;float: left;height: 30px;font-size: 20px;">姓名：</label>
                            <input type="text" class="form-control border-input" style="width: 150px;float: left;height: 30px;" name="teacherName" placeholder="name" value="${teacherName}">
                            <label style="width: 70px;float: left;height: 30px;font-size: 20px;margin-left: 20px">方向：</label>
                            <select id="single-select1" style="width: 150px;float: left;height: 35px;" class="form-control">
                                <option>软件工程</option>
                            </select>
                            <button  class="btn btn-info btn-fill btn-wd btn-search" style="margin-left: 40px;height: 30px;width:150px;padding: 0px;">搜索</button>
                        </div>
                    </div>
                    <div class="content table-responsive table-full-width">
                        <table class="table table-bordered " style="margin-top: 30px">
                            <thead>
                            <th>工号</th>
                            <th>姓名</th>
                            <th>电话</th>
                            <th>邮箱</th>
                            <th>地址</th>
                            <th>方向</th>
                            </thead>
                            <tbody>
                            <c:forEach items="${teachers}" var="teacher">
                                <tr>
                                    <td>${teacher.teacherCount}</td>
                                    <td>${teacher.teacherName}</td>
                                    <td>${teacher.teacherPhone}</td>
                                    <td>${teacher.teacherEmail}</td>
                                    <td>${teacher.teacherAddress}</td>
                                    <td>${teacher.teacherProfessionalTitle}</td>
                                </tr>
                            </c:forEach>
                            </tbody>
                        </table>

                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
<style>
    .nav1{
        height: 70px;
        background: #878787;
    }

    .nav1 ul{
        list-style: none;
        padding-top: 20px;
        float: left;
        font-size: 14px;
    }

    .nav1 ul li{
        display: inline-block;
        height: 50px;
        line-height: 40px;
        width: 100px;
        text-align: center;
        margin-left: 30px;
        font-size: 18px;
    }

    .nav1 ul li.active{
        background: #f4f3ef;
        border-top-left-radius: 10px;
        border-top-right-radius: 10px;
    }

    .nav1 ul li a{
        color: #a79090;
    }


    .nav1 ul li.active a {
        color: #5897FB!important;
    }

    .nav1 ul li a{
        text-decoration: none;
    }
</style>
<script src="assets/js/jquery-1.10.2.js" type="text/javascript"></script>
<script src="assets/js/bootstrap.min.js" type="text/javascript"></script>
<script src="assets/js/bootstrap-checkbox-radio.js"></script>
<script src="assets/js/chartist.min.js"></script>
<script src="assets/js/bootstrap-notify.js"></script>
<script src="assets/js/paper-dashboard.js"></script>
<script src="assets/js/demo.js"></script>
<script type="text/javascript">
    $(".btn-search").click(function (){
        var teacherName=$("input[name='teacherName']").val();
        window.location.href = "/superTeacher?teacherName="+teacherName;

    })
    $(".btn-addStudent").click(function (){
        var studentNum=$("input[name='studentNum']").val();
        data1={studentNum:studentNum};
        $.ajax({
            url:"/addStudents",
            type:"get",
            data:data1,
            dataType:"json",
            success:function (json) {
                alert("添加成功!");
                window.location.href = "/superInfo";
            },
            error:function () {
            }
        })
    })
</script>
</html>

