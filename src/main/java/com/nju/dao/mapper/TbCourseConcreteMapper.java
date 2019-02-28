package com.nju.dao.mapper;

import com.nju.entity.TbCourseConcrete;
import com.nju.entity.TbCourseConcreteExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbCourseConcreteMapper {
    int countByExample(TbCourseConcreteExample example);

    int deleteByExample(TbCourseConcreteExample example);

    int deleteByPrimaryKey(Integer courseConcreteId);

    int insert(TbCourseConcrete record);

    int insertSelective(TbCourseConcrete record);

    List<TbCourseConcrete> selectByExample(TbCourseConcreteExample example);

    TbCourseConcrete selectByPrimaryKey(Integer courseConcreteId);

    int updateByExampleSelective(@Param("record") TbCourseConcrete record, @Param("example") TbCourseConcreteExample example);

    int updateByExample(@Param("record") TbCourseConcrete record, @Param("example") TbCourseConcreteExample example);

    int updateByPrimaryKeySelective(TbCourseConcrete record);

    int updateByPrimaryKey(TbCourseConcrete record);
}