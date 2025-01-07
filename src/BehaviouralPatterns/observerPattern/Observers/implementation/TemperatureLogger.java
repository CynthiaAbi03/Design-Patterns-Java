package BehaviouralPatterns.observerPattern.Observers.implementation;

import BehaviouralPatterns.observerPattern.Observers.ThermometerObserver;

import java.io.FileWriter;
import java.io.IOException;

public class TemperatureLogger implements ThermometerObserver {
    @Override
    public void update(float temp){
        try{
            FileWriter fw = new FileWriter("log_file1.txt", true);
                    fw.write(temp+"\n");
                    fw.close();

        } catch (IOException e) {
            System.out.println("Error writing to log file: " + e.getMessage());
        }
    }
}
