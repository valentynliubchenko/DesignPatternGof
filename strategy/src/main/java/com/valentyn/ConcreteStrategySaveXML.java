package com.valentyn;

class ConcreteStrategySaveXML implements SaveStrategy {

    public void save(Car car) {
        System.out.println("Saving to XML: <car><name>" + car.getName() + "</name><power>" + car.getPower() + "</power></car>");
    }
}