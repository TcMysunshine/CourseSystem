package com.nju.dao.mapper;

import com.nju.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    User Sel(int id);
    User selectByUserNameAndPW(@Param("userName") String userName, @Param("passWord") String passWord);
}
