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
                    ${student.studentName}
                </a>
            </div>

            <ul class="nav">

                <li >
                    <a href="/studentInfo">
                        <i class="ti-user"></i>
                        <p>学生信息</p>
                    </a>
                </li>
                <li>
                    <a href="/showCourse">
                        <i class="ti-view-list-alt"></i>
                        <p>课程信息</p>
                    </a>
                </li>
                <li class="active">
                    <a href="/selectCourseList">
                        <i class="ti-view-list-alt"></i>
                        <p>选课列表</p>
                    </a>
                </li>

            </ul>
        </div>
    </div>

    <div class="content">
        <div class="container-fluid">
            <div class="row">
                <div class="col-md-8 col-md-offset-2">
                    <div class="card">
                        <div class="header text-center">
                            <h3 class="title">选课列表</h3>
                            <p class="category">规定时间内选择课程添加到课程列表，退课可以在课程详情中选择</p>
                            <br>
                        </div>
                        <div class="content table-responsive table-full-width table-upgrade">
                            <table class="table">
                                <thead>
                                <th>课程名</th>
                                <th class="text-center">时间</th>
                                <th class="text-center">学分</th>
                                <th class="text-center">老师</th>
                                <th  width="100px">操作</th>
                                </thead>
                                <tbody>
                                <c:forEach items="${currentCourse}" var="course">
                                    <tr>
                                        <td>${course.courseName}</td>
                                        <td>${course.courseTime}</td>
                                        <td>${course.courseCredit}</td>
                                        <td></td>
                                        <td class="text-center" width="100px" >
                                            <div class="icon-container" style="padding-top: 0px;width: 100px" >
                                                <a class="addCourse" course="${course.courseId}" ><span class="ti-check"></span></a>
                                            </div>
                                        </td>
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
<script src="assets/js/jquery-1.10.2.js" type="text/javascript"></script>
<script src="assets/js/bootstrap.min.js" type="text/javascript"></script>
<script src="assets/js/bootstrap-checkbox-radio.js"></script>
<script src="assets/js/chartist.min.js"></script>
<script src="assets/js/bootstrap-notify.js"></script>
<script src="assets/js/paper-dashboard.js"></script>
<script src="assets/js/demo.js"></script>
<script type="text/javascript">

    $(function() {
        $(".addCourse").click(function () {
            var courseId = $(this).attr("course");
            $.ajax({
                url: "/addCourse",
                type: "get",
                dataType: "json",
                data: {courseId: courseId},
                success: function () {
                    alert("选课成功！");
                    window.location.href = "/selectCourseList";
                },
                error: function () {
                }
            })
        });
    })
</script>
</html>

