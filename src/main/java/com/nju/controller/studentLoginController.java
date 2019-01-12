package com.nju.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.nju.entity.TbDepartment;
import com.nju.entity.TbStudent;
import com.nju.entity.vo.StudentEditInfoVo;
import com.nju.service.DepartmentService;
import com.nju.service.StudentService;
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
import java.text.SimpleDateFormat;
import java.util.Date;
@Controller
public class studentLoginController {

    @Autowired
    StudentService studentService;
    @Autowired
    DepartmentService departmentService;

    @RequestMapping("/studentInfo")
    public ModelAndView getIndex(HttpServletRequest request, ModelMap model){
        ModelAndView modelAndView=new ModelAndView();
        HttpSession session=request.getSession();
        TbStudent student=(TbStudent) session.getAttribute("user");
        TbDepartment department=departmentService.getDepartmentById((Integer)student.getStudentId());
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String studentCreateTime = df.format((Date)student.getStudentCreatetime());
        model.addAttribute("student",student);
        model.addAttribute("department",department);
        model.addAttribute("studentCrreateTime",studentCreateTime);
        modelAndView.setViewName("studentInfo");
        return modelAndView;
    }
    @ResponseBody
    @RequestMapping("/studentLogin/confirm")
    public TbStudent confirm(HttpServletRequest request, HttpServletResponse response,
                        @RequestParam(value = "username", required = false) String username,
                        @RequestParam(value = "password", required = false) String password){
        TbStudent student=studentService.getStudent(username,password);
        if (student!=null){
            HttpSession session=request.getSession();
            session.setAttribute("user",student);
            System.out.println("登录成功");
            return student;
        }
        return null;
    }

    @ResponseBody
    @RequestMapping("/stuEditInfo")
    public TbStudent confirm(HttpServletRequest request, HttpServletResponse response)throws Exception{
        ObjectMapper mapper=new ObjectMapper();
        StudentEditInfoVo studentEditInfoVo=mapper.readValue(request.getInputStream(),StudentEditInfoVo.class);
        HttpSession session=request.getSession();
        TbStudent student=(TbStudent) session.getAttribute("user");
        student.setStudentName(studentEditInfoVo.getStudentName());
        student.setStudentEmail(studentEditInfoVo.getStudentEmail());
        student.setStudentNationality(studentEditInfoVo.getStudentNationality());
        student.setStudentSex(studentEditInfoVo.getStudentSex());
        student.setStudentAge(studentEditInfoVo.getStudentAge());
        student.setStudentAddress(studentEditInfoVo.getStudentAddress());
        student.setStudentPhone(studentEditInfoVo.getStudentPhone());
        student.setStudentIntroduce(studentEditInfoVo.getStudentIntroduce());
        Boolean flag=studentService.editStudentInfo(student);
        if(flag){
            return student;
        }
        else
            return null;
    }
}
