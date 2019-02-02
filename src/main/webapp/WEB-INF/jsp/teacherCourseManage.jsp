<%--
  Created by IntelliJ IDEA.
  User: yyb
  Date: 2019/1/31
  Time: 14:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fn" uri = "http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8" />
    <link rel="apple-touch-icon" sizes="76x76" href="assets/img/apple-icon.png">
    <link rel="icon" type="image/png" sizes="96x96" href="assets/img/favicon.png">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
    <title>课程列表</title>
    <meta content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0' name='viewport' />
    <meta name="viewport" content="width=device-width" />
    <link href="assets/css/bootstrap.min.css" rel="stylesheet" />
    <link href="assets/css/animate.min.css" rel="stylesheet"/>
    <link href="assets/css/paper-dashboard.css" rel="stylesheet"/>
    <link href="assets/css/demo.css" rel="stylesheet" />
    <link href="http://maxcdn.bootstrapcdn.com/font-awesome/latest/css/font-awesome.min.css" rel="stylesheet">
    <link href='https://fonts.googleapis.com/css?family=Muli:400,300' rel='stylesheet' type='text/css'>
    <link href="assets/css/themify-icons.css" rel="stylesheet">
    <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
    <script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<div>
    <!-- 模态框（Modal） -->
    <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                    <h4 class="modal-title" id="myModalLabel">课程信息</h4>
                    <div class="modal-body">
                        <form>
                            <div class="form-group">
                                <label>课程名称</label>
                                <label><c:out value="${course.courseName}"></c:out></label>
                            </div>
                            <div>
                                <label>课程详情</label>
                                <input type="text" value="${courseInfo.courseConcreteInformation}">
                            </div>
                            <div>
                                <label>课程要求</label>
                                <input type="text" value="${courseInfo.courseConcreteRequest}">
                            </div>
                            <div>
                                <label>上课教室</label>
                                <input type="text" value="${courseInfo.courseConcreteClassroom}">
                            </div>
                            <div>
                                <label>上课时间</label>
                                <input type="text" value="${courseInfo.courseConcreteTime}">
                            </div>
                        </form>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                            <button type="button" class="btn btn-primary">提交更改</button>
                        </div>
                    </div>
                </div><!-- /.modal-content -->
            </div><!-- /.modal -->
        </div>
    </div>
</div>
<div class="wrapper">
    <div class="sidebar" data-background-color="white" data-active-color="danger">
        <div class="sidebar-wrapper">
            <div class="logo">
                <a href="teacherInfo" class="simple-text">
                    ${teacher.teacherName}
                </a>
            </div>
            <ul class="nav">
                <li >
                    <a href="teacherInfo">
                        <i class="ti-user"></i>
                        <p>教师信息</p>
                    </a>
                </li>
                <li class="active">
                    <a href="teacherCourseInfo">
                        <i class="ti-view-list-alt"></i>
                        <p>课程信息</p>
                    </a>
                </li>
                <li class="active">
                    <a href="teacherCourseInfo">
                        <i class="ti-view-list-alt"></i>
                        <p>文件信息</p>
                    </a>
                </li>
            </ul>
        </div>
    </div>
    <div class="main-panel">
        <nav class="navbar navbar-default">
            <div class="container-fluid">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar bar1"></span>
                        <span class="icon-bar bar2"></span>
                        <span class="icon-bar bar3"></span>
                    </button>
                    <a class="navbar-brand" href="#">${course.courseName}</a>
                </div>
                <div class="collapse navbar-collapse">
                    <ul class="nav navbar-nav navbar-right">
                        <li>
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                                <i class="ti-panel"></i>
                                <p>Stats</p>
                            </a>
                        </li>
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                                <i class="ti-bell"></i>
                                <p class="notification">5</p>
                                <p>Notifications</p>
                                <b class="caret"></b>
                            </a>
                            <ul class="dropdown-menu">
                                <li><a href="#">Notification 1</a></li>
                                <li><a href="#">Notification 2</a></li>
                                <li><a href="#">Notification 3</a></li>
                                <li><a href="#">Notification 4</a></li>
                                <li><a href="#">Another notification</a></li>
                            </ul>
                        </li>
                        <li>
                            <a href="#">
                                <i class="ti-settings"></i>
                                <p>Settings</p>
                            </a>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>
        <div class="content">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-md-12">
                        <div class="card card-plain">
                            <div class="header">
                                <div style="border-bottom: 1px ridge #777;height: auto">
                                    <h4 class="title" style="padding-top: 28px">课程详情</h4>
                                    <div class="content table-responsive table-full-width">
                                        <table class="table table-striped">
                                            <tr>
                                                <td>课程名称</td>
                                                <td><c:out value="${course.courseName}"></c:out></td>
                                            </tr>
                                            <tr>
                                                <td>课程详情</td>
                                                <td><c:out value="${courseInfo.courseConcreteInformation}"></c:out></td>
                                            </tr>
                                            <tr>
                                                <td>课程要求</td>
                                                <td><c:out value="${courseInfo.courseConcreteRequest}"></c:out></td>
                                            </tr>
                                            <tr>
                                                <td>上课教室</td>
                                                <td><c:out value="${courseInfo.courseConcreteClassroom}"></c:out></td>
                                            </tr>
                                            <tr>
                                                <td>上课时间</td>
                                                <td><c:out value="${courseInfo.courseConcreteTime}"></c:out></td>
                                            </tr>
                                            <tr>
                                                <td>上课周时</td>
                                                <td><c:out value="${courseInfo.courseConcreteWeektime}"></c:out></td>
                                            </tr>
                                            <tr>
                                                <td>学分</td>
                                                <td><c:out value="${courseInfo.courseConcreteCredit}"></c:out></td>
                                            </tr>
                                            <tr>
                                                <td>
                                                    <!-- 按钮触发模态框 -->
                                                    <button class="btn btn-primary btn-lg" data-toggle="modal" data-target="#myModal">修改课程信息</button>
                                                </td>
                                            </tr>
                                        </table>
                                    </div>
                                </div>
                                <div style="border-bottom: 1px ridge #777;height: auto">
                                    <h4 class="title" style="padding-top: 28px">课件</h4>
                                </div>
                                <div style="border-bottom: 1px ridge #777;height: auto">
                                    <h4 class="title" style="padding-top: 28px">作业</h4>
                                    <div class="content table-responsive table-full-width">
                                        <table class="table table-striped">
                                            <thead>
                                            <th>作业名</th>
                                            <th>开始时间</th>
                                            <th>截至时间</th>
                                            <th>内容</th>
                                            <th>备注</th>
                                            <th>作业管理</th>
                                            </thead>
                                            <tbody>
                                            <c:forEach items="${homeworkList}" var="homework">
                                                <tr>
                                                    <td>${homework.homeworkTitle}</td>
                                                    <td>${homework.homeworkStarttime}</td>
                                                    <td>${homework.homeworkEndtime}</td>
                                                    <td>${homework.homeworkContent}</td>
                                                    <td>${homework.homeworkRemark}</td>
                                                    <td ><a href="/teacherCourseManage?courseConcreteId=${homework.homeworkId}">作业管理</a></td>
                                                </tr>
                                            </c:forEach>
                                            </tbody>
                                        </table>
                                    </div>
                                </div>
                                <div style="border-bottom: 1px ridge #777;height: 100px">
                                    <h4 class="title" style="padding-top: 28px">通知</h4>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <footer class="footer">
            <div class="container-fluid">

            </div>
        </footer>
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

</script>
</html>



