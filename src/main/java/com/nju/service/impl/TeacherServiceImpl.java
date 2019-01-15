package com.nju.service.impl;

import com.nju.Model.TeacherModel;
import com.nju.dao.mapper.TbTeacherMapper;
import com.nju.entity.TbTeacher;
import com.nju.entity.TbTeacherExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImpl {
    @Autowired
    TbTeacherMapper tbTeacherMapper;
    public TeacherModel findTeacherByCountPass(String count, String pass){
        TbTeacherExample teacherExample=new TbTeacherExample();
        TbTeacherExample.Criteria criteria=teacherExample.createCriteria();
        criteria.andTeacherCountEqualTo(count);
        criteria.andTeacherPasswordEqualTo(pass);
        teacherExample.or(criteria);
        List<TbTeacher> tbTeacherList=tbTeacherMapper.selectByExample(teacherExample);
        if(!tbTeacherList.isEmpty() && tbTeacherList!=null){
            return TeacherModel.convert(tbTeacherList.get(0));
        }
        return null;
    }
    public Boolean editTeacherInfo(TbTeacher teacher){
        int count = tbTeacherMapper.updateByPrimaryKeySelective(teacher);
        if(count>0){
            return true;
        }
        return false;
    }
}