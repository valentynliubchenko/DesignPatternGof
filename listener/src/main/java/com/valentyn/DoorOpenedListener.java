package com.valentyn;

// Класс слушателя для обработки событий открытия и закрытия двери холодильника
public class DoorOpenedListener implements FridgeDoorListener {
    @Override
    public void onDoorOpened(FridgeDoorEvent event) {
        if (event.isOpen()) {
            System.out.println("Свет в холодильнике зажжен");
            event.getLamp().turnOn(); // Включаем лампочку при открытии двери
        }
    }

    @Override
    public void onDoorClosed(FridgeDoorEvent event) {
        if (!event.isOpen()) {
            System.out.println("Свет в холодильнике выключен");
            event.getLamp().turnOff(); // Выключаем лампочку при закрытии двери
        }
    }
}