package com.java.designpattrn.pattern.factory.ex5;

/**
 * @author dadisdad
 * @date 2018/3/15
 */
public class Client {

    public static void main(String[] args) {
        Product p1 = ProductFactory.createProduct("Product1");
        Product p2 = ProductFactory.createProduct("Product1");
        Product p3 = ProductFactory.createProduct("Product2");
        Product p4 = ProductFactory.createProduct("Product2");
        p1.method2();
        p2.method2();
        p3.method2();
        p4.method2();
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
    }

}
