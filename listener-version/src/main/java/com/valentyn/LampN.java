package com.valentyn;

class LampN implements FridgeEventListenerN {
    private boolean isOn = false;

    void turnOn() {
        isOn = true;
        System.out.println("Лампочка включена");
    }

    void turnOff() {
        isOn = false;
        System.out.println("Лампочка выключена");
    }

    // Обработчик события открытия и закрытия двери холодильника
    @Override
    public void doorEvent(boolean isOpen) {
        if (isOpen) {
            turnOn();
        } else {
            turnOff();
        }
    }
}