package com.andreidodu.reflections.lesson3DependencyInjection.util;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.stream.Stream;

public class DependencyInjectionUtil {

    public static <T> Object initializeDIContext(Class<T> clazz) throws InvocationTargetException, InstantiationException, IllegalAccessException {
        Constructor<?>[] constructors = clazz.getDeclaredConstructors();

        Constructor<?> constructor = constructors[0];
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        List<Object> objects = Stream.of(parameterTypes).map(parentClazz -> {
            try {
                return initializeDIContext(parentClazz);
            } catch (InvocationTargetException | InstantiationException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }).toList();
        constructor.setAccessible(true);
        if (objects.isEmpty()) {
            return constructor.newInstance();
        }
        return constructor.newInstance(objects.toArray());
    }

}
