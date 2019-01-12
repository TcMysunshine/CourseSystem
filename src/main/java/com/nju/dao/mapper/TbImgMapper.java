package com.nju.dao.mapper;

import com.nju.entity.TbImg;
import com.nju.entity.TbImgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbImgMapper {
    int countByExample(TbImgExample example);

    int deleteByExample(TbImgExample example);

    int deleteByPrimaryKey(Integer imgId);

    int insert(TbImg record);

    int insertSelective(TbImg record);

    List<TbImg> selectByExample(TbImgExample example);

    TbImg selectByPrimaryKey(Integer imgId);

    int updateByExampleSelective(@Param("record") TbImg record, @Param("example") TbImgExample example);

    int updateByExample(@Param("record") TbImg record, @Param("example") TbImgExample example);

    int updateByPrimaryKeySelective(TbImg record);

    int updateByPrimaryKey(TbImg record);
}