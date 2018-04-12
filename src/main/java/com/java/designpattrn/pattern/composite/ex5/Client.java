package com.java.designpattrn.pattern.composite.ex5;

/**
 * @author dadisdad
 * @date 2018/4/12
 */
public class Client {

    public static void display(Component root) {
        for (Component c : root.getChildren()) {
            if (c instanceof Leaf) {
                c.doSomething();
            } else {
                display(c);
            }
        }
    }
}
