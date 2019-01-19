package com.nju.controller;


import com.nju.entity.TbStudent;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class SelectCourseController {

    @RequestMapping("/selectCourseList")
    public ModelAndView selectCourse(HttpServletRequest request, ModelMap model){
        ModelAndView modelAndView=new ModelAndView();
        HttpSession session=request.getSession();
        TbStudent student=(TbStudent) session.getAttribute("user");
        model.addAttribute("student",student);
        modelAndView.setViewName("selectCourse");
        return modelAndView;
    }
}
