package com.andreidodu.reflections.lesson3DependencyInjection.beans;

public class ClassA {
    private ClassAA classAA;

    public ClassA(ClassAA classAA) {
        this.classAA = classAA;
        System.out.println(this.getClass() + " created");
    }

    public ClassAA getClassAA() {
        return classAA;
    }

    public void setClassAA(ClassAA classAA) {
        this.classAA = classAA;
    }
}
