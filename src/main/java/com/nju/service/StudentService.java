package com.nju.service;

import com.nju.entity.TbStudent;

public interface StudentService {

    TbStudent getStudent(String studentCount, String studentPassword);

    Boolean editStudentInfo(TbStudent student);
}
