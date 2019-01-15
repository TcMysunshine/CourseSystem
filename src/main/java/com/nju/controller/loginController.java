package com.nju.controller;

import com.nju.entity.User;
import com.nju.service.UserService;
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

@Controller
public class loginController {
    @Autowired
    UserService userService;

    @RequestMapping("/login")
    public String login(){
        return "login1";
    }

    @RequestMapping("/index")
    public ModelAndView getIndex(HttpServletRequest request,ModelMap model){
        ModelAndView modelAndView=new ModelAndView();
        HttpSession session=request.getSession();
        String username=(String)session.getAttribute("username");
        model.addAttribute("username",username);
        modelAndView.setViewName("studentInfo");
        return modelAndView;
    }

    @ResponseBody
    @RequestMapping("/login/confirm")
    public User confirm(HttpServletRequest request, HttpServletResponse response,
                        @RequestParam(value = "username", required = false) String username,
                        @RequestParam(value = "password", required = false) String password){
        User user=userService.selectByUserNameAndPassWord(username,password);
        if (user!=null){
            HttpSession session=request.getSession();
            session.setAttribute("username",username);
            System.out.println("登录成功");
            return user;
        }
        return null;

    }
}
