package com.nju.dao.mapper;

import com.nju.entity.TbCourse;
import com.nju.entity.TbCourseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbCourseMapper {
    int countByExample(TbCourseExample example);

    int deleteByExample(TbCourseExample example);

    int deleteByPrimaryKey(Integer courseId);

    int insert(TbCourse record);

    int insertSelective(TbCourse record);

    List<TbCourse> selectByExample(TbCourseExample example);

    TbCourse selectByPrimaryKey(Integer courseId);

    int updateByExampleSelective(@Param("record") TbCourse record, @Param("example") TbCourseExample example);

    int updateByExample(@Param("record") TbCourse record, @Param("example") TbCourseExample example);

    int updateByPrimaryKeySelective(TbCourse record);

    int updateByPrimaryKey(TbCourse record);

    List<TbCourse> getCourse();
}