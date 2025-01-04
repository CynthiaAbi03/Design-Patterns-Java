package Observers.implementation;

import Observers.action.Observer;

public class ThermometerDisplay implements Observer {
    @Override
    public void update(float temp){
        System.out.println("\nCurrent temperature: " + temp +"°C");
    }
}

