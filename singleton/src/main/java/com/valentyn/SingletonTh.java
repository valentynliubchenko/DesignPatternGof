package com.valentyn;

public class SingletonTh {
    private static volatile SingletonTh instance;

    private SingletonTh() {
    }

    public static SingletonTh getInstance() {
        if (instance == null) {
            synchronized (SingletonTh.class) {
                if (instance == null)
                {
                    instance = new SingletonTh();
                }
            }
        }
        return instance;
    }

    public void someMethod() {
        System.out.println("do someMethod  Singleton instance is : " + instance.toString());
    }
}
