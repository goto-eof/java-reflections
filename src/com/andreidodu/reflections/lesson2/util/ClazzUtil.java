package com.andreidodu.reflections.lesson2.util;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class ClazzUtil {

    public static Set<String> retrieveInterfaces(Class<?> clazz) {
        Set<String> interfaceNames = new TreeSet<>();

        Arrays.stream(clazz.getInterfaces()).map(Class::getSimpleName)
                .forEach(interfaceNames::add);
        Arrays.stream(clazz.getInterfaces()).map(ClazzUtil::retrieveInterfaces).forEach(interfaceNames::addAll);

        return interfaceNames;
    }

}
