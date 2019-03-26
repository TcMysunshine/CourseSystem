package com.nju.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.nju.Model.CourseShowModel;
import com.nju.Model.ResultModel;
import com.nju.entity.*;
import com.nju.entity.vo.StudentEditInfoVo;
import com.nju.entity.vo.StudentInfoVo;
import com.nju.service.CourseService;
import com.nju.service.StudentService;
import com.nju.service.UserService;
import com.nju.service.impl.TeacherServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Calendar;
import java.util.Date;
import java.util.List;


@Controller
public class superController {
    @Autowired
    UserService userService;
    @Autowired
    StudentService studentService;
    @Autowired
    TeacherServiceImpl teacherService;
    @Autowired
    CourseService courseService;

    @ResponseBody
    @RequestMapping("/superLogin/confirm")
    public ResultModel superConfirm(HttpServletRequest request,
                                    @RequestParam(value = "username", required = false) String username,
                                    @RequestParam(value = "password", required = false) String password) {
        User user = userService.selectByUserNameAndPassWord(username, password);
        if (user != null) {
            request.getSession().setAttribute("user", user);
            return new ResultModel(1, ResultModel.SUCCESS, user);
        }
        return new ResultModel(0, ResultModel.FAIL, null);
    }

    @RequestMapping("superInfo")
    public ModelAndView getIndex(HttpServletRequest request, ModelMap model,
                                 @RequestParam(value = "studentCount", required = false) String studentCount,
                                 @RequestParam(value = "studentName", required = false) String studentName,
                                 @RequestParam(value = "departmentName", required = false) String departmentName,
                                 @RequestParam(value = "departmentPerfession", required = false) String departmentPerfession
    ) {
        ModelAndView modelAndView = new ModelAndView();
        List<StudentInfoVo> students = studentService.getStudents(studentCount, studentName, departmentName, departmentPerfession);
        model.addAttribute("students", students);
        model.addAttribute("studentCount", studentCount);
        model.addAttribute("studentName", studentName);
        model.addAttribute("departmentName", departmentName);
        model.addAttribute("departmentPerfession", departmentPerfession);
        modelAndView.setViewName("superInfo");
        return modelAndView;
    }

    @RequestMapping("courseManage")
    public ModelAndView courseManage(HttpServletRequest request, ModelMap model
    ) {
        ModelAndView modelAndView = new ModelAndView();
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        int year = cal.get(Calendar.YEAR);
        List<TbCourseConcrete> courses = courseService.getCoursesByYear(year);
        List<CourseShowModel> courseShowModels = courseService.geCourseInfo(courses);
        model.addAttribute("courses", courseShowModels);
        modelAndView.setViewName("courseManage");
        return modelAndView;
    }

    @ResponseBody
    @RequestMapping("showAddCourse")
    public ModelAndView showAddCourse(HttpServletRequest request, ModelMap model) {
        ModelAndView modelAndView = new ModelAndView();
        List<TbCourse> courseList = courseService.getCourse();
        model.addAttribute("courseList", courseList);
        List<TbTeacher> teachers = teacherService.getTeachersAll();
        model.addAttribute("teachers", teachers);
        modelAndView.setViewName("showAddCourse");
        return modelAndView;

    }

    @ResponseBody
    @RequestMapping("addCourseInfo")
    public ResultModel addCourseInfo(HttpServletRequest request,
                                     @RequestParam(value = "courseId", required = false) String courseId,
                                     @RequestParam(value = "courseCredit", required = false) String courseCredit,
                                     @RequestParam(value = "courseWeektime", required = false) String courseWeektime,
                                     @RequestParam(value = "classroom", required = false) String classroom,
                                     @RequestParam(value = "time", required = false) String time,
                                     @RequestParam(value = "courseIntroduce", required = false) String courseIntroduce,
                                     @RequestParam(value = "courseRequest", required = false) String courseRequest,
                                     @RequestParam(value = "teacher", required = false) String teacher

    ) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        int createtime = cal.get(Calendar.YEAR);
        Integer weektime=Integer.parseInt(courseWeektime);
        Integer credit=Integer.parseInt(courseCredit);
        Integer course_id=Integer.parseInt(courseId);
        Integer courseConcreteId=courseService.getMaxid()+1;
        TbCourseConcrete courseConcrete=new TbCourseConcrete();
        courseConcrete.setCourseConcreteCreatetime(createtime);
        courseConcrete.setCourseConcreteWeektime(weektime);
        courseConcrete.setCourseConcreteInformation(courseIntroduce);
        courseConcrete.setCourseConcreteRequest(courseRequest);
        courseConcrete.setCourseConcreteCredit(credit);
        courseConcrete.setCourseConcreteClassroom(classroom);
        courseConcrete.setCourseConcreteTime(time);
        courseConcrete.setCourseId(course_id);
        courseConcrete.setWeekId(1);
        courseConcrete.setCourseConcreteId(courseConcreteId);
        if (courseService.insertCourseConcrete(courseConcrete)) {
            Integer teacherId=Integer.parseInt(teacher);
            TbTeacherCourseConcrete teacherCourseConcrete=new TbTeacherCourseConcrete();
            teacherCourseConcrete.setTeacherId(teacherId);
            teacherCourseConcrete.setCourseConcreteId(courseConcreteId);
            teacherService.insertTeacherCourseConcrete(teacherCourseConcrete);
            return new ResultModel(1, ResultModel.SUCCESS, "success");
        }
        return new ResultModel(0, ResultModel.FAIL, null);
    }

    @ResponseBody
    @RequestMapping("/addStudents")
    public ResultModel addStudents(HttpServletRequest request,
                                   @RequestParam(value = "studentNum", required = false) String studentNum) {
        List<TbStudent> students = studentService.addStudents(Integer.parseInt(studentNum));
        if (students != null) {
            return new ResultModel(1, ResultModel.SUCCESS, students);
        }
        return new ResultModel(0, ResultModel.FAIL, null);
    }

    @RequestMapping("/superTeacher")
    public ModelAndView getTeachers(HttpServletRequest request, ModelMap model,
                                    @RequestParam(value = "teacherName", required = false) String teacherName,
                                    @RequestParam(value = "teacherProfessionalTitle", required = false) String teacherProfessionalTitle
    ) {
        ModelAndView modelAndView = new ModelAndView();
        /*List<StudentInfoVo> students=studentService.getStudents(studentCount,studentName,departmentName,departmentPerfession);
        model.addAttribute("students",students);*/
        List<TbTeacher> teachers = teacherService.getTeachers(teacherName, teacherProfessionalTitle);
        model.addAttribute("teachers", teachers);
        modelAndView.setViewName("superTeacher");
        return modelAndView;
    }

}
