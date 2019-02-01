package com.nju.dao.mapper;

import com.nju.entity.TbTccHomework;
import com.nju.entity.TbTccHomeworkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface TbTccHomeworkMapper {
    int countByExample(TbTccHomeworkExample example);

    int deleteByExample(TbTccHomeworkExample example);

    int deleteByPrimaryKey(Integer tcchId);

    int insert(TbTccHomework record);

    int insertSelective(TbTccHomework record);

    List<TbTccHomework> selectByExample(TbTccHomeworkExample example);

    TbTccHomework selectByPrimaryKey(Integer tcchId);

    int updateByExampleSelective(@Param("record") TbTccHomework record, @Param("example") TbTccHomeworkExample example);

    int updateByExample(@Param("record") TbTccHomework record, @Param("example") TbTccHomeworkExample example);

    int updateByPrimaryKeySelective(TbTccHomework record);

    int updateByPrimaryKey(TbTccHomework record);
}