package com.andreidodu.reflections.lesson2;

import com.andreidodu.reflections.lesson2.targets.ClassA;
import com.andreidodu.reflections.lesson2.util.ClazzUtil;

import java.util.Set;

public class Main {

    public static void main(String[] argv) {
        Set<String> interfaceNames = ClazzUtil.retrieveInterfaces(ClassA.class);
        System.out.println(interfaceNames);
    }
}
