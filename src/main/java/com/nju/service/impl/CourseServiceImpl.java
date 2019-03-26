package com.nju.service.impl;

import com.nju.Model.CourseShowModel;
import com.nju.dao.mapper.*;
import com.nju.entity.*;
import com.nju.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.StyledEditorKit;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    TbCourseMapper courseMapper;
    @Autowired
    TbTeacherMapper tbTeacherMapper;

    @Autowired
    TbStudentCourseConcreteMapper studentCourseConcreteMapper;
    @Autowired
    TbTeacherCourseConcreteMapper teacherCourseConcreteMapper;

    @Autowired
    TbCourseConcreteMapper courseConcreteMapper;
    @Autowired
    TbTccHomeworkMapper tccHomeworkMapper;
    @Autowired
    TbHomeworkMapper homeworkMapper;

    @Override
    public List<TbCourseConcrete> getCoursesByStuId(Integer id) {
        TbStudentCourseConcreteExample studentCourseConcreteExample = new TbStudentCourseConcreteExample();
        TbStudentCourseConcreteExample.Criteria criteria1 = studentCourseConcreteExample.createCriteria();
        criteria1.andStudentIdEqualTo(id);
        List<TbStudentCourseConcrete> studentCourses = studentCourseConcreteMapper.selectByExample(studentCourseConcreteExample);
        List<Integer> courseList = new ArrayList<Integer>();
        for (int i = 0; i < studentCourses.size(); i++) {
            courseList.add(studentCourses.get(i).getCourseConcreteId());
        }
        TbCourseConcreteExample courseConcreteExample = new TbCourseConcreteExample();
        TbCourseConcreteExample.Criteria criteria2 = courseConcreteExample.createCriteria();
        criteria2.andCourseConcreteIdIn(courseList);
        return courseConcreteMapper.selectByExample(courseConcreteExample);

    }

    @Override
    public List<TbCourseConcrete> getCoursesByYear(Integer year) {
        TbCourseConcreteExample courseConcreteExample = new TbCourseConcreteExample();
        TbCourseConcreteExample.Criteria criteria = courseConcreteExample.createCriteria();
        criteria.andCourseConcreteCreatetimeEqualTo(year);
        return courseConcreteMapper.selectByExample(courseConcreteExample);
    }

    //补全课程信息
    @Override
    public List<CourseShowModel> geCourseInfo(List<TbCourseConcrete> courses) {
        List<CourseShowModel> courseInfos = new ArrayList<>();
        for (int i = 0; i < courses.size(); i++) {
            CourseShowModel courseModel = new CourseShowModel();
            courseModel.setCourseConcreteClassroom(courses.get(i).getCourseConcreteClassroom());
            courseModel.setCourseConcreteCredit(courses.get(i).getCourseConcreteCredit());
            courseModel.setCourseConcreteInformation(courses.get(i).getCourseConcreteInformation());
            courseModel.setCourseConcreteRequest(courses.get(i).getCourseConcreteRequest());
            courseModel.setCourseConcreteTime(courses.get(i).getCourseConcreteTime());
            TbCourse course = courseMapper.selectByPrimaryKey(courses.get(i).getCourseId());
            courseModel.setCourseEncoding(course.getCourseEncoding());
            courseModel.setCourseName(course.getCourseName());
            courseModel.setTeacherName(getTeacherNameBy(courses.get(i).getCourseConcreteId()));
            courseInfos.add(courseModel);

        }
        return courseInfos;
    }


    public String getTeacherNameBy(Integer courseConcreteId) {
        TbTeacherCourseConcreteExample tbTeacherCourseConcreteExample = new TbTeacherCourseConcreteExample();
        TbTeacherCourseConcreteExample.Criteria criteria = tbTeacherCourseConcreteExample.createCriteria();
        criteria.andCourseConcreteIdEqualTo(courseConcreteId);
        List<TbTeacherCourseConcrete> teacherCourseConcretes = teacherCourseConcreteMapper.selectByExample(tbTeacherCourseConcreteExample);
        if (teacherCourseConcretes.size()>0) {
            TbTeacher teacher = tbTeacherMapper.selectByPrimaryKey(teacherCourseConcretes.get(0).getTeacherId());
            return teacher.getTeacherName();
        }else {
            return "";
        }


    }

    @Override
    public List<TbCourse> getCourseBySemester(Integer id, String semester) {
        TbStudentCourseConcreteExample studentCourseConcreteExample = new TbStudentCourseConcreteExample();
        //TbStudentCourseExample studentCourseExample=new TbStudentCourseExample();
        TbStudentCourseConcreteExample.Criteria criteria = studentCourseConcreteExample.createCriteria();
        //TbStudentCourseExample.Criteria criteria1=studentCourseExample.createCriteria();
        criteria.andStudentIdEqualTo(id);
        //criteria1.andStudentIdEqualTo(id);
        List<TbStudentCourseConcrete> studentCourseConcretes = studentCourseConcreteMapper.selectByExample(studentCourseConcreteExample);
        //List<TbStudentCourse> studentCourses=studentCourseMapper.selectByExample(studentCourseExample);
        List<Integer> courseList = new ArrayList<Integer>();
        for (int i = 0; i < studentCourseConcretes.size(); i++) {
            //courseList.add(studentCourses.get(i).getCourseId());
            courseList.add(studentCourseConcretes.get(i).getCourseConcreteId());
        }
        TbCourseExample courseExample = new TbCourseExample();
        TbCourseExample.Criteria criteria1 = courseExample.createCriteria();
        criteria1.andCourseSessionEqualTo(semester);
        criteria1.andCourseIdNotIn(courseList);
        return courseMapper.selectByExample(courseExample);
    }

    @Override
    public Boolean addCourse(Integer studentId, Integer courseId) {
        //TbStudentCourse studentCourse=new TbStudentCourse();
        TbStudentCourseConcrete studentCourseConcrete = new TbStudentCourseConcrete();
        //studentCourse.setCourseId(courseId);
        //  studentCourse.setStudentId(studentId);
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        int year = cal.get(Calendar.YEAR);
        //studentCourse.setCreateYear(year);
//        if (studentCourseMapper.insert(studentCourse)==1)
//            return true;
//        else
//            return false;
        return true;

    }

    @Override
    public TbCourse getCourseByCourseId(Integer id) {
        TbCourseExample courseExample = new TbCourseExample();
        TbCourseExample.Criteria criteria1 = courseExample.createCriteria();
        criteria1.andCourseIdEqualTo(id);
        List<TbCourse> courseList = courseMapper.selectByExample(courseExample);
        if (courseList.size() > 0) {
            return courseList.get(0);
        } else {
            return null;
        }
    }

    //由教师ID查询课程表的详细信息
    @Override
    public List<TbCourseConcrete> getCourseConcreteByTeacherId(Integer id) {
        List<Integer> courseConcreteIdList = getCourseConcreteIdListByTeacherId(id);
        List<TbCourseConcrete> courseConcretes = new ArrayList<>();
        for (int i = 0; i < courseConcreteIdList.size(); i++) {
            courseConcretes.add(courseConcreteMapper.selectByPrimaryKey(courseConcreteIdList.get(i).intValue()));
        }
        return courseConcretes;
    }

    //由教师ID查询课程的详情表的ID
    public List<Integer> getCourseConcreteIdListByTeacherId(Integer id) {
        TbTeacherCourseConcreteExample teacherCourseConcreteExample = new TbTeacherCourseConcreteExample();
        TbTeacherCourseConcreteExample.Criteria criteria = teacherCourseConcreteExample.createCriteria();
        criteria.andTeacherIdEqualTo(id);
        List<TbTeacherCourseConcrete> tbTeacherCourseConcretes = teacherCourseConcreteMapper.selectByExample(teacherCourseConcreteExample);
        List<Integer> courseConcreteIdList = new ArrayList<>();
        for (int i = 0; i < tbTeacherCourseConcretes.size(); i++) {
            courseConcreteIdList.add(tbTeacherCourseConcretes.get(i).getCourseConcreteId());
        }
        return courseConcreteIdList;
    }

    //由课程ID获取该课程的相关作业列表
    @Override
    public List<TbHomework> getCourseHomeworkByCourseConcreteId(Integer id) {
        TbTccHomeworkExample tccHomeworkExample = new TbTccHomeworkExample();
        TbTccHomeworkExample.Criteria criteria = tccHomeworkExample.createCriteria();
        criteria.andCourseConcreteIdEqualTo(id);
        List<TbTccHomework> tccHomeworkList = tccHomeworkMapper.selectByExample(tccHomeworkExample);
        List<Integer> homeworkIdList = new ArrayList<>();
        for (int i = 0; i < tccHomeworkList.size(); i++) {
            homeworkIdList.add(tccHomeworkList.get(i).getHomeworkId());
        }
        TbHomeworkExample homeworkExample = new TbHomeworkExample();
        TbHomeworkExample.Criteria criteria1 = homeworkExample.createCriteria();
        criteria1.andHomeworkIdIn(homeworkIdList);
        return homeworkMapper.selectByExample(homeworkExample);
    }

    @Override
    public List<TbCourse> getCourse(){
        List<TbCourse> courseList=courseMapper.getCourse();
        return courseList;
    }

    @Override
    public Boolean insertCourseConcrete(TbCourseConcrete courseConcrete){
        if (courseConcreteMapper.insert(courseConcrete)>0) {
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public Integer getMaxid(){
        return courseConcreteMapper.getMaxid();
    }
}
