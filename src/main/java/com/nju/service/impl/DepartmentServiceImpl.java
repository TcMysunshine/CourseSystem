package com.nju.service.impl;

import com.nju.dao.mapper.TbDepartmentMapper;
import com.nju.entity.TbDepartment;
import com.nju.entity.TbDepartmentExample;
import com.nju.entity.TbStudentExample;
import com.nju.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    TbDepartmentMapper departmentMapper;

    public TbDepartment getDepartmentById(Integer id){
        TbDepartmentExample departmentExample=new TbDepartmentExample();
        TbDepartmentExample.Criteria criteria=departmentExample.createCriteria();
        criteria.andDepartmentIdEqualTo(id);
        List<TbDepartment> departments=departmentMapper.selectByExample(departmentExample);
        if(departments.size()>0){
            return departments.get(0);
        }
        else
            return null;
    }
}
