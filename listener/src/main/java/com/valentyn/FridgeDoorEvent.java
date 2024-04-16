package com.valentyn;

// Класс события, представляющий состояние открытой или закрытой двери холодильника
public class FridgeDoorEvent {
    private boolean isOpen;
    private Lamp lamp;

    public FridgeDoorEvent(boolean isOpen, Lamp lamp) {
        this.isOpen = isOpen;
        this.lamp = lamp;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public Lamp getLamp() {
        return lamp;
    }
}