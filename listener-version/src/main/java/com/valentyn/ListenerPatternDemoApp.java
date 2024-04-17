package com.valentyn;

public class ListenerPatternDemoApp {

    public static void main(String[] args) {
        // Создаем лампочку
        LampN lamp = new LampN();
        FridgeN fridge = new FridgeN();

        // Добавляем лампочку в качестве слушателя
        fridge.addEventListener(lamp);

        // Эмулируем события открытия и закрытия двери холодильника
        fridge.openDoor();
        fridge.closeDoor();
    }
}
