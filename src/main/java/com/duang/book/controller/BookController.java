package com.duang.book.controller;

import com.duang.book.model.Book;
import com.duang.book.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    BookService bookService;

    @GetMapping()
    public List<Book> getBooks(Book book) {
       return bookService.getBooks(book);
    }

    @GetMapping("{id}")
    public Book getBookById(@PathVariable String id) {
        return bookService.getBookById(id);
    }
}
