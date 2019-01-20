package com.nju.service;

import com.nju.entity.TbCourse;

import javax.swing.plaf.LabelUI;
import java.util.List;

public interface CourseService {

    List<TbCourse> getCoursesByStuId(Integer id);
    List<TbCourse> getCourseBySemester(Integer id,String semester);
    Boolean addCourse(Integer studentId,Integer courseId);
}
