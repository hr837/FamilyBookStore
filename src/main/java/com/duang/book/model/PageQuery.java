package com.duang.book.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.List;

@Data
public class PageQuery {
    @Schema(description = "页码,从1开始", example = "1", defaultValue = "1", minimum = "1")
    Integer pageNum;
    @Schema(description = "每页记录数", example = "10", defaultValue = "10", minimum = "1")
    Integer pageSize;
}
