package com.valentyn;

class ConcreteStrategySaveCSV implements SaveStrategy {

    public void save(Car car) {
        System.out.println("Saving to CSV: " + car.getName() + "," + car.getPower());
    }
}