package com.duang.book.mapper;

import com.duang.book.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    /**
     * 根据user对象的属性查询
     *
     * @param user
     * @return
     */
    List<User> getUsers(User user);
}
