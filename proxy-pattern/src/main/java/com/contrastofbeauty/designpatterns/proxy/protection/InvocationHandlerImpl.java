package com.contrastofbeauty.designpatterns.proxy.protection;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created with IntelliJ IDEA.
 * User: blackcat
 * Date: 22/03/13
 */
public class InvocationHandlerImpl implements InvocationHandler {

    private Movie movie;

    public InvocationHandlerImpl(Movie c) {
        movie = c;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        try {
            if (method.getName().startsWith("set")) {
                throw new IllegalAccessException("Operation not permitted.");
            } else if (method.getName().equals("comment")) {
                return method.invoke(movie, args);
            } else if (method.getName().startsWith("get")) {
                return method.invoke(movie, args);
            }
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }
}
