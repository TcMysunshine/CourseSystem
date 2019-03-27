package com.nju.service.impl;

import com.nju.Model.TeacherModel;
import com.nju.dao.mapper.TbTeacherCourseConcreteMapper;
import com.nju.dao.mapper.TbTeacherMapper;
import com.nju.entity.TbTeacher;
import com.nju.entity.TbTeacherCourseConcrete;
import com.nju.entity.TbTeacherExample;
import org.apache.el.parser.BooleanNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImpl {
    @Autowired
    TbTeacherMapper tbTeacherMapper;
    @Autowired
    TbTeacherCourseConcreteMapper teacherCourseConcreteMapper;

    public TeacherModel findTeacherByCountPass(String count, String pass) {
        TbTeacherExample teacherExample = new TbTeacherExample();
        TbTeacherExample.Criteria criteria = teacherExample.createCriteria();
        criteria.andTeacherCountEqualTo(count);
        criteria.andTeacherPasswordEqualTo(pass);
        teacherExample.or(criteria);
        List<TbTeacher> tbTeacherList = tbTeacherMapper.selectByExample(teacherExample);
        if (!tbTeacherList.isEmpty() && tbTeacherList != null) {
            return TeacherModel.convert(tbTeacherList.get(0));
        }
        return null;
    }

    public Boolean editTeacherInfo(TbTeacher teacher) {
        int count = tbTeacherMapper.updateByPrimaryKeySelective(teacher);
        if (count > 0) {
            return true;
        }
        return false;
    }

    public TbTeacher getTeacher(String teacherCount, String teacherPassword) {
        TbTeacherExample teacherExample = new TbTeacherExample();
        TbTeacherExample.Criteria criteria = teacherExample.createCriteria();

        criteria.andTeacherCountEqualTo(teacherCount);
        criteria.andTeacherPasswordEqualTo(teacherPassword);
        List<TbTeacher> teachers = tbTeacherMapper.selectByExample(teacherExample);
        if (teachers.size() > 0) {
            return teachers.get(0);
        } else {
            return null;
        }
    }

    public List<TbTeacher> getTeachers(String teacherName, String teacherProfessionalTitle) {
        TbTeacherExample teacherExample = new TbTeacherExample();
        TbTeacherExample.Criteria criteria = teacherExample.createCriteria();
        if (teacherName != null && teacherName != "") {
            criteria.andTeacherNameLike(teacherName);
        }
        if (teacherProfessionalTitle != null && teacherProfessionalTitle != "") {
            criteria.andTeacherProfessionalTitleLike(teacherName);
        }
        List<TbTeacher> teachers = tbTeacherMapper.selectByExample(teacherExample);
        return teachers;

    }

    public List<TbTeacher> getTeachersAll() {
        List<TbTeacher> teachers = tbTeacherMapper.getTeachersAll();
        return teachers;
    }

    public void insertTeacherCourseConcrete(TbTeacherCourseConcrete teacherCourseConcrete) {
        teacherCourseConcreteMapper.insert(teacherCourseConcrete);
    }

    public Boolean insertTeacher(TbTeacher teacher){
        if (tbTeacherMapper.insert(teacher)>0){
            return true;
        }else{
            return false;
        }
    }





}
