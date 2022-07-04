package DesignPattern.observerPattern;

import java.util.ArrayList;
import java.util.Observable;

public class WeatherData extends Observable {
//    private ArrayList observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {}
//    public WeatherData(){
//        observers = new ArrayList();
//    }

//    public void registerObserver(Observer o) {
//        observers.add(o);
//    }
//
//
//    public void removeObserver(Observer o) {
//        int i = observers.indexOf(o);
//        if(i >= 0){
//            observers.remove(i);
//        }
//    }
//
//    @Override
//    public void notifyObservers() {
//        for(int i = 0; i < observers.size(); i++){
//            Observer observer = (Observer) observers.get(i);
//            observer.update(temperature, humidity, pressure);
//        }
//    }

    public void measurementsChanges(){
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanges();
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public float getTemperature() {
        return temperature;
    }

}
