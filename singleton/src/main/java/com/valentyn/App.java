package com.valentyn;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();

        singleton.someMethod();

        Singleton singleton2 = Singleton.getInstance();

        singleton2.someMethod();
    }
}
