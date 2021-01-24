package com.kayukicoin.spring.listener.demo.event;

public class RainListener implements WeatherListener {
    @Override
    public void onWeatherEvent(WeatherEvent event) {
        if(event instanceof RainEvent){
            System.out.println("hello "+ event.getWeather());
        }
    }
}
