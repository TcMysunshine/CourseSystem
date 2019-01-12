package com.nju.service.impl;

import com.nju.dao.mapper.TbStudentMapper;
import com.nju.entity.TbStudent;
import com.nju.entity.TbStudentExample;
import com.nju.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    TbStudentMapper studentMapper;

    @Override
    public TbStudent getStudent(String studentCount, String studentPassword){
        TbStudentExample studentExample=new TbStudentExample();
        TbStudentExample.Criteria criteria=studentExample.createCriteria();
        criteria.andStudentCountEqualTo(studentCount);
        criteria.andStudentPasswordEqualTo(studentPassword);
        List<TbStudent> students=studentMapper.selectByExample(studentExample);
        if(students.size()>0){
            return students.get(0);
        }
        else
            return null;
    }
    @Override
    public Boolean editStudentInfo(TbStudent student){
        TbStudentExample studentExample=new TbStudentExample();
        TbStudentExample.Criteria criteria=studentExample.createCriteria();
        criteria.andStudentIdEqualTo(student.getStudentId());
        int a=studentMapper.updateByExample(student,studentExample);
        if(a==0){
            return false;
        }
        else
            return true;
    }
}
