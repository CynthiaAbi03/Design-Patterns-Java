package Observable;


public class Thermometer extends Observable {
    private float temp;

    public float getTemp() {
        return temp;
    }

    public void setTemp(float temp) {
        this.temp = temp;
        //after setting the temp, we notify all the observers about this change
        notifyObservers(temp);
    }
}
