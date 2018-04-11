package com.java.designpattrn.pattern.iterator.ex3;

/**
 * @author 10308
 * @date 2018/4/11
 */
public class Client {

    public static void main(String[] args) {
        Aggregate aggregate = new ConcreteAggregate();
        aggregate.add("abc");
        aggregate.add("bbb");
        aggregate.add("1234");
        Iterator iterator = aggregate.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
