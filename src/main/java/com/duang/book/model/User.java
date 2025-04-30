package com.duang.book.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class User {
    @Schema(description = "用户ID")
    String id;
    @Schema(description = "姓名")
    String name;
    @Schema(description = "昵称")
    String nickName;
    @Schema(description = "手机号")
    String phone;
    @Schema(description = "性别", allowableValues = {"男", "女"})
    String sex;
    @Schema(description = "生日", example = "1990-01-01")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    Date birthDay;
    @Schema(description = "地址")
    String address;
    @Schema(description = "邮箱")
    String email;
    @JsonIgnore
    String password;
}
