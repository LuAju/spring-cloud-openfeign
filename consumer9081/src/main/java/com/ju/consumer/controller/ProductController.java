package com.ju.consumer.controller;

import com.ju.common.entity.Product;
import com.ju.consumer.servcice.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/get/{id}")
    public Object get(@PathVariable("id") String id ){
        Object o = productService.get(id);
        return o;
    }

    @RequestMapping("/addProduct")
    public Object post(@RequestBody Product product){
        return productService.post(product);
    }
}
