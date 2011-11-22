package de.bmw.carit.jnario.tests.util;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import com.google.common.collect.Lists;

public class CompositeClassLoader extends ClassLoader {

    private final List<ClassLoader> classLoaders = Collections.synchronizedList(Lists.<ClassLoader>newArrayList());

    public CompositeClassLoader(ClassLoader...classLoaders) {
    	this.classLoaders.addAll(Arrays.asList(classLoaders));
        add(Object.class.getClassLoader()); // bootstrap loader.
        add(getClass().getClassLoader()); // whichever classloader loaded this jar.
    }

    private void add(ClassLoader classLoader) {
        if (classLoader != null) {
            classLoaders.add(0, classLoader);
        }
    }

    public Class<?> loadClass(String name) throws ClassNotFoundException {
        for (Iterator<ClassLoader> iterator = classLoaders.iterator(); iterator.hasNext();) {
            ClassLoader classLoader = iterator.next();
            try {
                return classLoader.loadClass(name);
            } catch (ClassNotFoundException notFound) {
                // try the next one
            }
        }
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        if (contextClassLoader != null) {
            return contextClassLoader.loadClass(name);
        } else {
            throw new ClassNotFoundException(name);
        }
    }

}