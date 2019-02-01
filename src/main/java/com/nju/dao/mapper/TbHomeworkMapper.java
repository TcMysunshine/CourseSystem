package com.nju.dao.mapper;

import com.nju.entity.TbHomework;
import com.nju.entity.TbHomeworkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface TbHomeworkMapper {
    int countByExample(TbHomeworkExample example);

    int deleteByExample(TbHomeworkExample example);

    int deleteByPrimaryKey(Integer homeworkId);

    int insert(TbHomework record);

    int insertSelective(TbHomework record);

    List<TbHomework> selectByExample(TbHomeworkExample example);

    TbHomework selectByPrimaryKey(Integer homeworkId);

    int updateByExampleSelective(@Param("record") TbHomework record, @Param("example") TbHomeworkExample example);

    int updateByExample(@Param("record") TbHomework record, @Param("example") TbHomeworkExample example);

    int updateByPrimaryKeySelective(TbHomework record);

    int updateByPrimaryKey(TbHomework record);
}