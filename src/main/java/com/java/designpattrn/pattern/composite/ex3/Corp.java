package com.java.designpattrn.pattern.composite.ex3;

/**
 * @author dadisdad
 * @date 2018/4/12
 */
public abstract class Corp {

    private String name = "";
    private String position = "";
    private int salary = 0;

    private Corp parent = null;

    public Corp(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public String getInfo() {
        StringBuilder builder = new StringBuilder();
        builder = builder.append("名称：").append(name)
                .append("\t职位：").append(position)
                .append("\t薪水：").append(salary);
        return builder.toString();
    }

    protected void setParent(Corp parent){
        this.parent = parent;
    }

    public Corp getParent(){
        return this.parent;
    }

}
