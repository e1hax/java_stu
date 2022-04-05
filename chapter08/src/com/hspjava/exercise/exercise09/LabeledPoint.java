package com.hspjava.exercise.exercise09;

public class LabeledPoint extends Point {
    private String  name;

    public LabeledPoint(String name,double x, double y) {
        super(x, y);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
