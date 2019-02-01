package com.nju.controller;

import com.nju.Model.ResultModel;
import com.nju.entity.TbTeacher;
import com.nju.service.impl.TeacherServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;

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
        TbTeacher teacher=teacherService.getTeacher(teacherCount,teacherPass);
        if(teacher!=null){
            request.getSession().setAttribute("user",teacher);
            return new ResultModel(1,ResultModel.SUCCESS,teacher);
        }
        return new ResultModel(0,ResultModel.FAIL,null);
    }

    @GetMapping(value = "/teacherInfo")
    public ModelAndView teacherInfo(HttpServletRequest request, ModelMap model){
        ModelAndView modelAndView=new ModelAndView();
        HttpSession session=request.getSession();
        TbTeacher teacher=(TbTeacher)session.getAttribute("user");
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String teacherCreateTime = df.format((Date)teacher.getTeacherCreatetime());
        model.addAttribute("teacher",teacher);
        model.addAttribute("teacherCreateTime",teacherCreateTime);
        return modelAndView;
       /* TeacherModel teacherModel=(TeacherModel) request.getSession().getAttribute("user");
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("teacherInfo");
        model.addAttribute("teacherInfo",teacherModel);*/
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
