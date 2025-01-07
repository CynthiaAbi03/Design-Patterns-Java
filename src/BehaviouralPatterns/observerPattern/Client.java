package BehaviouralPatterns.observerPattern;


import BehaviouralPatterns.observerPattern.Observers.ThermometerObserver;
import BehaviouralPatterns.observerPattern.Observers.implementation.TemperatureLogger;
import BehaviouralPatterns.observerPattern.Observers.implementation.ThermometerDisplay;
import BehaviouralPatterns.observerPattern.Subject.Implementation.ThermometerImpl;
import BehaviouralPatterns.observerPattern.Subject.Thermometer;

public class Client {
    public static void main(String[] args) {
        Thermometer thermometer = new ThermometerImpl();
        ThermometerObserver logger = new TemperatureLogger();
        ThermometerObserver display = new ThermometerDisplay();

        thermometer.addObserver(logger);
        thermometer.addObserver(display);
        thermometer.setTemperature(25.0f);
        thermometer.setTemperature(30.0f);

    }
}