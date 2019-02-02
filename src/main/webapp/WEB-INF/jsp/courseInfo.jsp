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
</head>
<body>
<div class="wrapper">
    <div class="sidebar" data-background-color="white" data-active-color="danger">
        <div class="sidebar-wrapper">
            <div class="logo">
                <a href="studentInfo" class="simple-text">
                    ${student.studentName}
                </a>
            </div>
            <ul class="nav">
                <li >
                    <a href="studentInfo">
                        <i class="ti-user"></i>
                        <p>学生信息</p>
                    </a>
                </li>
                <li class="active">
                    <a href="showCourse">
                        <i class="ti-view-list-alt"></i>
                        <p>课程信息</p>
                    </a>
                </li>
                <li>
                    <a href="selectCourseList">
                        <i class="ti-view-list-alt"></i>
                        <p>选课列表</p>
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
                    <%--<div class="col-md-12">
                        <div class="card">
                            <div class="header">

                            </div>
                            <div class="content table-responsive table-full-width">
                                <table class="table table-striped">
                                    <thead>
                                    <th>课程编号</th>
                                    <th>课程名</th>
                                    <th>课程时间</th>
                                    <th>课程地点</th>
                                    <th>课程学分</th>
                                    <th>课程介绍</th>
                                    </thead>
                                    <tbody>
                                    <c:forEach items="${courselist}" var="course">
                                        <tr>
                                            <td>${course.courseEncoding}</td>
                                            <td>${course.courseName}</td>
                                            <td>${course.courseTime}</td>
                                            <td>${course.courseClassroom}</td>
                                            <td>${course.courseCredit}</td>
                                            <td>${course.courseInfomation}</td>
                                        </tr>
                                    </c:forEach>
                                    </tbody>
                                </table>

                            </div>
                        </div>
                    </div>--%>

                    <div class="col-md-12">
                        <div class="card card-plain">
                            <div class="header">
                                    <div style="border-bottom: 1px ridge #777; ">
                                        <h4 class="title" style="padding-top: 28px">课件</h4>
                                        <div class="card" style="margin-top: 18px">
                                            <div class="content">
                                                <div class="row">
                                                    <div class="col-xs-5">
                                                        <span class="ti-uppercase" style="margin: 8px"></span><a href="courseware/课件2.pdf" style="font-size: 18px; margin: 8px" target="view_window">课件1</a><br/>
                                                        <span class="ti-uppercase" style="margin: 8px"></span><a href="courseware/课件2.pdf" style="font-size: 18px; margin: 8px" target="view_window">课件2</a><br/>
                                                        <span class="ti-uppercase" style="margin: 8px"></span><a href="courseware/课件2.pdf" style="font-size: 18px; margin: 8px" target="view_window">课件3</a><br/>
                                                        <span class="ti-uppercase"style="margin: 8px"></span><a href="courseware/课件2.pdf" style="font-size: 18px; margin: 8px" target="view_window">课件4</a><br/>
                                                    </div>
                                                    <div class="col-xs-7">

                                                    </div>
                                                </div>
                                                <div class="footer">
                                                    <hr />
                                                    <div class="stats">
                                                        <i class="ti-reload"></i> Updated now
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                <div style="border-bottom: 1px ridge #777;height: 100px">
                                    <h4 class="title" style="padding-top: 28px">作业</h4>
                                </div>
                                <%--<hr style="height:1px;width:40%;border:none;border-top:5px ridge #777;margin-left: 0px" />--%>
                                    <div style="border-bottom: 1px ridge #777;height: 100px">
                                        <h4 class="title" style="padding-top: 28px">通知</h4>
                                    </div>
                                <div class="card" style="margin-top: 18px">
                                    <div class="content">
                                        <div class="row">
                                            <div class="alert alert-info">
                                                <span>This is a plain notification</span>
                                            </div>
                                            <div class="col-xs-7">

                                            </div>
                                        </div>
                                        <div class="footer">
                                            <hr />
                                            <div class="stats">
                                                <i class="ti-reload"></i> Updated now
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <%--
                                <p class="category">点击查看课程详情</p>--%>
                            </div>
                            <div class="content table-responsive table-full-width">
                                <table class="table table-bordered " style="margin-top: 30px">
                                    <thead>
                                    <th></th>
                                    <th>星期一</th>
                                    <th>星期二</th>
                                    <th>星期三</th>
                                    <th>星期四</th>
                                    <th>星期五</th>
                                    <th>星期六</th>
                                    <th>星期日</th>
                                    </thead>
                                    <%--<tbody>
                                    <tr>
                                        <td rowspan="4">上午</td>
                                        <td id="Mon-one"></td>
                                        <td id="Tues-one"></td>
                                        <td id="Wed-one"></td>
                                        <td id="Thurs-one"></td>
                                        <td id="Fri-one"></td>
                                        <td id="Sat-one"></td>
                                        <td id="Sun-one"></td>
                                    </tr>
                                    <tr>
                                        <td id="Mon-Two"></td>
                                        <td id="Tues-Two"></td>
                                        <td id="Wed-Two"></td>
                                        <td id="Thurs-Two"></td>
                                        <td id="Fri-Two"></td>
                                        <td id="Sat-Two"></td>
                                        <td id="Sun-Two"></td>
                                    </tr>
                                    <tr>
                                        <td id="Mon-Three"></td>
                                        <td id="Tues-Three"></td>
                                        <td id="Wed-Three"></td>
                                        <td id="Thurs-Three"></td>
                                        <td id="Fri-Three"></td>
                                        <td id="Sat-Three"></td>
                                        <td id="Sun-Three"></td>
                                    </tr>
                                    <tr>
                                        <td id="Mon-four"></td>
                                        <td id="Tues-four"></td>
                                        <td id="Wed-four"></td>
                                        <td id="Thurs-four"></td>
                                        <td id="Fri-four"></td>
                                        <td id="Sat-four"></td>
                                        <td id="Sun-four"></td>
                                    </tr>
                                    <tr>
                                        <td rowspan="4">下午</td>
                                        <td id="Mon-five"></td>
                                        <td id="Tues-five"></td>
                                        <td id="Wed-five"></td>
                                        <td id="Thurs-five"></td>
                                        <td id="Fri-five"></td>
                                        <td id="Sat-five"></td>
                                        <td id="Sun-five"></td>
                                    </tr>
                                    <tr>
                                        <td id="Mon-six"></td>
                                        <td id="Tues-six"></td>
                                        <td id="Wed-six"></td>
                                        <td id="Thurs-six"></td>
                                        <td id="Fri-six"></td>
                                        <td id="Sat-six"></td>
                                        <td id="Sun-six"></td>
                                    </tr>
                                    <tr>
                                        <td id="Mon-seven"></td>
                                        <td id="Tues-seven"></td>
                                        <td id="Wed-seven"></td>
                                        <td id="Thurs-seven"></td>
                                        <td id="Fri-seven"></td>
                                        <td id="Sat-seven"></td>
                                        <td id="Sun-seven"></td>
                                    </tr>
                                    <tr>
                                        <td id="Mon-eight"></td>
                                        <td id="Tues-eight"></td>
                                        <td id="Wed-eight"></td>
                                        <td id="Thurs-eight"></td>
                                        <td id="Fri-eight"></td>
                                        <td id="Sat-eight"></td>
                                        <td id="Sun-eight"></td>
                                    </tr>
                                    <tr >
                                        <td rowspan="3">晚上</td>
                                        <td id="Mon-nine"></td>
                                        <td id="Tues-nine"></td>
                                        <td id="Wed-nine"></td>
                                        <td id="Thurs-nine"></td>
                                        <td id="Fri-nine"></td>
                                        <td id="Sat-nine"></td>
                                        <td id="Sun-nine"></td>
                                    </tr>
                                    <tr >
                                        <td id="Mon-ten"></td>
                                        <td id="Tues-ten"></td>
                                        <td id="Wed-ten"></td>
                                        <td id="Thurs-ten"></td>
                                        <td id="Fri-ten"></td>
                                        <td id="Sat-ten"></td>
                                        <td id="Sun-ten"></td>
                                    </tr>
                                    <tr >
                                        <td id="Mon-eleven"></td>
                                        <td id="Tues-eleven"></td>
                                        <td id="Wed-eleven"></td>
                                        <td id="Thurs-eleven"></td>
                                        <td id="Fri-eleven"></td>
                                        <td id="Sat-eleven"></td>
                                        <td id="Sun-eleven"></td>
                                    </tr>
                                    </tbody>--%>
                                    <tbody>
                                    <tr>
                                        <td rowspan="2" height="200px">上午</td>
                                        <td rowspan="1" height="100px" id="Mon-one"><a class="courseIntro" href="courseInfo?courseId=${MonOne.courseId}">${MonOne.courseIntro}</a></td>
                                        <td rowspan="1" height="100px" id="Tues-one"><a class="courseIntro" href="courseInfo?courseId=${TuesOne.courseId}">${TuesOne.courseIntro}</a></td>
                                        <td rowspan="1" height="100px" id="Wed-one"><a class="courseIntro" href="courseInfo?courseId=${WedOne.courseId}">${WedOne.courseIntro}</a></td>
                                        <td rowspan="1" height="100px" id="Thurs-one"><a class="courseIntro" href="/courseInfo?courseId=${ThursOne.courseId}">${ThursOne.courseIntro}</a></td>
                                        <td rowspan="1" height="100px" id="Fri-one"><a class="courseIntro" href="courseInfo?courseId=${FriOne.courseId}">${FriOne.courseIntro}</a></td>
                                        <td rowspan="1" height="100px" id="Sat-one"><a class="courseIntro" href="courseInfo?courseId=${SatOne.courseId}">${SatOne.courseIntro}</a></td>
                                        <td rowspan="1" height="100px" id="Sun-one"><a class="courseIntro" href="courseInfo?courseId=${SunOne.courseId}">${SunOne.courseIntro}</a></td>
                                    </tr>
                                    <tr>
                                        <td rowspan="1" id="Mon-Three"><a class="courseIntro" href="courseInfo?courseId=${MonThree.courseId}">${MonThree.courseIntro}</a></td>
                                        <td rowspan="1" id="Tues-Three"><a class="courseIntro" href="courseInfo?courseId=${TuesThree.courseId}">${TuesThree.courseIntro}</a></td>
                                        <td rowspan="1" id="Wed-Three"><a class="courseIntro" href="courseInfo?courseId=${WedThree.courseId}">${WedThree.courseIntro}</a></td>
                                        <td rowspan="1" id="Thurs-Three"><a class="courseIntro" href="courseInfo?courseId=${ThursThree.courseId}">${ThursThree.courseIntro}</a></td>
                                        <td rowspan="1" id="Fri-Three"><a class="courseIntro" href="courseInfo?courseId=${FriThree.courseId}">${FriThree.courseIntro}</a></td>
                                        <td rowspan="1" id="Sat-Three"><a class="courseIntro" href="courseInfo?courseId=${SatThree.courseId}">${SatThree.courseIntro}</a></td>
                                        <td rowspan="1" id="Sun-Three"><a class="courseIntro" href="courseInfo?courseId=${SunThree.courseId}">${SunThree.courseIntro}</a></td>
                                    </tr>
                                    <tr>
                                        <td rowspan="2" height="200px">下午</td>
                                        <td rowspan="1" height="100px" id="Mon-five"><a class="courseIntro" href="courseInfo?courseId=${MonFive.courseId}">${MonFive.courseIntro}</a></td>
                                        <td rowspan="1" height="100px" id="Tues-five"><a class="courseIntro" href="courseInfo?courseId=${TuesFive.courseId}">${TuesFive.courseIntro}</a></td>
                                        <td rowspan="1"  height="100px" id="Wed-five"><a class="courseIntro" href="courseInfo?courseId=${WedFive.courseId}">${WedFive.courseIntro}</a></td>
                                        <td rowspan="1" height="100px" id="Thurs-five"><a class="courseIntro" href="courseInfo?courseId=${ThursFive.courseId}">${ThursFive.courseIntro}</a></td>
                                        <td rowspan="1" height="100px" id="Fri-five"><a class="courseIntro" href="courseInfo?courseId=${FriFive.courseId}">${FriFive.courseIntro}</a></td>
                                        <td rowspan="1" height="100px" id="Sat-five"><a class="courseIntro" href="courseInfo?courseId=${SatFive.courseId}">${SatFive.courseIntro}</a></td>
                                        <td rowspan="1" height="100px" id="Sun-five"><a class="courseIntro" href="courseInfo?courseId=${SunFive.courseId}">${SunFive.courseIntro}</a></td>
                                    </tr>
                                    <tr>
                                        <td rowspan="1" id="Mon-seven"><a class="courseIntro" href="courseInfo?courseId=${MonSeven.courseId}">${MonSeven.courseIntro}</a></td>
                                        <td rowspan="1" id="Tues-seven"><a class="courseIntro" href="courseInfo?courseId=${TuesSeven.courseId}">${TuesSeven.courseIntro}</a></td>
                                        <td rowspan="1" id="Wed-seven"><a class="courseIntro" href="courseInfo?courseId=${WedSeven.courseId}">${WedSeven.courseIntro}</a></td>
                                        <td rowspan="1" id="Thurs-seven"><a class="courseIntro" href="courseInfo?courseId=${ThursSeven.courseId}">${ThursSeven.courseIntro}</a></td>
                                        <td rowspan="1" id="Fri-seven"><a class="courseIntro" href="courseInfo?courseId=${FriSeven.courseId}">${FriSeven.courseIntro}</a></td>
                                        <td rowspan="1" id="Sat-seven"><a class="courseIntro" href="courseInfo?courseId=${SatSeven.courseId}">${SatSeven.courseIntro}</a></td>
                                        <td rowspan="1" id="Sun-seven"><a class="courseIntro" href="courseInfo?courseId=${SunSeven.courseId}">${SunSeven.courseIntro}</a></td>
                                    </tr>
                                    <tr >
                                        <td rowspan="2" height="100px">晚上</td>
                                        <td rowspan="2" id="Mon-nine"><a class="courseIntro" href="courseInfo?courseId=${MonNine.courseId}">${MonNine.courseIntro}</a></td>
                                        <td rowspan="2" id="Tues-nine"><a class="courseIntro" href="courseInfo?courseId=${TuesNine.courseId}">${TuesNine.courseIntro}</a></td>
                                        <td rowspan="2" id="Wed-nine"><a class="courseIntro" href="courseInfo?courseId=${WedNine.courseId}">${WedNine.courseIntro}</a></td>
                                        <td rowspan="2" id="Thurs-nine"><a class="courseIntro" href="courseInfo?courseId=${ThursNine.courseId}">${ThursNine.courseIntro}</a></td>
                                        <td rowspan="2" id="Fri-nine"><a class="courseIntro" href="courseInfo?courseId=${FriNine.courseId}">${FriNine.courseIntro}</a></td>
                                        <td rowspan="2" id="Sat-nine"><a class="courseIntro" href="courseInfo?courseId=${SatNine.courseId}">${SatNine.courseIntro}</a></td>
                                        <td rowspan="2" id="Sun-nine"><a class="courseIntro" href="courseInfo?courseId=${SunNine.courseId}">${SunNine.courseIntro}</a></td>
                                    </tr>

                                    </tbody>
                                </table>
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


