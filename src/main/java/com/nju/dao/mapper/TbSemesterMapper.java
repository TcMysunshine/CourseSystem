package com.nju.dao.mapper;

import com.nju.entity.TbSemester;
import com.nju.entity.TbSemesterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TbSemesterMapper {
    int countByExample(TbSemesterExample example);

    int deleteByExample(TbSemesterExample example);

    int deleteByPrimaryKey(Integer semesterId);

    int insert(TbSemester record);

    int insertSelective(TbSemester record);

    List<TbSemester> selectByExample(TbSemesterExample example);

    TbSemester selectByPrimaryKey(Integer semesterId);

    int updateByExampleSelective(@Param("record") TbSemester record, @Param("example") TbSemesterExample example);

    int updateByExample(@Param("record") TbSemester record, @Param("example") TbSemesterExample example);

    int updateByPrimaryKeySelective(TbSemester record);

    int updateByPrimaryKey(TbSemester record);
}