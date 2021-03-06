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

    <title>教师信息</title>

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
                <a href="teacherInfo" class="simple-text">
                    ${teacherInfo.teacherName}
                </a>
            </div>

            <ul class="nav">

                <li class="active">
                    <a href="teacherInfo">
                        <i class="ti-user"></i>
                        <p>教师信息</p>
                    </a>
                </li>
                <li>
                    <a href="teacherCourseInfo">
                        <i class="ti-view-list-alt"></i>
                        <p>课程信息</p>
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
                    <a class="navbar-brand" href="#">基本信息</a>
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
                    <div class="col-lg-4 col-md-5">
                        <div class="card card-user">
                            <div class="image">
                                <img src="assets/img/background.jpg" alt="..."/>
                            </div>
                            <div class="content">
                                <div class="author">
                                    <img class="avatar border-white" src="assets/img/faces/face-2.jpg" alt="..."/>
                                    <h4 class="title">${teacherInfo.teacherName}<br />
                                        <a href="#"><small>${teacherInfo.teacherEmail}</small></a>
                                    </h4>
                                </div>
                                <div class="author">
                                    <img class="avatar border-white" id="avatar" src="assets/img/faces/face-2.jpg"
                                         alt="..." onclick="changeAvatar(this)" style="cursor: pointer"/>
                                    <h4 class="title">${student.studentName}<br />
                                        <a href="#"><small>${student.studentEmail}</small></a>
                                    </h4>
                                </div>
                                <div class="mask"></div>
                                <form class="ImgPanel" style="display:none;" id="ImgForm" action="ImageUpload"
                                      method="post" enctype="multipart/form-data">
                                    <span id="msg"></span>
                                    <input type="hidden" name="lx" value="1">
                                    <a class="form-control" style="margin-bottom: 5px;text-align: center;">
                                        <input style="opacity: 0;position:absolute;" type="file" name="file"/>选择图片
                                    </a>
                                    <input type="submit" value="头像上传" class="form-control" id="uploadImg"/>
                                    <input id="cancel" type="button" class="form-control" value="取消"/>
                                </form>
                                <p class="description text-center">
                                    ${teacherInfo.teacherName}
                                </p>
                            </div>
                            <hr>
                            <div class="text-center">
                                <div class="row">
                                    <div class="col-md-3 col-md-offset-1">
                                        <h5>学院<br /><small>${teacherInfo.teacherDepartment}</small></h5>
                                    </div>
                                    <div class="col-md-4">
                                        <h5>职称<br /><small>${teacherInfo.teacherDegree}</small></h5>
                                    </div>
                                    <div class="col-md-3">
                                        <h5>办公室<br /><small>${teacherInfo.teacherOffice}</small></h5>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="card">
                            <div class="header">
                                <h4 class="title">Team Members</h4>
                            </div>
                            <div class="content">
                                <ul class="list-unstyled team-members">
                                    <li>
                                        <div class="row">
                                            <div class="col-xs-3">
                                                <div class="avatar">
                                                    <img src="assets/img/faces/face-0.jpg" alt="Circle Image" class="img-circle img-no-padding img-responsive">
                                                </div>
                                            </div>
                                            <div class="col-xs-6">
                                                DJ Khaled
                                                <br />
                                                <span class="text-muted"><small>Offline</small></span>
                                            </div>

                                            <div class="col-xs-3 text-right">
                                                <btn class="btn btn-sm btn-success btn-icon"><i class="fa fa-envelope"></i></btn>
                                            </div>
                                        </div>
                                    </li>
                                    <li>
                                        <div class="row">
                                            <div class="col-xs-3">
                                                <div class="avatar">
                                                    <img src="assets/img/faces/face-1.jpg" alt="Circle Image" class="img-circle img-no-padding img-responsive">
                                                </div>
                                            </div>
                                            <div class="col-xs-6">
                                                Creative Tim
                                                <br />
                                                <span class="text-success"><small>Available</small></span>
                                            </div>

                                            <div class="col-xs-3 text-right">
                                                <btn class="btn btn-sm btn-success btn-icon"><i class="fa fa-envelope"></i></btn>
                                            </div>
                                        </div>
                                    </li>
                                    <li>
                                        <div class="row">
                                            <div class="col-xs-3">
                                                <div class="avatar">
                                                    <img src="assets/img/faces/face-3.jpg" alt="Circle Image" class="img-circle img-no-padding img-responsive">
                                                </div>
                                            </div>
                                            <div class="col-xs-6">
                                                Flume
                                                <br />
                                                <span class="text-danger"><small>Busy</small></span>
                                            </div>

                                            <div class="col-xs-3 text-right">
                                                <btn class="btn btn-sm btn-success btn-icon"><i class="fa fa-envelope"></i></btn>
                                            </div>
                                        </div>
                                    </li>
                                </ul>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-8 col-md-7">
                        <div class="card">
                            <div class="header">
                                <h4 class="title">信息详情</h4>
                            </div>
                            <div class="content">
                                <form>
                                    <div class="row">
                                        <div class="col-md-4">
                                            <div class="form-group">
                                                <label>教师编号</label>
                                                <input type="text" class="form-control border-input" disabled placeholder="id" value="${teacherInfo.teacherCount}">
                                            </div>
                                        </div>
                                        <div class="col-md-4">
                                            <div class="form-group">
                                                <label>姓名</label>
                                                <input type="text" class="form-control border-input " name="teacherEmail" placeholder="Username" value="${teacherInfo.teacherName}">
                                            </div>
                                        </div>
                                        <div class="col-md-4">
                                            <div class="form-group">
                                                <label for="exampleInputEmail1">邮箱</label>
                                                <input type="email" class="form-control border-input " name="studentEmail" placeholder="Email" value="${teacherInfo.teacherEmail}">
                                            </div>
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="col-md-4">
                                            <div class="form-group">
                                                <label>民族</label>
                                                <input type="text" class="form-control border-input " name="teacherNationality" placeholder="Nationality" value="${teacherInfo.teacherNationality}">
                                            </div>
                                        </div>
                                        <div class="col-md-4">
                                            <div class="form-group">
                                                <label>性别</label>
                                                <input type="text" class="form-control border-input " name="teacherSex" placeholder="Sex" <c:if test="${teacherInfo.teacherSex==1}"> value="男"</c:if><c:if test="${teacherInfo.teacherSex==2}"> value="女"</c:if>>
                                            </div>
                                        </div>
                                        <div class="col-md-4">
                                            <div class="form-group">
                                                <label>年龄</label>
                                                <input type="text" class="form-control border-input " name="teacherAge" placeholder="age" value="${teacherInfo.teacherAge}">
                                            </div>
                                        </div>

                                    </div>

                                    <div class="row">
                                        <div class="col-md-12">
                                            <div class="form-group">
                                                <label>地址</label>
                                                <input type="text" class="form-control border-input " name="teacherAddress" placeholder="Home Address" value="${teacherInfo.teacherAddress}">
                                            </div>
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="col-md-6">
                                            <div class="form-group">
                                                <label >联系方式</label>
                                                <input type="text" class="form-control border-input " name="teacherPhone" placeholder="Phone" value="${teacherInfo.teacherPhone}">
                                            </div>
                                        </div>
                                        <div class="col-md-6">
                                            <div class="form-group">
                                                <label>入学时间</label>
                                                <input type="text" class="form-control border-input" placeholder="createTime" disabled value="${teacherInfo.teacherCreatetime}">
                                            </div>
                                        </div>

                                    </div>

                                    <div class="row">
                                        <div class="col-md-12">
                                            <div class="form-group">
                                                <label>个人介绍</label>
                                                <textarea rows="5" class="form-control border-input " name="teacherIntroduce" placeholder="Here can be your description" value="Mike">${teacherInfo.teacherIntroduce}</textarea>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="text-center">
                                        <button type="submit" class="btn btn-info btn-fill btn-wd btn-editInfo">修改信息</button>
                                    </div>
                                    <div class="clearfix"></div>
                                </form>
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
<script src="assets/js/jquery.form.js"></script>
<script type="text/javascript">
    $(function () {
        getImgStr();
    });

    function getImgStr(){
        $.ajax({
            url:'getAvatar',
            method:'post',
            data:{
                lx:1
            },
            success:function (res) {
                $('#avatar')[0].src = res;
            }
        })
    }
    $(".btn-editInfo").click(function () {
        sex=1;
        if ($("input[name='teacherSex']").val()=="女"){
            sex=2
        }
        var teacherInfo={
            teacherName:$("input[name='teacherName']").val(),
            teacherEmail:$("input[name='teacherEmail']").val(),
            teacherNationality:$("input[name='teacherNationality']").val(),
            teacherSex:sex,
            teacherAge:$("input[name='teacherAge']").val(),
            teacherAddress:$("input[name='teacherAddress']").val(),
            teacherPhone:$("input[name='teacherPhone']").val(),
            teacherIntroduce:$("textarea[name='teacherIntroduce']").text()
        }
        $.ajax({
            url:"teacherEditInfo",
            contentType:"application/json;charset=utf-8",
            processData:true,
            type:"post",
            data:JSON.stringify(teacherInfo),
            dataType:"json",
            success:function (json) {

            },
            error:function () {
                alert("信息修改失败！")
            }
        })
    })

    $('#cancel').click(function () {
        $('.mask').hide();
        $('#ImgForm').hide();
    });

    $('#uploadImg').submit(function () {
        var options = {
            target:'#msg'
        };
        $(this).ajaxSubmit(options);
    });

    function changeAvatar(obj){
        $('.mask').show();
        $('#ImgForm').show();
        getImgStr();
    }
</script>
</html>

