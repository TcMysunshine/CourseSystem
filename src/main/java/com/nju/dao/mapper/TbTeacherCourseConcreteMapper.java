package com.nju.dao.mapper;

import com.nju.entity.TbTeacherCourseConcrete;
import com.nju.entity.TbTeacherCourseConcreteExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbTeacherCourseConcreteMapper {
    int countByExample(TbTeacherCourseConcreteExample example);

    int deleteByExample(TbTeacherCourseConcreteExample example);

    int deleteByPrimaryKey(Integer tcid);

    int insert(TbTeacherCourseConcrete record);

    int insertSelective(TbTeacherCourseConcrete record);

    List<TbTeacherCourseConcrete> selectByExample(TbTeacherCourseConcreteExample example);

    TbTeacherCourseConcrete selectByPrimaryKey(Integer tcid);

    int updateByExampleSelective(@Param("record") TbTeacherCourseConcrete record, @Param("example") TbTeacherCourseConcreteExample example);

    int updateByExample(@Param("record") TbTeacherCourseConcrete record, @Param("example") TbTeacherCourseConcreteExample example);

    int updateByPrimaryKeySelective(TbTeacherCourseConcrete record);

    int updateByPrimaryKey(TbTeacherCourseConcrete record);
}