package com.duang.book.service;

import com.duang.book.mapper.BookMapper;
import com.duang.book.mapper.UserMapper;
import com.duang.book.model.Book;
import com.duang.book.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserMapper userMapper;

    public List<User> getUsers(User user) {
        return userMapper.getUsers(user);
    }

    public User getUserById(String id) {
        User user = new User();
        user.setId(id);
        return userMapper.getUsers(user).getFirst();
    }
}
