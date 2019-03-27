package com.nju.dao.mapper;

import com.nju.entity.TbWeek;
import com.nju.entity.TbWeekExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbWeekMapper {
    int countByExample(TbWeekExample example);

    int deleteByExample(TbWeekExample example);

    int deleteByPrimaryKey(Integer weekId);

    int insert(TbWeek record);

    int insertSelective(TbWeek record);

    List<TbWeek> selectByExample(TbWeekExample example);

    TbWeek selectByPrimaryKey(Integer weekId);

    int updateByExampleSelective(@Param("record") TbWeek record, @Param("example") TbWeekExample example);

    int updateByExample(@Param("record") TbWeek record, @Param("example") TbWeekExample example);

    int updateByPrimaryKeySelective(TbWeek record);

    int updateByPrimaryKey(TbWeek record);
}