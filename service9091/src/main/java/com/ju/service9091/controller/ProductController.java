package com.ju.service9091.controller;

import com.ju.common.entity.Product;
import com.ju.common.response.Result;
import com.ju.service9091.cache.ProductListCache;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ProductController {
    @RequestMapping("/get/{id}")
    public Object get(@PathVariable("id") String id ){

        if (Integer.valueOf(id)>= ProductListCache.size()) {
            return new Result<>().buildFail("no such index");
        }
        Product product = ProductListCache.getProduct(Integer.parseInt(id));
        Result<Object> objectResult = new Result<>().buildSuccess(product);

        return objectResult;
    }

    @RequestMapping("/addProduct")
    public Object post(@RequestBody Product product){
        if (ProductListCache.addProduct(product)) {
            return new Result<>().buildSuccess(true);
        }
        return new Result<>().buildFail("主键不能为0");
    }
}
