package com.java.designpattrn.pattern.decorator.ex4;

/**
 * @author 10308
 * @date 2018/4/9
 */
public class ConcreteComponent extends Component {

    @Override
    public void operate() {
        System.out.println("do something");
    }
}
