package com.nju.service;

import com.nju.entity.User;

public interface UserService {
    User sel(Integer id);
    User selectByUserNameAndPassWord(String userName, String passWord);
}
