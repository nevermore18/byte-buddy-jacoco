package org.example;

import net.bytebuddy.ByteBuddy;
import net.bytebuddy.agent.ByteBuddyAgent;
import net.bytebuddy.dynamic.loading.ClassReloadingStrategy;
import net.bytebuddy.implementation.MethodDelegation;

import static net.bytebuddy.matcher.ElementMatchers.*;

public class Main {

    public void call() {
        try {
//            System.setProperty("net.bytebuddy.dump", "./");
            ByteBuddyAgent.install();
            enhanceCucumberDefaultConfig();
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    private void enhanceCucumberDefaultConfig() throws ClassNotFoundException {
        Class<?> clz = User.class;
        new ByteBuddy()
                .redefine(clz)
                .method(named("get")
                        .and(isDeclaredBy(clz))
                        .and(returns(String.class)))
                .intercept(MethodDelegation.to(MyIntercept.class))
                .make()
                .load(getClass().getClassLoader(), ClassReloadingStrategy.fromInstalledAgent());
    }
}
