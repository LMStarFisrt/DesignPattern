package com.java.designpattrn.pattern.factory.ex5;

import java.util.HashMap;
import java.util.Map;

/**
 * @author dadisdad
 * @date 2018/3/15
 */
public class ProductFactory {

    private static final Map<String, Product> prMap = new HashMap<>();

    public static synchronized Product createProduct(String type) {
        Product product = null;
        if (prMap.containsKey(type)) {
            product = prMap.get(type);
        } else {
            if (type.equals("Product1")) {
                product = new ConcreProduct1();
            } else {
                product = new ConcreProduct2();
            }
            prMap.put(type, product);
        }
        return product;
    }

}
