package com.nju.service;

import com.nju.entity.TbCourse;
import com.nju.entity.TbCourseConcrete;
import com.nju.entity.TbHomework;
import com.nju.entity.TbTeacherCourse;

import java.util.List;

public interface CourseService {

    List<TbCourse> getCoursesByStuId(Integer id);
    List<TbCourse> getCourseByTeacherId(Integer id);
    List<TbCourse> getCourseBySemester(Integer id,String semester);
    Boolean addCourse(Integer studentId,Integer courseId);
    TbCourse getCourseByCourseId(Integer id);
    List<TbCourseConcrete> getCourseConcreteByTeacherId(Integer id);
    List<TbTeacherCourse>getTeacherCourseByTeacherId(Integer id);
    List<TbHomework> getCourseHomeworkByCourseConcreteId(Integer id);
}
