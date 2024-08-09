package com.example.annotation.container;

import com.example.annotation.component.UserController;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Author: Nitin Gupta
 */


public class WebContainer {


    public void processRequest(String url) {

        // request handling code..
        // thread management
        // security
        // logging

        // Reflection Api
        try {
            Class clazz = Class.forName("com.example.annotation.component.UserController");
            Object component = clazz.newInstance();

            Method[] methods = clazz.getMethods();

            for (Method method : methods) {
                RequestMapping rm = method.getAnnotation(RequestMapping.class);
                if(rm!=null) {
                    String methodUrl = rm.url();
                    if (methodUrl.equals(url)) {
                        method.invoke(component);
                    }
                }
            }

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        }


    }

}
