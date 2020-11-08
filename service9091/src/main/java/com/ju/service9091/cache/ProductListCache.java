package com.ju.service9091.cache;

import com.ju.common.entity.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductListCache {
    private static List<Product> productList = new ArrayList<>();

    static {
        productList.add(Product.builder().id(1).name("黑人牙膏").price(15.50).build());
        productList.add(Product.builder().id(2).name("蒙牛牛奶").price(55.50).build());
    }

    public synchronized static Product getProduct(int index) {
        return productList.get(index);
    }

    public static boolean addProduct(Product product) {
        if (product.getId() == 0) {
            return false;
        } else {
            productList.add(product);
            return true;
        }
    }

    public static int size() {
        return productList.size();
    }
}
