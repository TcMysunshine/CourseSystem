package com.nju.controller;

import com.nju.Model.ResultModel;
import com.nju.entity.TbStudent;
import com.nju.entity.TbTeacher;
import com.nju.entity.User;
import com.nju.entity.vo.StudentInfoVo;
import com.nju.service.StudentService;
import com.nju.service.TeacherService;
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
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
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
    @ResponseBody
    @RequestMapping("/superLogin/confirm")
    public ResultModel superConfirm(HttpServletRequest request,
                                    @RequestParam(value = "username", required = false) String username,
                                    @RequestParam(value = "password", required = false) String password){
        User user=userService.selectByUserNameAndPassWord(username,password);
        if(user!=null){
            request.getSession().setAttribute("user",user);
            return new ResultModel(1,ResultModel.SUCCESS,user);
        }
        return new ResultModel(0,ResultModel.FAIL,null);
    }

    @RequestMapping("/superInfo")
    public ModelAndView getIndex(HttpServletRequest request, ModelMap model,
                                 @RequestParam(value = "studentCount", required = false) String studentCount,
                                 @RequestParam(value = "studentName", required = false) String studentName,
                                 @RequestParam(value = "departmentName", required = false) String departmentName,
                                 @RequestParam(value = "departmentPerfession", required = false) String departmentPerfession
                                 ){
        ModelAndView modelAndView=new ModelAndView();
        List<StudentInfoVo> students=studentService.getStudents(studentCount,studentName,departmentName,departmentPerfession);
        model.addAttribute("students",students);
        model.addAttribute("studentCount",studentCount);
        model.addAttribute("studentName",studentName);
        model.addAttribute("departmentName",departmentName);
        model.addAttribute("departmentPerfession",departmentPerfession);
        modelAndView.setViewName("superInfo");
        return modelAndView;
    }

    @ResponseBody
    @RequestMapping("/addStudents")
    public ResultModel addStudents(HttpServletRequest request,
                                    @RequestParam(value = "studentNum", required = false) String studentNum){
        List<TbStudent> students=studentService.addStudents(Integer.parseInt(studentNum));
        if(students!=null){
            return new ResultModel(1,ResultModel.SUCCESS,students);
        }
        return new ResultModel(0,ResultModel.FAIL,null);
    }

    @RequestMapping("/superTeacher")
    public ModelAndView getTeachers(HttpServletRequest request, ModelMap model,
                                 @RequestParam(value = "teacherName", required = false) String teacherName,
                                 @RequestParam(value = "teacherProfessionalTitle", required = false) String teacherProfessionalTitle
    ){
        ModelAndView modelAndView=new ModelAndView();
        /*List<StudentInfoVo> students=studentService.getStudents(studentCount,studentName,departmentName,departmentPerfession);
        model.addAttribute("students",students);*/
        List<TbTeacher> teachers=teacherService.getTeachers(teacherName,teacherProfessionalTitle);
        model.addAttribute("teachers",teachers);
        modelAndView.setViewName("superTeacher");
        return modelAndView;
    }

}
