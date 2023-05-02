package com.springneo4j.springneo4jdemo.repository;

import com.springneo4j.springneo4jdemo.node.Book;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface BookRepository extends Neo4jRepository<Book,Integer> {
    Book findByName(String name);
}
