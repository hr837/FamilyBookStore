package com.duang.book.mapper;

import com.duang.book.model.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface BookMapper {
    /**
     * 根据book对象的属性查询
     * @param book
     * @return
     */
    List<Book> getBooks(Book book);
}
