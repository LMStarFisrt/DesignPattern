package com.java.designpattrn.pattern.iterator.ex3;

import java.util.Vector;

/**
 * @author 10308
 * @date 2018/4/11
 */
public class ConcreteAggregate implements Aggregate {

    private Vector vector = new Vector();

    @Override
    public void add(Object object) {
        vector.add(object);
    }

    @Override
    public void remove(Object object) {
        vector.remove(object);
    }

    @Override
    public Iterator iterator() {
        return new ConcreteIterator(vector);
    }
}
