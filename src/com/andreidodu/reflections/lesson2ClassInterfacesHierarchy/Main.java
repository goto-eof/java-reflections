package com.andreidodu.reflections.lesson2ClassInterfacesHierarchy;

import com.andreidodu.reflections.lesson2ClassInterfacesHierarchy.targets.ClassA;
import com.andreidodu.reflections.lesson2ClassInterfacesHierarchy.util.ClazzUtil;

import java.util.Set;

public class Main {

    public static void main(String[] argv) {
        Set<String> interfaceNames = ClazzUtil.retrieveInterfaces(ClassA.class);
        System.out.println(interfaceNames);
    }
}
