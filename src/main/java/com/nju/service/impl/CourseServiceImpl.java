package com.nju.service.impl;

import com.nju.dao.mapper.*;
import com.nju.entity.*;
import com.nju.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    TbCourseMapper courseMapper;
    @Autowired
    TbStudentCourseMapper studentCourseMapper;
    @Autowired
    TbTeacherCourseMapper teacherCourseMapper;
    @Autowired
    TbCourseConcreteMapper courseConcreteMapper;
    @Autowired
    TbTccHomeworkMapper tccHomeworkMapper;
    @Autowired
    TbHomeworkMapper homeworkMapper;

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

    @Override
    public List<TbCourse> getCourseBySemester(Integer id,String semester){
        TbStudentCourseExample studentCourseExample=new TbStudentCourseExample();
        TbStudentCourseExample.Criteria criteria1=studentCourseExample.createCriteria();
        criteria1.andStudentIdEqualTo(id);
        List<TbStudentCourse> studentCourses=studentCourseMapper.selectByExample(studentCourseExample);
        List<Integer> courseList=new ArrayList<Integer>();
        for (int i=0;i<studentCourses.size();i++){
            courseList.add(studentCourses.get(i).getCourseId());
        }
        TbCourseExample courseExample=new TbCourseExample();
        TbCourseExample.Criteria criteria=courseExample.createCriteria();
        criteria.andCourseSessionEqualTo(semester);
        criteria.andCourseIdNotIn(courseList);
        return courseMapper.selectByExample(courseExample);
    }

    @Override
    public Boolean addCourse(Integer studentId,Integer courseId){
        TbStudentCourse studentCourse=new TbStudentCourse();
        studentCourse.setCourseId(courseId);
        studentCourse.setStudentId(studentId);
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        int year = cal.get(Calendar.YEAR);
        studentCourse.setCreateYear(year);
        if (studentCourseMapper.insert(studentCourse)==1)
            return true;
        else
            return false;

    }

    @Override
    public TbCourse getCourseByCourseId(Integer id){
        TbCourseExample courseExample=new TbCourseExample();
        TbCourseExample.Criteria criteria1=courseExample.createCriteria();
        criteria1.andCourseIdEqualTo(id);
        List<TbCourse> courseList=courseMapper.selectByExample(courseExample);
        if(courseList.size()>0){
            return courseList.get(0);
        }
        else
            return null;
    }

    //由教师ID查询课程表的详细信息
    @Override
    public List<TbCourseConcrete> getCourseConcreteByTeacherId(Integer id){
        TbCourseConcreteExample courseConcreteExample=new TbCourseConcreteExample();
        TbCourseConcreteExample.Criteria criteria=courseConcreteExample.createCriteria();
        criteria.andTeacherIdEqualTo(id);
        return courseConcreteMapper.selectByExample(courseConcreteExample);
    }

    //由课程ID获取该课程的相关作业列表
    @Override
    public List<TbHomework> getCourseHomeworkByCourseConcreteId(Integer id){
        TbTccHomeworkExample tccHomeworkExample=new TbTccHomeworkExample();
        TbTccHomeworkExample.Criteria criteria=tccHomeworkExample.createCriteria();
        criteria.andCourseConcreteIdEqualTo(id);
        List<TbTccHomework> tccHomeworkList=tccHomeworkMapper.selectByExample(tccHomeworkExample);
        List<Integer> homeworkIdList=new ArrayList<>();
        for (int i=0;i<tccHomeworkList.size();i++){
            homeworkIdList.add(tccHomeworkList.get(i).getHomeworkId());
        }
        TbHomeworkExample homeworkExample=new TbHomeworkExample();
        TbHomeworkExample.Criteria criteria1=homeworkExample.createCriteria();
        criteria1.andHomeworkIdIn(homeworkIdList);
        return homeworkMapper.selectByExample(homeworkExample);
    }
}
