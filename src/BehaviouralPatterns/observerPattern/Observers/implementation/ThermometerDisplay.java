package BehaviouralPatterns.observerPattern.Observers.implementation;

import BehaviouralPatterns.observerPattern.Observers.ThermometerObserver;

public class ThermometerDisplay implements ThermometerObserver {
    @Override
    public void update(float temp){
        System.out.println("\nCurrent temperature: " + temp +"°C");
    }
}

