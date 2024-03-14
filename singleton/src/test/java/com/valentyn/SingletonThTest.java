package com.valentyn;

import org.junit.jupiter.api.Test;

public class SingletonThTest {
    @Test
    public void runSingletonThTest(){
        // Создаем и запускаем 5 потоков
        for (int i = 0; i < 5; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    // Получаем экземпляр SingletonTh и вызываем someMethod
                    SingletonTh singleton = SingletonTh.getInstance();
                    singleton.someMethod();
                }
            }).start();
        }
    }
}
