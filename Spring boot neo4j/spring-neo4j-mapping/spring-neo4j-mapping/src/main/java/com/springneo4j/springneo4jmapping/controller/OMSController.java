package com.springneo4j.springneo4jmapping.controller;

import com.springneo4j.springneo4jmapping.node.Customer;
import com.springneo4j.springneo4jmapping.node.Product;
import com.springneo4j.springneo4jmapping.repository.CustomerRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class OMSController {

    @Autowired
    CustomerRepository customerRepository;

    @PostConstruct
    public void purchaseOrder()
    {
        List<Product> productList=new ArrayList<>();
        productList.add(new Product(999,"Bike",1,100000));
        productList.add(new Product(333,"AC",1,30000));
        productList.add(new Product(789,"Computer",1,80000));
        Customer customer= Customer.builder().custId(101).name("yaswanth").address(new String[]{"Banglore","Electronic City"}).products(productList).build();
        customerRepository.save(customer);
    }
    @GetMapping("/getOrders")
    public List<Customer> getPurchaseOrder()
    {
        return customerRepository.findAll();
    }
    @GetMapping("/getInfo/{name}")
    public Customer getCustomerInfo(@PathVariable("name")String name)
    {
        return customerRepository.findByName(name);
    }
}
