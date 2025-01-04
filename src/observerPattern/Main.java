import Observable.Thermometer;
import Observers.implementation.TemperatureLogger;
import Observers.implementation.ThermometerDisplay;

public class Main {
    public static void main(String[] args) {

        Thermometer thermometer = new Thermometer();
        ThermometerDisplay thermometerDisplay = new ThermometerDisplay();
        TemperatureLogger temperatureLogger = new TemperatureLogger();

        thermometer.addObserver(thermometerDisplay);
        thermometer.addObserver(temperatureLogger);

        thermometer.setTemp(37);
        thermometer.setTemp(40);
        thermometer.setTemp(90);
    }
}