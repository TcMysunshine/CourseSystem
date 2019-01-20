package com.nju.service.impl;

import com.nju.dao.mapper.TbSemesterMapper;
import com.nju.entity.TbSemesterExample;
import com.nju.service.SemesterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SemesterServiceImpl implements SemesterService {
    @Autowired
    TbSemesterMapper semesterMapper;
    @Override
    public String getCurrentSemester(){
        TbSemesterExample tbSemesterExample=new TbSemesterExample();
        TbSemesterExample.Criteria criteria=tbSemesterExample.createCriteria();
        criteria.andSemesterIsCurrentEqualTo(1);
        return semesterMapper.selectByExample(tbSemesterExample).get(0).getSemesterName();
    }
}
