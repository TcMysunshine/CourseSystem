<%@ page language="java" pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html lang="en">
<head>
    <meta charset="utf-8"/>
    <link rel="apple-touch-icon" sizes="76x76" href="assets/img/apple-icon.png">
    <link rel="icon" type="image/png" sizes="96x96" href="assets/img/favicon.png">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"/>

    <title>学生信息</title>

    <meta content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0' name='viewport'/>
    <meta name="viewport" content="width=device-width"/>


    <!-- Bootstrap core CSS     -->
    <link href="assets/css/bootstrap.min.css" rel="stylesheet"/>

    <!-- Animation library for notifications   -->
    <link href="assets/css/animate.min.css" rel="stylesheet"/>

    <!--  Paper Dashboard core CSS    -->
    <link href="assets/css/paper-dashboard.css" rel="stylesheet"/>

    <!--  CSS for Demo Purpose, don't include it in your project     -->
    <link href="assets/css/demo.css" rel="stylesheet"/>

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
                <a href="superInfo" class="simple-text">
                    管理员
                </a>
            </div>

            <ul class="nav">

                <li>
                    <a href="superInfo">
                        <i class="ti-user"></i>
                        <p>账号管理</p>
                    </a>
                </li>
                <li class="active">
                    <a href="courseManage">
                        <i class="ti-view-list-alt"></i>
                        <p>课程管理</p>
                    </a>
                </li>


            </ul>
        </div>
    </div>

    <div class="main-panel">

        <div class="row">
            <div class="col-md-12">
                <div class="card card-plain">
                    <div class="header">

                    </div>

                    <div class="content table-responsive table-full-width">
                        <h4 class="title" style="margin-bottom: 30px">本学年课程</h4>
                        <button class="btn btn-info btn-fill btn-wd btn-addCourseInfo"
                                style="margin-left: 40px;height: 30px;width:150px;padding: 0px;">添加课程
                        </button>
                        <table class="table table-bordered " style="margin-top: 30px">
                            <thead>
                            <th>课程名称</th>
                            <th>课程介绍</th>
                            <th>课程要求</th>
                            <th>学分</th>
                            <th>教室</th>
                            <th>时间</th>
                            <th>老师</th>
                            </thead>
                            <tbody>
                            <c:forEach items="${courses}" var="course">
                                <tr>
                                    <td>${course.courseName}</td>
                                    <td>${course.courseConcreteInformation}</td>
                                    <td>${course.courseConcreteRequest}</td>
                                    <td>${course.courseConcreteCredit}</td>
                                    <td>${course.courseConcreteClassroom}</td>
                                    <td>${course.courseConcreteTime}</td>
                                    <td>${course.teacherName}</td>
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

<script src="assets/js/jquery-1.8.2.min.js" type="text/javascript"></script>
<script src="assets/js/layer.js" type="text/javascript"></script>
<script type="text/javascript">
    $('.btn-addCourseInfo').on('click', function () {

        $.ajax({
            url: "showAddCourse",
            type: "get",
            dataType: "html",
            success: function (html) {
                layer.open({
                    type: 1,
                    title: '添加课程',
                    maxmin: true,
                    area: ['800px', '800px'],
                    content: html,
                });
            },
            error: function () {
            }
        })

    });

</script>

</html>

