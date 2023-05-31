package org.example;

import net.bytebuddy.implementation.bind.annotation.RuntimeType;


public class MyIntercept {

    @RuntimeType
    public static Object intercept() {
        return "new user";
    }


}