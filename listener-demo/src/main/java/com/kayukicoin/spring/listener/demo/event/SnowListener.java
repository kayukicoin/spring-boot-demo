package com.kayukicoin.spring.listener.demo.event;

public class SnowListener implements WeatherListener {
    @Override
    public void onWeatherEvent(WeatherEvent event) {
        if(event instanceof SnowEvent){
            System.out.println("hello " + event.getWeather());
        }
    }
}
