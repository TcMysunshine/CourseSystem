package com.nju.service.impl;


import com.nju.dao.mapper.UserMapper;
import com.nju.entity.User;
import com.nju.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public User sel(Integer id) {
        return userMapper.Sel(id);
    }

    @Override
    public User selectByUserNameAndPassWord(String userName, String passWord){
        return userMapper.selectByUserNameAndPW(userName,passWord);
    }

}
