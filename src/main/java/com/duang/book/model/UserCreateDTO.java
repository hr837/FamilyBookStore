package com.duang.book.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class UserCreateDTO {
    @Schema(description = "姓名", requiredMode = Schema.RequiredMode.REQUIRED, example = "小小", maxLength = 50)
    String name;
    @Schema(description = "昵称", example = "小小读者", maxLength = 200)
    String nickName;
    @Schema(description = "手机号", requiredMode = Schema.RequiredMode.REQUIRED, example = "13800138000", maxLength = 11, minLength = 11)
    String phone;
    @Schema(description = "性别", example = "男", allowableValues = {"男", "女"})
    String sex;
    @Schema(description = "生日", example = "1990-01-01", type = "string", format = "date")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    Date birthDay;
    @Schema(description = "地址", example = "西安市雁塔区太白南路1号", maxLength = 200)
    String address;
    @Schema(description = "邮箱", example = "user@example.com", maxLength = 100)
    String email;
}
