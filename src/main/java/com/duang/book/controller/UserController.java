package com.duang.book.controller;

import com.duang.book.model.Book;
import com.duang.book.model.User;
import com.duang.book.service.BookService;
import com.duang.book.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping()
    public List<User> getUsers(User user) {
        return userService.getUsers(user);
    }

    @GetMapping("{id}")
    public User getUserById(@PathVariable String id) {
        return userService.getUserById(id);
    }
}
