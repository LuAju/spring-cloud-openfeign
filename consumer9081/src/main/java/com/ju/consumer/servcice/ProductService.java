package com.ju.consumer.servcice;

import com.ju.common.entity.Product;
import com.ju.common.response.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
// 确定目的服务的服务名
@FeignClient("cloud-service")
public interface ProductService {
    @GetMapping("/get/{id}")
    public Object get(@PathVariable("id") String id );

    @RequestMapping("/addProduct")
    public Object post(@RequestBody Product product);
}
