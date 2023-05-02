package com.springneo4j.springneo4jmapping.repository;

import com.springneo4j.springneo4jmapping.node.Product;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface ProductRepository extends Neo4jRepository<Product,Integer> {
}
