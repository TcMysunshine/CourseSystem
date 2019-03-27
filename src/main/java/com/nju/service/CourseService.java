package com.nju.service;

import com.nju.Model.CourseShowModel;
import com.nju.entity.TbCourse;
import com.nju.entity.TbCourseConcrete;
import com.nju.entity.TbHomework;

import java.util.List;

public interface CourseService {
    List<TbCourseConcrete> getCoursesByStuId(Integer id);
    List<TbCourseConcrete> getCoursesByYear(Integer year);
    List<TbCourse> getCourseBySemester(Integer id,String semester);
    Boolean addCourse(Integer studentId,Integer courseId);
    TbCourse getCourseByCourseId(Integer id);
    List<TbCourseConcrete> getCourseConcreteByTeacherId(Integer id);
    List<TbHomework> getCourseHomeworkByCourseConcreteId(Integer id);
    List<CourseShowModel> geCourseInfo(List<TbCourseConcrete> courses);
    List<TbCourse> getCourse();
    Boolean insertCourseConcrete(TbCourseConcrete courseConcrete);
    Integer getMaxid();
    Boolean updateCourseConcrete(TbCourseConcrete tbCourseConcrete);
}
