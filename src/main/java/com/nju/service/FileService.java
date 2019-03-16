package com.nju.service;

import com.nju.entity.TbImg;

/**
 * created by Sammi_wang
 */
public interface FileService {
    int insertImage(TbImg img);

    TbImg selectByPrimaryKey(int ImgId);
}
