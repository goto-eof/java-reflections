package com.andreidodu.reflections.lesson1.util;

import com.andreidodu.reflections.lesson1.dto.ClassProperties;
import com.andreidodu.reflections.lesson1.dto.ClazzType;

import java.util.List;

public class ClazzUtil {

    private final static List<String> javaPrefixes = List.of("com.sun.", "java", "javax", "jdk", "org.w3c", "org.xml");


    public static ClazzType calculateClazzType(Class<?> clazz) {
        return clazz.isInterface() ? ClazzType.INTERFACE : (clazz.isEnum() ? ClazzType.ENUM : ClazzType.CLASS);
    }

    public static ClassProperties retrieveClazzInfo(Class<?> clazz) {
        ClassProperties classProperties = new ClassProperties();
        classProperties.setJDKClass(ClazzUtil.isJavaClass(clazz));
        classProperties.setName(clazz.getSimpleName());
        classProperties.setPackageName(clazz.getPackageName());
        classProperties.setType(ClazzUtil.calculateClazzType(clazz));
        return classProperties;
    }

    private static boolean isJavaClass(Class<?> clazz) {
        final String packageName = clazz.getPackageName();
        return javaPrefixes.stream().anyMatch(packageName::startsWith);
    }

}
