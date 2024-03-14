package com.valentyn;

public class App {
    public static void main(String[] args) {
        Car car = new Car("Tesla Model S", 1020);

        SaveContext context = new SaveContext();

        context.setStrategy(new ConcreteStrategySaveCSV());
        context.executeSave(car);

        context.setStrategy(new ConcreteStrategySaveXML());
        context.executeSave(car);
    }
}
