package com.java.designpattrn.pattern.observer.ex1;

/**
 * @author dadisdad
 * @date 2018/4/17
 */
public interface Observable {

    void addObserver(Observer observer);

    void deleteObserver(Observer observer);

    void notifyObservers(String context);
}
