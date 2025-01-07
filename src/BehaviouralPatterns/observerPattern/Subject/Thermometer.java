package BehaviouralPatterns.observerPattern.Subject;

import BehaviouralPatterns.observerPattern.Observers.ThermometerObserver;

public interface Thermometer {
     void addObserver(ThermometerObserver observer);
     void removeObserver(ThermometerObserver observer);
    void setTemperature(float temperature);
     void notifyObservers();

}
