package com.java.designpattrn.pattern.composite.ex4;

/**
 * @author dadisdad
 * @date 2018/4/12
 */
public class Client {

    public static void main(String[] args) {
        Composite root = new Composite();
        root.doSomething();
        Composite branch = new Composite();
        Leaf leaf = new Leaf();
        root.add(branch);
        branch.add(leaf);

        display(root);
    }

    public static void display(Composite root) {
        for (Component c : root.getChildren()) {
            if (c instanceof Leaf) {
                c.doSomething();
            } else {
                display((Composite) c);
            }

        }
    }
}
