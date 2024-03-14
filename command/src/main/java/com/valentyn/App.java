package com.valentyn;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        Light light = new Light();

        Command turnOn = new TurnOnLightCommand(light);
        Command turnOff = new TurnOffLightCommand(light);

        RemoteControl remote = new RemoteControl();

        // Включаем свет
        remote.setCommand(turnOn);
        remote.pressButton();

        // Выключаем свет
        remote.setCommand(turnOff);
        remote.pressButton();
    }
}
