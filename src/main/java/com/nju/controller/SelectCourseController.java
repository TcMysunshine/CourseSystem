package com.nju.controller;


import com.nju.entity.TbCourse;
import com.nju.entity.TbStudent;
import com.nju.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class SelectCourseController {

    @Autowired
    CourseService courseService;

    @RequestMapping("/selectCourseList")
    public ModelAndView selectCourse(HttpServletRequest request, ModelMap model){
        ModelAndView modelAndView=new ModelAndView();
        HttpSession session=request.getSession();
        TbStudent student=(TbStudent) session.getAttribute("user");
        List<TbCourse> courseList=courseService.getCourseBySemester(student.getStudentId(),(String)session.getAttribute("currentSemester"));
        model.addAttribute("currentCourse",courseList);
        model.addAttribute("student",student);
        modelAndView.setViewName("selectCourse");
        return modelAndView;
    }

    @ResponseBody
    @RequestMapping("/addCourse")
    public Boolean addCourse(HttpServletRequest request, HttpServletResponse response,
                          @RequestParam(value = "courseId", required = false) String courseId){
        HttpSession session=request.getSession();
        TbStudent student=(TbStudent) session.getAttribute("user");
        Integer courseId1=Integer.parseInt(courseId);
        return courseService.addCourse(student.getStudentId(),courseId1);
    }
}
