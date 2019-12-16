package com.example;
import dagger.Component;

@Component
interface AppComponent {
    WeatherReporter getWeatherReporter();
}

public class Application {


    public static void main(String args[]) {
        AppComponent component = DaggerAppComponent.create();
        WeatherReporter reporter = component.getWeatherReporter();
        reporter.report();
    }


}