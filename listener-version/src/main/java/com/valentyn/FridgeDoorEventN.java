package com.valentyn;

public class FridgeDoorEventN {
    private boolean isOpen;
    private LampN lamp;

    public FridgeDoorEventN(boolean isOpen, LampN lamp) {
        this.isOpen = isOpen;
        this.lamp = lamp;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public LampN getLamp() {
        return lamp;
    }
}