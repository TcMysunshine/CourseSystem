package com.nju.conf;

import com.nju.Model.TeacherModel;
import com.nju.entity.TbStudent;
import com.nju.entity.TbTeacher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@Component
public class AccessInterceptor implements HandlerInterceptor {
    private static final Logger logger = LoggerFactory.getLogger(AccessInterceptor.class);
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//        request.getSession().getAttribute("user").getClass().equals()
//        logger.info("进入拦截器");
        Object userObject=request.getSession().getAttribute("user");
        request.getSession().setMaxInactiveInterval(30*60);
        if(userObject==null){
            response.sendRedirect(request.getSession()
                        .getServletContext().getContextPath()+"/login");
            return false;
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }

}
