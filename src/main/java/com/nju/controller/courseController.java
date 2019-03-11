package com.nju.controller;

import com.nju.Enum.CourseTimeEnum;
import com.nju.Model.CourseShowModel;
import com.nju.dao.mapper.TbCourseConcreteMapper;
import com.nju.dao.mapper.TbCourseMapper;
import com.nju.entity.*;
import com.nju.entity.vo.CourseInfoVo;
import com.nju.entity.vo.TeacherCourseInfoVo;
import com.nju.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


import java.util.ArrayList;
import java.util.List;

@Controller
public class courseController {

    @Autowired
    CourseService courseService;
    @Autowired
    TbCourseConcreteMapper courseConcreteMapper;
    @Autowired
    TbCourseMapper courseMapper;
    
    //显示课程界面
    @RequestMapping("/showCourse")
    public ModelAndView getIndex(HttpServletRequest request, ModelMap model){
        ModelAndView modelAndView=new ModelAndView();
        HttpSession session=request.getSession();
        TbStudent student=(TbStudent) session.getAttribute("user");
        List<TbCourseConcrete> courses=courseService.getCoursesByStuId(student.getStudentId());
        List<CourseShowModel> courseList=courseService.geCourseInfo(courses);
        for(int i=0;i<courses.size();i++){
            Integer courseId=courses.get(i).getCourseId();
            TbCourse course=courseService.getCourseByCourseId(courseId);
            String courseInfo=course.getCourseName()+"<br/> 教室:"+courses.get(i).getCourseConcreteClassroom();
            CourseInfoVo courseInfoVo=new CourseInfoVo();
            courseInfoVo.setCourseId(courseId);
            courseInfoVo.setCourseIntro(courseInfo);
            String timeType=CourseTimeEnum.getTimeTypeByCourseTime(courses.get(i).getCourseConcreteTime());
            model.addAttribute(timeType,courseInfoVo);
        }
        model.addAttribute("courselist",courseList);
        model.addAttribute("student",student);
        modelAndView.setViewName("showStudentCourse");
        return modelAndView;
    }



    @RequestMapping("/courseInfo")
    public ModelAndView addCourse(HttpServletRequest request,ModelMap model,
                             @RequestParam(value = "courseId", required = false) String courseId){
        ModelAndView modelAndView=new ModelAndView();
        HttpSession session=request.getSession();
        TbStudent student=(TbStudent) session.getAttribute("user");
        Integer courseId1=Integer.parseInt(courseId);
        TbCourse course=courseService.getCourseByCourseId(courseId1);
        model.addAttribute("course",course);

        List<TbCourseConcrete> courses=courseService.getCoursesByStuId(student.getStudentId());
        for(int i=0;i<courses.size();i++){
            Integer courseId2=courses.get(i).getCourseId();
            TbCourse tbCourse=courseService.getCourseByCourseId(courseId2);
            String courseInfo=tbCourse.getCourseName()+"<br/> 教室:"+courses.get(i).getCourseConcreteClassroom();
            CourseInfoVo courseInfoVo=new CourseInfoVo();
            courseInfoVo.setCourseId(courseId2);
            courseInfoVo.setCourseIntro(courseInfo);
            String timeType=CourseTimeEnum.getTimeTypeByCourseTime(courses.get(i).getCourseConcreteTime());
            model.addAttribute(timeType,courseInfoVo);
        }
        model.addAttribute("courselist",courses);
        model.addAttribute("student",student);
        modelAndView.setViewName("courseInfo");
        return modelAndView;
    }

    @RequestMapping("/teacherCourseInfo")
    public ModelAndView getTeacherCourseInfo(HttpServletRequest request, ModelMap model){
        ModelAndView modelAndView=new ModelAndView();
        HttpSession session =request.getSession();
        TbTeacher teacher= (TbTeacher) session.getAttribute("user");
        List<TbCourseConcrete> courseConcretes=courseService.getCourseConcreteByTeacherId(teacher.getTeacherId());
        List<TeacherCourseInfoVo> teacherCourseInfoVoList=new ArrayList<>();
        for(int i=0;i<courseConcretes.size();i++){
            TeacherCourseInfoVo teacherCourseInfoVo=new TeacherCourseInfoVo();
            TbCourse courses=courseService.getCourseByCourseId(courseConcretes.get(i).getCourseId());
            teacherCourseInfoVo.setCourseId(courses.getCourseId());
            teacherCourseInfoVo.setCourseName(courses.getCourseName());
            teacherCourseInfoVo.setCourseEncoding(courses.getCourseEncoding());
            teacherCourseInfoVo.setCourseConcreteId(courseConcretes.get(i).getCourseConcreteId());
            teacherCourseInfoVo.setCourseConcreteClassroom(courseConcretes.get(i).getCourseConcreteClassroom());
            teacherCourseInfoVo.setCourseConcreteCredit(courseConcretes.get(i).getCourseConcreteCredit());
            teacherCourseInfoVo.setCourseConcreteCreatetime(courseConcretes.get(i).getCourseConcreteCreatetime());
            teacherCourseInfoVo.setCourseConcreteInformation(courseConcretes.get(i).getCourseConcreteInformation());
            teacherCourseInfoVo.setCourseConcreteRequest(courseConcretes.get(i).getCourseConcreteRequest());
            teacherCourseInfoVo.setCourseConcreteWeektime(courseConcretes.get(i).getCourseConcreteWeektime());
            teacherCourseInfoVo.setCourseConcreteTime(courseConcretes.get(i).getCourseConcreteTime());
            teacherCourseInfoVoList.add(i,teacherCourseInfoVo);
        }
        model.addAttribute("teacher",teacher);
        model.addAttribute("teacherCourseInfo",teacherCourseInfoVoList);
        modelAndView.setViewName("teacherCourseList");
        return modelAndView;
    }

    @RequestMapping("/teacherCourseManage")
    public ModelAndView getCourseCourseInfo(HttpServletRequest request,ModelMap model,
                                            @RequestParam(value = "courseId", required = false) Integer courseId,
                                            @RequestParam(value = "courseConcreteId", required = false) Integer courseConcreteId) {
        ModelAndView modelAndView = new ModelAndView();
        List<TbHomework> tbHomeworkList = courseService.getCourseHomeworkByCourseConcreteId(courseId);
        TbCourse course =courseMapper.selectByPrimaryKey(courseId);
        TbCourseConcrete courseConcrete = courseConcreteMapper.selectByPrimaryKey(courseConcreteId);
        model.addAttribute("homeworkList", tbHomeworkList);
        model.addAttribute("courseInfo", courseConcrete);
        model.addAttribute("course",course);
        modelAndView.setViewName("teacherCourseManage");
        return modelAndView;
    }
}
