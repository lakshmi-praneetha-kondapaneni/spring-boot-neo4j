package com.springneo4j.springneo4jdemo.controller;

import com.springneo4j.springneo4jdemo.node.Book;
import com.springneo4j.springneo4jdemo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class BookController {
    @Autowired
    BookRepository bookRepository;

    @PostMapping("/addBook")
    public String addBook(@RequestBody Book book)
    {
        bookRepository.save(book);
        return "Book added";
    }
    @GetMapping("/getBooks")
    public List<Book> getBooks()
    {
        return bookRepository.findAll();
    }
    @GetMapping("/getBook/{name}")
    public Book getBook(@PathVariable("name")String name)
    {
        return bookRepository.findByName(name);
    }
    @DeleteMapping("/deleteBook/{id}")
    public String deleteBook(@PathVariable Integer id)
    {
        bookRepository.deleteById(id);
        return "Book deleted with id: "+id;
    }
}
