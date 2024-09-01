package com.andreidodu.reflections.lesson1ClassInfo;

import com.andreidodu.reflections.lesson1ClassInfo.target.CustomClass;
import com.andreidodu.reflections.lesson1ClassInfo.target.CustomEnum;
import com.andreidodu.reflections.lesson1ClassInfo.target.CustomInterface;
import com.andreidodu.reflections.lesson1ClassInfo.util.ClazzUtil;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Class<?>> classes = List.of(String.class, CustomClass.class, CustomEnum.class, CustomEnum.A.getClass(), CustomInterface.class);
        classes.forEach(clazz -> System.out.println(ClazzUtil.retrieveClazzInfo(clazz)));
    }

}