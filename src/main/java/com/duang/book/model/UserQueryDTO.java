package com.duang.book.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class UserQueryDTO extends PageQuery {
    @Schema(description = "姓名", example = "小小")
    String name;
    @Schema(description = "昵称", example = "小小读者")
    String nickName;
    @Schema(description = "手机号", example = "13800138000")
    String phone;
}
