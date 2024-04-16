package com.valentyn;

public interface FridgeDoorListener {
    void onDoorOpened(FridgeDoorEvent event);
    void onDoorClosed(FridgeDoorEvent event);
}
