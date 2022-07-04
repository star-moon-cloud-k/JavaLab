package DesignPattern.observerPattern;

public class WeatherStation {
    public static void main(String[] args)
    {
        WeatherData weatherData = new WeatherData();
        WeatherData weatherData2 = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        CurrentConditionsDisplay currentConditionsDisplay2 = new CurrentConditionsDisplay(weatherData2);
//        StaticsDisplay staticsDisplay = new StaticsDisplay(weatherData);
//        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData2.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78,90,29.2f);
    }
}
