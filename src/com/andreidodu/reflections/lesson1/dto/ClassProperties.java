package com.andreidodu.reflections.lesson1.dto;


public class ClassProperties {

    private boolean isJDKClass;
    private String name;
    private String packageName;
    private ClazzType clazzType;

    public boolean isJDKClass() {
        return isJDKClass;
    }

    public void setJDKClass(boolean JDKClass) {
        isJDKClass = JDKClass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public ClazzType getType() {
        return clazzType;
    }

    public void setType(ClazzType clazzType) {
        this.clazzType = clazzType;
    }

    @Override
    public String toString() {
        return "This is a " + (isJDKClass ? "JDK" : "Custom") + " type" +
                ", Name: " + name +
                ", Package: " + packageName +
                ", Type: " + (clazzType.name());
    }
}
