package com.wy.boot.dao;

import com.wy.boot.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserDao {
    User getUserById(@Param("id") Integer id);
}
