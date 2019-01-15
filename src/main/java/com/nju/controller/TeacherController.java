package com.nju.controller;

import com.nju.Model.ResultModel;
import com.nju.Model.TeacherModel;
import com.nju.entity.TbTeacher;
import com.nju.service.impl.TeacherServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
//@RequestMapping(value = "teacher")
public class TeacherController {
    @Autowired
    TeacherServiceImpl teacherService;

    @GetMapping(value = "/teacherLogin")
    public String teacherLogin(){
        return "teacherLogin";
    }

    @ResponseBody
    @GetMapping(value = "/teacherLogin.do")
    public ResultModel selectTeacherModel(HttpServletRequest request,
                                          @RequestParam(value = "teacherCount") String teacherCount,
                                          @RequestParam(value = "teacherPass") String teacherPass){
        TeacherModel teacherModel=teacherService.findTeacherByCountPass(teacherCount,teacherPass);
        if(teacherModel!=null){
            request.getSession().setAttribute("user",teacherModel);
            return new ResultModel(1,ResultModel.SUCCESS,teacherModel);
        }
        return new ResultModel(0,ResultModel.FAIL,null);
    }

    @GetMapping(value = "/teacherInfo")
    public ModelAndView teacherInfo(HttpServletRequest request, ModelMap model){
        TeacherModel teacherModel=(TeacherModel) request.getSession().getAttribute("user");
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("teacherInfo");
        model.addAttribute("teacherInfo",teacherModel);
        return modelAndView;
    }
    @ResponseBody
    @GetMapping(value = "/teacherInfoEdit")
    public ResultModel teacherInfoEdit(TbTeacher tbTeacher){
        if(teacherService.editTeacherInfo(tbTeacher)){
            return new ResultModel(1,ResultModel.SUCCESS,null);
        }
        else{
            return new ResultModel(0,ResultModel.FAIL,null);
        }
    }
}
