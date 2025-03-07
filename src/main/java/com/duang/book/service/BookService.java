package com.duang.book.service;

import com.duang.book.mapper.BookMapper;
import com.duang.book.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    BookMapper bookMapper;

    public List<Book> getBooks(Book book) {
        return bookMapper.getBooks(book);
    }

    public Book getBookById(String id) {
        Book book = new Book();
        book.setId(id);
        return bookMapper.getBooks(book).getFirst();
    }
}
