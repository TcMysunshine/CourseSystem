<%@ page language="java" import="java.util.*" pageEncoding="utf-8" %>
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
                <a href="studentInfo" class="simple-text">
                    ${student.studentName}
                </a>
            </div>

            <ul class="nav">

                <li class="active">
                    <a href="studentInfo">
                        <i class="ti-user"></i>
                        <p>学生信息</p>
                    </a>
                </li>
                <li>
                    <a href="showCourse">
                        <i class="ti-view-list-alt"></i>
                        <p>课程信息</p>
                    </a>
                </li>
                <li>
                    <a href=selectCourseList">
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
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                                <i class="ti-settings"></i>
                                <p>Settings</p>
                            </a>
                            <ul class="dropdown-menu">
                                <li><a href="#" onclick="updatePass()">修改密码</a></li>
                                <li><a href="#" onclick="logout()">退出登录</a></li>
                            </ul>
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
                                    <img class="avatar border-white" id="avatar" src="assets/img/faces/face-2.jpg"
                                         alt="..." onclick="changeAvatar(this)" style="cursor: pointer"/>
                                    <h4 class="title">${student.studentName}<br/>
                                        <a href="#">
                                            <small>${student.studentEmail}</small>
                                        </a>
                                    </h4>
                                </div>
                                <div class="mask"></div>
                                <form class="ImgPanel" style="display:none;" id="ImgForm" action="ImageUpload"
                                      method="post" enctype="multipart/form-data">
                                    <span id="msg"></span>
                                    <input type="hidden" name="lx" value="0">
                                    <a class="form-control" style="margin-bottom: 5px;text-align: center;">
                                        <input style="opacity: 0;position:absolute;" type="file" name="file"/>选择图片
                                    </a>
                                    <input type="submit" value="头像上传" class="form-control" id="uploadImg"/>
                                    <input id="cancel" type="button" class="form-control" value="取消"/>
                                </form>
                                <p class="description text-center">
                                    ${student.studentSifnature}
                                </p>
                            </div>
                            <hr>
                            <div class="text-center">
                                <div class="row">
                                    <div class="col-md-3 col-md-offset-1">
                                        <h5>学院<br/>
                                            <small>${department.departmentName}</small>
                                        </h5>
                                    </div>
                                    <div class="col-md-4">
                                        <h5>系别<br/>
                                            <small>${department.departmentPerfession}</small>
                                        </h5>
                                    </div>
                                    <div class="col-md-3">
                                        <h5>年级<br/>
                                            <small>${department.departmentGrade}</small>
                                        </h5>
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
                                                    <img src="assets/img/faces/face-0.jpg" alt="Circle Image"
                                                         class="img-circle img-no-padding img-responsive">
                                                </div>
                                            </div>
                                            <div class="col-xs-6">
                                                DJ Khaled
                                                <br/>
                                                <span class="text-muted"><small>Offline</small></span>
                                            </div>

                                            <div class="col-xs-3 text-right">
                                                <btn class="btn btn-sm btn-success btn-icon"><i
                                                        class="fa fa-envelope"></i></btn>
                                            </div>
                                        </div>
                                    </li>
                                    <li>
                                        <div class="row">
                                            <div class="col-xs-3">
                                                <div class="avatar">
                                                    <img src="assets/img/faces/face-1.jpg" alt="Circle Image"
                                                         class="img-circle img-no-padding img-responsive">
                                                </div>
                                            </div>
                                            <div class="col-xs-6">
                                                Creative Tim
                                                <br/>
                                                <span class="text-success"><small>Available</small></span>
                                            </div>

                                            <div class="col-xs-3 text-right">
                                                <btn class="btn btn-sm btn-success btn-icon"><i
                                                        class="fa fa-envelope"></i></btn>
                                            </div>
                                        </div>
                                    </li>
                                    <li>
                                        <div class="row">
                                            <div class="col-xs-3">
                                                <div class="avatar">
                                                    <img src="assets/img/faces/face-3.jpg" alt="Circle Image"
                                                         class="img-circle img-no-padding img-responsive">
                                                </div>
                                            </div>
                                            <div class="col-xs-6">
                                                Flume
                                                <br/>
                                                <span class="text-danger"><small>Busy</small></span>
                                            </div>

                                            <div class="col-xs-3 text-right">
                                                <btn class="btn btn-sm btn-success btn-icon"><i
                                                        class="fa fa-envelope"></i></btn>
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
                                                <label>学号</label>
                                                <input type="text" class="form-control border-input" disabled
                                                       placeholder="id" value="${student.studentCount}">
                                            </div>
                                        </div>
                                        <div class="col-md-4">
                                            <div class="form-group">
                                                <label>姓名</label>
                                                <input type="text" class="form-control border-input " name="studentName"
                                                       placeholder="Username" value="${student.studentName}">
                                            </div>
                                        </div>
                                        <div class="col-md-4">
                                            <div class="form-group">
                                                <label for="">邮箱</label>
                                                <input type="email" class="form-control border-input "
                                                       name="studentEmail" placeholder="Email"
                                                       value="${student.studentEmail}">
                                            </div>
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="col-md-4">
                                            <div class="form-group">
                                                <label>民族</label>
                                                <input type="text" class="form-control border-input "
                                                       name="studentNationality" placeholder="Nationality"
                                                       value="${student.studentNationality}">
                                            </div>
                                        </div>
                                        <div class="col-md-4">
                                            <div class="form-group">
                                                <label>性别</label>
                                                <input type="text" class="form-control border-input " name="studentSex"
                                                       placeholder="Sex"
                                                <c:if test="${student.studentSex==1}"> value="男"</c:if>
                                                <c:if test="${student.studentSex==2}"> value="女"</c:if>>
                                            </div>
                                        </div>
                                        <div class="col-md-4">
                                            <div class="form-group">
                                                <label>年龄</label>
                                                <input type="text" class="form-control border-input " name="studentAge"
                                                       placeholder="age" value="${student.studentAge}">
                                            </div>
                                        </div>

                                    </div>

                                    <div class="row">
                                        <div class="col-md-12">
                                            <div class="form-group">
                                                <label>地址</label>
                                                <input type="text" class="form-control border-input "
                                                       name="studentAddress" placeholder="Home Address"
                                                       value="${student.studentAddress}">
                                            </div>
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="col-md-6">
                                            <div class="form-group">
                                                <label>联系方式</label>
                                                <input type="text" class="form-control border-input "
                                                       name="studentPhone" placeholder="Phone"
                                                       value="${student.studentPhone}">
                                            </div>
                                        </div>
                                        <div class="col-md-6">
                                            <div class="form-group">
                                                <label>入学时间</label>
                                                <input type="text" class="form-control border-input"
                                                       placeholder="createTime" disabled value="${studentCrreateTime}">
                                            </div>
                                        </div>

                                    </div>

                                    <div class="row">
                                        <div class="col-md-12">
                                            <div class="form-group">
                                                <label>个人介绍</label>
                                                <textarea rows="5" class="form-control border-input "
                                                          name="studentIntroduce"
                                                          placeholder="Here can be your description"
                                                          value="Mike">${student.studentIntroduce}</textarea>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="text-center">
                                        <button type="submit" class="btn btn-info btn-fill btn-wd btn-editInfo">修改信息
                                        </button>
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
<!-- 模态框（Modal） -->
<div class="modal fade" id="studentPassModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel"
     aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal"
                        aria-hidden="true">×
                </button>
                <h4 class="modal-title" id="myModalLabel">
                    修改密码
                </h4>
            </div>
            <div class="modal-body">
                <form class="form-horizontal" role="form">
                    <div class="form-group">
                        <label for="oldPass" class="col-sm-2 control-label">原密码</label>
                        <div class="col-sm-10">
                            <input type="password" class="form-control" placeholder="请输入原密码"
                                   name="oldPass" id="oldPass">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="newPass" class="col-sm-2 control-label">新密码</label>
                        <div class="col-sm-10">
                            <input type="password" class="form-control" placeholder="请输入新密码" name="newPass" id="newPass">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="confirmPass" class="col-sm-2 control-label">确认密码</label>
                        <div class="col-sm-10">
                            <input type="password" class="form-control" placeholder="请确认新密码" name="confirmPass" id="confirmPass">
                        </div>
                    </div>
                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default"
                        data-dismiss="modal">关闭
                </button>
                <button type="button" class="btn btn-primary" id="updatePassword">
                    提交更改
                </button>
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal-dialog -->
</div><!-- /.modal -->
</body>
<script src="assets/js/jquery-1.10.2.js" type="text/javascript"></script>
<script src="assets/js/bootstrap.min.js" type="text/javascript"></script>
<script src="assets/js/bootstrap-checkbox-radio.js"></script>
<script src="assets/js/chartist.min.js"></script>
<script src="assets/js/bootstrap-notify.js"></script>
<script src="assets/js/paper-dashboard.js"></script>
<script src="assets/js/demo.js"></script>
<script src="assets/js/jquery.form.js"></script>
<script src="assets/js/bootbox.min.js"></script>
<script type="text/javascript">
    $(function () {
        getImgStr();
    });

    function updatePass() {
        $('#studentPassModal').modal('show')
    }

    $("#updatePassword").click(function () {
        var oldPass = $("#oldPass").val()
        var newPass = $("#newPass").val()
        var confirmPass = $("#confirmPass").val()
        if (confirmPass != newPass) {
            bootbox.alert("请重新确认密码")
        } else {
            $.ajax({
                url: "student/updatePassword",
                data: {
                    oldPass: oldPass,
                    newPass: newPass
                },
                success: function (result) {
                    if (result) {
                        bootbox.alert("修改成功")
                    } else {
                        bootbox.alert("修改失败,请确认原密码是否正确")
                    }
                    $('#studentPassModal').modal('hide')
                }
            })
        }
    })

    function getImgStr() {
        $.ajax({
            url: 'getAvatar',
            method: 'post',
            data: {
                lx: 0
            },
            success: function (res) {
                $('#avatar')[0].src = res;
            }
        })
    }

    $(".btn-editInfo").click(function () {
        sex = 1;
        if ($("input[name='studentSex']").val() == "女") {
            sex = 2
        }
        var studentInfo = {
            studentName: $("input[name='studentName']").val(),
            studentEmail: $("input[name='studentEmail']").val(),
            studentNationality: $("input[name='studentNationality']").val(),
            studentSex: sex,
            studentAge: $("input[name='studentAge']").val(),
            studentAddress: $("input[name='studentAddress']").val(),
            studentPhone: $("input[name='studentPhone']").val(),
            studentIntroduce: $("textarea[name='studentIntroduce']").val(),
        }
        $.ajax({
            url: "stuEditInfo",
            contentType: "application/json;charset=utf-8",
            processData: true,
            type: "post",
            data: JSON.stringify(studentInfo),
            dataType: "json",
            success: function (json) {
                bootbox.alert("修改成功！");
                window.location.href = "studentInfo";
            },
            error: function () {

            }

        })
    });

    $('#cancel').click(function () {
        $('.mask').hide();
        $('#ImgForm').hide();
    });

    $('#uploadImg').submit(function () {
        var options = {
            target: '#msg'
        };
        $(this).ajaxSubmit(options);
    });

    function changeAvatar(obj) {
        $('.mask').show();
        $('#ImgForm').show();
        getImgStr();
    }
    function logout() {
        $.ajax({
            url:"student/logout",
            success:function () {
                window.location.href="login"
            }
        })
    }
</script>
</html>

