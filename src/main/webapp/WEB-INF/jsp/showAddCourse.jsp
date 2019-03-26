<%@ page language="java" pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html lang="en">
<head>
    <meta charset="utf-8"/>
</head>
<body>
<div class="col-lg-10 col-md-10">
    <div class="card">
        <div class="content">
            <form>
                <div class="row">
                    <div class="col-md-7">
                        <div class="form-group">
                            <label>课程名称</label>
                            <select name="courseName" id="courseName" class="form-control border-input">
                                <c:forEach var="course" items="${courseList}">
                                    <option value="${course.courseId}">${course.courseName}</option>
                                </c:forEach>
                            </select>
                        </div>
                    </div>
                </div>

                <div class="row">
                    <div class="col-md-7">
                        <div class="form-group">
                            <label>课程学分</label>
                            <input type="text" class="form-control border-input " name="courseCredit"
                                   placeholder="courseCredit">
                        </div>
                    </div>
                </div>

                <div class="row">
                    <div class="col-md-7">
                        <div class="form-group">
                            <label>课程时常（周数）</label>
                            <input type="text" class="form-control border-input " name="courseWeektime"
                                   placeholder="courseWeektime">
                        </div>
                    </div>
                </div>

                <div class="row">
                    <div class="col-md-7">
                        <div class="form-group">
                            <label>教室</label>
                            <input type="text" class="form-control border-input " name="classroom"
                                   placeholder="classroom" >
                        </div>
                    </div>
                </div>

                <div class="row">
                    <div class="col-md-3">
                        <div class="form-group">
                            <label>星期</label>
                            <select name="time1" id="time1" class="form-control border-input">
                                <option value="周一">周一</option>
                                <option value="周二">周二</option>
                                <option value="周三">周三</option>
                                <option value="周四">周四</option>
                                <option value="周五">周五</option>
                                <option value="周六">周六</option>
                                <option value="周日">周日</option>
                            </select>
                        </div>
                    </div>
                    <div class="col-md-3">
                        <div class="form-group">
                            <label>时间</label>
                            <select name="time2" id="time2" class="form-control border-input">
                                <option value="1、2节">1、2节</option>
                                <option value="3、4节">3、4节</option>
                                <option value="5、6节">5、6节</option>
                                <option value="7、8节">7、8节</option>
                                <option value="9、10节">9、10节</option>
                            </select>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-12">
                        <div class="form-group">
                            <label>课程介绍</label>
                            <textarea rows="5" class="form-control border-input " name="courseIntroduce"
                                      placeholder="Here can be course description"
                                      ></textarea>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-12">
                        <div class="form-group">
                            <label>课程要求</label>
                            <textarea rows="5" class="form-control border-input " name="courseRequest"
                                      placeholder="Here can be course courseRequest"
                                     ></textarea>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-7">
                        <div class="form-group">
                            <label>课程老师</label>
                            <select name="teacher" id="teacher" class="form-control border-input">
                                <c:forEach var="teacher" items="${teachers}">
                                    <option value="${teacher.teacherId}">${teacher.teacherName}</option>
                                </c:forEach>
                            </select>
                        </div>
                    </div>
                </div>
                <div class="text-center">
                    <button type="" class="btn btn-info btn-fill btn-wd btn-addCourseInfo">添加课程</button>
                </div>
                <div class="clearfix"></div>
            </form>
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
<script src="assets/js/jquery.form.js"></script>
<script type="text/javascript">
    $(".btn-addCourseInfo").click(function () {
        var time=$("#time1").val()+$("#time2").val();
        var courseInfo={
            courseId:$("#courseName").val(),
            courseCredit:$("input[name='courseCredit']").val(),
            courseWeektime:$("input[name='courseWeektime']").val(),
            classroom:$("input[name='classroom']").val(),
            time:time,
            courseIntroduce:$("textarea[name='courseIntroduce']").val(),
            courseRequest:$("textarea[name='courseRequest']").val(),
            teacher:$("#teacher").val(),
        }
        $.ajax({
            url:"addCourseInfo",
            contentType:"application/json;charset=utf-8",
            processData:true,
            type:"get",
            data:courseInfo,
            dataType:"json",
            success:function (json) {
                alert("添加成功！");
                window.location.href="courseManage";
            },
            error:function () {

            }

        })
    })
</script>
</html>

