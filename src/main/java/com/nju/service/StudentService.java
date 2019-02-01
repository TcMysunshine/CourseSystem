package com.nju.service;

import com.nju.entity.TbStudent;
import com.nju.entity.vo.StudentInfoVo;

import java.util.List;

public interface StudentService {

    TbStudent getStudent(String studentCount, String studentPassword);

    Boolean editStudentInfo(TbStudent student);

    List<StudentInfoVo> getStudents(String count, String studentName, String departmentName, String departmentPerfession);

    List<TbStudent> addStudents(Integer studentNum);
}
