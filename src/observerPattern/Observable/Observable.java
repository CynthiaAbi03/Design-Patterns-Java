package Observable;
import Observers.action.Observer;

import java.util.ArrayList;
import java.util.List;
public class Observable {
    private List<Observer> observers = new ArrayList<Observer>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
    public void notifyObservers (float temp) {
        for (Observer observer : observers) {
            observer.update(temp);
        }
    }
}