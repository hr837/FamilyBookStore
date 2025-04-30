package com.duang.book.controller;

import com.duang.book.model.Book;
import com.duang.book.service.BookService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Tag(name = "图书管理")
@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    BookService bookService;

    @Operation(summary = "查询图书")
    @GetMapping()
    public List<Book> getBooks(Book book) {
       return bookService.getBooks(book);
    }

    @Operation(summary = "根据ID获取图书详情")
    @GetMapping("{id}")
    public Book getBookById(@PathVariable String id) {
        return bookService.getBookById(id);
    }
}
