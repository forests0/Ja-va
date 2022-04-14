package com.company.example.ch10.Generics;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class UsingClass {
    public static void main(String[] args) {
        Object obj1= new Object();
        Class classes = obj1.getClass();
        System.out.println(classes.getName());
        System.out.println("-----------Constructor------------");
        Constructor [] constructor = classes.getDeclaredConstructors();
        for(Constructor con: constructor) {
            System.out.println(con.getName());
        }
        System.out.println("-----------Method-----------");
        Method [] method = classes.getMethods();
        for(Method me: method) {
            System.out.println(me.getName());
        }
    }
}
