package com.duang.book.service;

import com.duang.book.mapper.UserMapper;
import com.duang.book.model.User;
import com.duang.book.model.UserCreateDTO;
import com.duang.book.model.UserQueryDTO;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    @Autowired
    UserMapper userMapper;

    public Page<User> queryUsers(UserQueryDTO query) {
        return PageHelper.startPage(query.getPageNum(), query.getPageSize())
                .doSelectPage(() -> userMapper.selectByPageNumSize(query));
//        List<User> users = userMapper.selectByPageNumSize(query);
//        return users;
    }

    public User getUserById(String id) {
        return userMapper.getUserById(id).getFirst();
    }

    public User addUser(UserCreateDTO createUser) {
        User user = new User();
        BeanUtils.copyProperties(createUser, user);
        String id = UUID.randomUUID().toString();
        user.setId(id);
        user.setPassword("123456");
        userMapper.addUser(user);
        // 返回新增的User对象
        return getUserById(id);
    }
}
