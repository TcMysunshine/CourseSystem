package com.nju.dao.mapper;

import com.nju.entity.TbStudent;
import com.nju.entity.TbStudentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TbStudentMapper {
    int countByExample(TbStudentExample example);

    int deleteByExample(TbStudentExample example);

    int deleteByPrimaryKey(Integer studentId);

    int insert(TbStudent record);

    int insertSelective(TbStudent record);

    List<TbStudent> selectByExample(TbStudentExample example);

    TbStudent selectByPrimaryKey(Integer studentId);

    int updateByExampleSelective(@Param("record") TbStudent record, @Param("example") TbStudentExample example);

    int updateByExample(@Param("record") TbStudent record, @Param("example") TbStudentExample example);

    int updateByPrimaryKeySelective(TbStudent record);

    int updateByPrimaryKey(TbStudent record);
}