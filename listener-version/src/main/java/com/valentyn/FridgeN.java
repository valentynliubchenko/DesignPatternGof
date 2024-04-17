package com.valentyn;

import java.util.ArrayList;
import java.util.List;

public class FridgeN {
    private boolean isOpen = false;
    private List<FridgeEventListenerN> listeners = new ArrayList<>();

    void addEventListener(FridgeEventListenerN listener) {
        listeners.add(listener);
    }

    void removeEventListener(FridgeEventListenerN listener) {
        listeners.remove(listener);
    }

    void openDoor() {
        isOpen = true;
        System.out.println("Дверь холодильника открыта");
        notifyListeners();
    }

    void closeDoor() {
        isOpen = false;
        System.out.println("Дверь холодильника закрыта");
        notifyListeners();
    }

    private void notifyListeners() {
        for (FridgeEventListenerN listener : listeners) {
            listener.doorEvent(isOpen);
        }
    }
}
