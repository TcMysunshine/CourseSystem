package com.nju.dao.mapper;

import com.nju.entity.TbStudentCourse;
import com.nju.entity.TbStudentCourseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbStudentCourseMapper {
    int countByExample(TbStudentCourseExample example);

    int deleteByExample(TbStudentCourseExample example);

    int deleteByPrimaryKey(Integer scId);

    int insert(TbStudentCourse record);

    int insertSelective(TbStudentCourse record);

    List<TbStudentCourse> selectByExample(TbStudentCourseExample example);

    TbStudentCourse selectByPrimaryKey(Integer scId);

    int updateByExampleSelective(@Param("record") TbStudentCourse record, @Param("example") TbStudentCourseExample example);

    int updateByExample(@Param("record") TbStudentCourse record, @Param("example") TbStudentCourseExample example);

    int updateByPrimaryKeySelective(TbStudentCourse record);

    int updateByPrimaryKey(TbStudentCourse record);
}