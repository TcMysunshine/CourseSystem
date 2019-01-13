package com.nju.controller;

import com.nju.Enum.CourseTimeEnum;
import com.nju.entity.TbCourse;
import com.nju.entity.TbStudent;
import com.nju.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class courseController {

    @Autowired
    CourseService courseService;

    //显示课程界面
    @RequestMapping("/showCourse")
    public ModelAndView getIndex(HttpServletRequest request, ModelMap model){
        ModelAndView modelAndView=new ModelAndView();
        HttpSession session=request.getSession();
        TbStudent student=(TbStudent) session.getAttribute("user");
        List<TbCourse> courses=courseService.getCoursesByStuId(student.getStudentId());
        for(int i=0;i<courses.size();i++){
            String courseInfo=courses.get(i).getCourseName()+"<br/> 教室:"+courses.get(i).getCourseClassroom();
            String timeType=CourseTimeEnum.getTimeTypeByCourseTime(courses.get(i).getCourseTime());
            model.addAttribute(timeType,courseInfo);
        }
        model.addAttribute("courselist",courses);
        model.addAttribute("student",student);
        modelAndView.setViewName("showStudentCourse");
        return modelAndView;
    }

}
