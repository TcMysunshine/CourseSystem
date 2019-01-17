package com.nju.service;

import com.nju.entity.TbTeacher;

import java.util.List;

public interface TeacherService {
    //根据编号和密码查找用户
    List<TbTeacher> findTeacherByCountPass(String count, String pass);
    //编辑用户
    Boolean editTeacherInfo(TbTeacher teacher);
}
