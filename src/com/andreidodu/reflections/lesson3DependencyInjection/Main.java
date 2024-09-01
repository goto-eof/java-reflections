package com.andreidodu.reflections.lesson3DependencyInjection;

import com.andreidodu.reflections.lesson3DependencyInjection.beans.ClassA;
import com.andreidodu.reflections.lesson3DependencyInjection.beans.ClassB;
import com.andreidodu.reflections.lesson3DependencyInjection.beans.ClassC;
import com.andreidodu.reflections.lesson3DependencyInjection.util.DependencyInjectionUtil;

import java.lang.reflect.InvocationTargetException;

public class Main {

    private ClassA classA;
    private ClassB classB;
    private ClassC classC;

    public Main(ClassA classA, ClassB classB, ClassC classC) {
        this.classA = classA;
        this.classB = classB;
        this.classC = classC;
    }

    public static void main(String argv[]) throws InvocationTargetException, InstantiationException, IllegalAccessException {
        DependencyInjectionUtil.initializeDIContext(Main.class);
    }

}
