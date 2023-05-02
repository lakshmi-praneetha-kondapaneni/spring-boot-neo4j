package com.springneo4j.springneo4jmapping.repository;

import com.springneo4j.springneo4jmapping.node.Customer;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface CustomerRepository extends Neo4jRepository<Customer,Integer> {
    Customer findByName(String name);
}
