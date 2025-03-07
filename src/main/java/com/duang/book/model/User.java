package com.duang.book.model;

import lombok.Data;

import java.util.Date;

@Data
public class User {
    String id;
    String name;
    String nickName;
    String phone;
    String sex;
    Date birth;
    String address;
    String email;
}
