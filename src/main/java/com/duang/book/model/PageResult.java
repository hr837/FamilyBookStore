package com.duang.book.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.List;

@Data
public class PageResult<T> extends PageQuery {
    /**
     * 总记录数
     */
    @Schema(description = "总记录数")
    int total;
    @Schema(description = "当前页记录数")
    int size;
    @Schema(description = "当前页数据")
    List<T> records;
}
