package com.valentyn;

class SaveContext {
    private SaveStrategy strategy;

    public SaveContext() {
    }

    public void setStrategy(SaveStrategy strategy) {
        this.strategy = strategy;
    }

    public void executeSave(Car car) {
        strategy.save(car);
    }
}
