package com.nju.service.impl;

import com.nju.dao.mapper.TbCourseMapper;
import com.nju.dao.mapper.TbStudentCourseMapper;
import com.nju.entity.TbCourse;
import com.nju.entity.TbCourseExample;
import com.nju.entity.TbStudentCourse;
import com.nju.entity.TbStudentCourseExample;
import com.nju.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    TbCourseMapper courseMapper;
    @Autowired
    TbStudentCourseMapper studentCourseMapper;

    @Override
    public List<TbCourse> getCoursesByStuId(Integer id){
        TbStudentCourseExample studentCourseExample=new TbStudentCourseExample();
        TbStudentCourseExample.Criteria criteria1=studentCourseExample.createCriteria();
        criteria1.andStudentIdEqualTo(id);
        List<TbStudentCourse> studentCourses=studentCourseMapper.selectByExample(studentCourseExample);
        List<Integer> courseList=new ArrayList<Integer>();
        for (int i=0;i<studentCourses.size();i++){
            courseList.add(studentCourses.get(i).getCourseId());
        }
        TbCourseExample courseExample=new TbCourseExample();
        TbCourseExample.Criteria criteria2=courseExample.createCriteria();
        criteria2.andCourseIdIn(courseList);
        return courseMapper.selectByExample(courseExample);
    }

}
