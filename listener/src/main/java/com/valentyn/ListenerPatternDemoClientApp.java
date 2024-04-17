package com.valentyn;

public class ListenerPatternDemoClientApp {

    public static void main(String[] args) {
        // Создаем лампочку
        Lamp lamp = new Lamp();

        // Создаем холодильник
        Fridge fridge = new Fridge();
        // Устанавливаем лампочку в холодильник
        fridge.setLamp(lamp);

        // Создаем слушателя
        FridgeDoorListener listener = new ManagerDoorSensor();

        // Регистрируем слушателя в холодильнике
        fridge.addDoorListener(listener);

        // Эмулируем открытие двери холодильника
        fridge.openDoor();

        // Эмулируем закрытие двери холодильника
        fridge.closeDoor();

        // Удаляем слушателя из холодильника
        fridge.removeDoorListener(listener);
    }
}
