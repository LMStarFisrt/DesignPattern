package com.java.designpattrn.pattern.iterator.ex3;

import java.util.Vector;

/**
 * @author 10308
 * @date 2018/4/11
 */
public class ConcreteIterator implements Iterator {

    private Vector vector = new Vector();

    private int cursor = 0;

    public ConcreteIterator(Vector vector) {
        this.vector = vector;
    }

    @Override
    public Object next() {
        Object result = null;
        if (this.hasNext()) {
            result = vector.get(cursor++);
        }
        return result;
    }

    @Override
    public boolean hasNext() {
        return !(cursor == vector.size());
    }

    @Override
    public boolean remove() {
        vector.remove(cursor);
        return true;
    }
}
