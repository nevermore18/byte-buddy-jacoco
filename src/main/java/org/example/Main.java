package org.example;

import net.bytebuddy.ByteBuddy;
import net.bytebuddy.agent.ByteBuddyAgent;
import net.bytebuddy.dynamic.loading.ClassReloadingStrategy;
import net.bytebuddy.implementation.MethodDelegation;

import static net.bytebuddy.matcher.ElementMatchers.*;

public class Main {

    public void call() {
        ByteBuddyAgent.install();
        config();
    }

    private void config() {
        Class<?> clz = User.class;
        new ByteBuddy()
                .redefine(clz)
                .method(named("get")
                        .and(isDeclaredBy(clz))
                        .and(returns(String.class)))
                .intercept(MethodDelegation.to(NewUser.class))
                .make()
                .load(getClass().getClassLoader(), ClassReloadingStrategy.fromInstalledAgent());
    }
}
