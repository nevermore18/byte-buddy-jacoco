package org.example;

import net.bytebuddy.implementation.bind.annotation.RuntimeType;


public class NewUser {
    @RuntimeType
    public static Object intercept() {
        return "new user";
    }

}