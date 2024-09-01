package com.andreidodu.reflections.lesson3DependencyInjection.beans;

public class ClassC {

    private ClassCC classCC;

    public ClassC(ClassCC classCC) {
        this.classCC = classCC;
        System.out.println(this.getClass() + " initialized");
    }

    public ClassCC getClassCC() {
        return classCC;
    }

    public void setClassCC(ClassCC classCC) {
        this.classCC = classCC;
    }
}
