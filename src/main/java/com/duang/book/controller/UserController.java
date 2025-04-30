package com.duang.book.controller;

import com.duang.book.model.User;
import com.duang.book.model.UserCreateDTO;
import com.duang.book.model.UserQueryDTO;
import com.duang.book.service.UserService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "用户管理")
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @Operation(summary = "查询用户")
    @GetMapping()
    public Page<User> queryUsers(UserQueryDTO query) {
        return userService.queryUsers(query);
    }

    @Operation(summary = "根据ID获取用户详情")
    @GetMapping("{id}")
    public User getUserById(@PathVariable String id) {
        return userService.getUserById(id);
    }

    @Operation(summary = "添加用户")
    @PostMapping()
    public User addUser(UserCreateDTO create) {
        return userService.addUser(create);
    }
}
