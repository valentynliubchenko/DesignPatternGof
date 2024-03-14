package com.valentyn;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();

        singleton.someMethod();
    }
}
