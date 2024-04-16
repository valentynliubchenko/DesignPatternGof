package com.valentyn;

import java.util.ArrayList;
import java.util.List;

public class Fridge {
    private boolean doorOpen;
    private Lamp lamp;
    private List<FridgeDoorListener> listeners = new ArrayList<>();

    public void addDoorListener(FridgeDoorListener listener) {
        listeners.add(listener);
    }

    public void removeDoorListener(FridgeDoorListener listener) {
        listeners.remove(listener);
    }

    public void setLamp(Lamp lamp) {
        this.lamp = lamp;
    }

    public void openDoor() {
        if (!doorOpen) {
            doorOpen = true;
            fireDoorOpened();
        }
    }

    public void closeDoor() {
        if (doorOpen) {
            doorOpen = false;
            fireDoorClosed();
        }
    }

    private void fireDoorOpened() {
        FridgeDoorEvent event = new FridgeDoorEvent(true, lamp);
        for (FridgeDoorListener listener : listeners) {
            listener.onDoorOpened(event);
        }
    }

    private void fireDoorClosed() {
        FridgeDoorEvent event = new FridgeDoorEvent(false, lamp);
        for (FridgeDoorListener listener : listeners) {
            listener.onDoorClosed(event);
        }
    }
}