package com.nju.service.impl;

import com.nju.dao.mapper.TbImgMapper;
import com.nju.entity.TbImg;
import com.nju.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FileServiceImpl implements FileService {
    @Autowired
    private TbImgMapper tbImgMapper;

    @Override
    public int insertImage(TbImg img) {
        return tbImgMapper.insert(img);
    }

    @Override
    public TbImg selectByPrimaryKey(int ImgId) {
        return tbImgMapper.selectByPrimaryKey(ImgId);
    }
}
