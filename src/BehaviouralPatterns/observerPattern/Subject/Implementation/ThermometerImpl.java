package BehaviouralPatterns.observerPattern.Subject.Implementation;

import BehaviouralPatterns.observerPattern.Observers.ThermometerObserver;
import BehaviouralPatterns.observerPattern.Subject.Thermometer;

import java.util.ArrayList;
import java.util.List;

public class ThermometerImpl implements Thermometer {
    private List<ThermometerObserver> observers = new ArrayList<>();
    private float temperature;

    @Override
    public void addObserver(ThermometerObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(ThermometerObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void setTemperature(float temperature) {
        this.temperature = temperature;
        notifyObservers();
    }

    @Override
    public void notifyObservers() {
        for (ThermometerObserver observer : observers) {
            observer.update(temperature);
        }
    }
}
