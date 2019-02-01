package com.nju.service.impl;

import com.nju.dao.mapper.TbDepartmentMapper;
import com.nju.dao.mapper.TbStudentMapper;
import com.nju.entity.TbDepartment;
import com.nju.entity.TbDepartmentExample;
import com.nju.entity.TbStudent;
import com.nju.entity.TbStudentExample;
import com.nju.entity.vo.StudentInfoVo;
import com.nju.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    TbStudentMapper studentMapper;

    @Autowired
    TbDepartmentMapper departmentMapper;

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

    @Override
    public List<StudentInfoVo> getStudents(String studentCount, String studentName, String departmentName, String departmentPerfession){
        TbStudentExample studentExample=new TbStudentExample();
        TbStudentExample.Criteria criteria=studentExample.createCriteria();
        if (studentCount!=null&&studentCount!=""){
            criteria.andStudentCountLike(studentCount);
        }
        if (studentName!=null&&studentName!=""){
            criteria.andStudentNameLike(studentName);
        }
        TbDepartmentExample departmentExample=new TbDepartmentExample();
        TbDepartmentExample.Criteria criteria1=departmentExample.createCriteria();
        if(departmentName!=null&&departmentName!=""){
            criteria1.andDepartmentNameLike(departmentName);
        }
        if(departmentPerfession!=null&&departmentPerfession!=""){
            criteria1.andDepartmentPerfessionLike(departmentPerfession);
        }
        List<TbDepartment> departments=departmentMapper.selectByExample(departmentExample);
        List<Integer> departmentIds=new ArrayList<>();
        for (int i=0;i<departments.size();i++){
            departmentIds.add(departments.get(i).getDepartmentId());
        }
        criteria.andStudentDepartmentIn(departmentIds);
        List<TbStudent> students=studentMapper.selectByExample(studentExample);
        List<StudentInfoVo> studentInfoVos=new ArrayList<>();
        for (int i=0;i<students.size();i++){
            StudentInfoVo studentInfoVo=new StudentInfoVo();
            studentInfoVo.setStudentCount(students.get(i).getStudentCount());
            studentInfoVo.setStudentName(students.get(i).getStudentName());
            if (students.get(i).getStudentSex()==1)
                studentInfoVo.setStudentSex("男");
            else
                studentInfoVo.setStudentSex("女");
            studentInfoVo.setStudentEmail(students.get(i).getStudentEmail());
            studentInfoVo.setStudentEmail(students.get(i).getStudentEmail());
            TbDepartmentExample departmentExample1=new TbDepartmentExample();
            TbDepartmentExample.Criteria criteria2=departmentExample1.createCriteria();
            criteria2.andDepartmentIdEqualTo(students.get(i).getStudentDepartment());
            List<TbDepartment> departments1=departmentMapper.selectByExample(departmentExample1);
            if (departments1.size()!=0){
                studentInfoVo.setDepartmentName(departments1.get(0).getDepartmentName());
                studentInfoVo.setDepartmentPerfession(departments1.get(0).getDepartmentPerfession());
            }
            studentInfoVos.add(studentInfoVo);
        }
        return studentInfoVos;

    }

    @Override
    public List<TbStudent> addStudents(Integer studentNum){
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        int year = cal.get(Calendar.YEAR);
        String year1=year+"";

        List<TbStudent> students = new ArrayList<>();
        for (int i=1;i<=studentNum;i++){
            String studentCount=year1.substring(2,4)+"32";
            if (i<10)
                studentCount=studentCount+"00"+i;
            else if(i<100)
                studentCount=studentCount+"0"+i;
            else
                studentCount=studentCount+i;
            TbStudent student=new TbStudent();
            student.setStudentCount(studentCount);
            student.setStudentName(studentCount);
            student.setStudentSex(1);
            student.setStudentType(2);
            student.setStudentPassword("123456");
            student.setStudentDepartment(1);
            student.setStudentCreatetime(new Date());
            studentMapper.insert(student);
            students.add(student);
        }

        return students;
    }
}
