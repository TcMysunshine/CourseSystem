package com.nju.service;

import com.nju.entity.TbCourse;

import java.util.List;

public interface CourseService {

    List<TbCourse> getCoursesByStuId(Integer id);
}
