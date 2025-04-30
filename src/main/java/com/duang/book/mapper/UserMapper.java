package com.duang.book.mapper;

import com.duang.book.model.User;
import com.duang.book.model.UserQueryDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    /**
     * 根据user对象的属性查询
     */
    List<User> selectByPageNumSize(UserQueryDTO user);

    List<User> getUserById(String id);

    Integer addUser(User user);
}
