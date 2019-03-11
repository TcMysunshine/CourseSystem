package com.nju.dao.mapper;

import com.nju.entity.TbStudentCourseConcrete;
import com.nju.entity.TbStudentCourseConcreteExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbStudentCourseConcreteMapper {
    int countByExample(TbStudentCourseConcreteExample example);

    int deleteByExample(TbStudentCourseConcreteExample example);

    int deleteByPrimaryKey(Integer scId);

    int insert(TbStudentCourseConcrete record);

    int insertSelective(TbStudentCourseConcrete record);

    List<TbStudentCourseConcrete> selectByExample(TbStudentCourseConcreteExample example);

    TbStudentCourseConcrete selectByPrimaryKey(Integer scId);

    int updateByExampleSelective(@Param("record") TbStudentCourseConcrete record, @Param("example") TbStudentCourseConcreteExample example);

    int updateByExample(@Param("record") TbStudentCourseConcrete record, @Param("example") TbStudentCourseConcreteExample example);

    int updateByPrimaryKeySelective(TbStudentCourseConcrete record);

    int updateByPrimaryKey(TbStudentCourseConcrete record);
}