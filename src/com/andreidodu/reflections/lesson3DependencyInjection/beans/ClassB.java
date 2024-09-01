package com.andreidodu.reflections.lesson3DependencyInjection.beans;

public class ClassB {

    private ClassBB classBB;

    public ClassB(ClassBB classBB) {
        this.classBB = classBB;
        System.out.println(this.getClass() + " initialized");
    }

    public ClassBB getClassBB() {
        return classBB;
    }

    public void setClassBB(ClassBB classBB) {
        this.classBB = classBB;
    }
}
