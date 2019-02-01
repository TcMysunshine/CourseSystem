package com.nju.dao.mapper;

import com.nju.entity.TbTeacherCourse;
import com.nju.entity.TbTeacherCourseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface TbTeacherCourseMapper {
    int countByExample(TbTeacherCourseExample example);

    int deleteByExample(TbTeacherCourseExample example);

    int deleteByPrimaryKey(Integer tcid);

    int insert(TbTeacherCourse record);

    int insertSelective(TbTeacherCourse record);

    List<TbTeacherCourse> selectByExample(TbTeacherCourseExample example);

    TbTeacherCourse selectByPrimaryKey(Integer tcid);

    int updateByExampleSelective(@Param("record") TbTeacherCourse record, @Param("example") TbTeacherCourseExample example);

    int updateByExample(@Param("record") TbTeacherCourse record, @Param("example") TbTeacherCourseExample example);

    int updateByPrimaryKeySelective(TbTeacherCourse record);

    int updateByPrimaryKey(TbTeacherCourse record);
}