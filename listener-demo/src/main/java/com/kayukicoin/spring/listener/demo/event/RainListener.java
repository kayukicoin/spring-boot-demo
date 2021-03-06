package com.kayukicoin.spring.listener.demo.event;

import org.springframework.stereotype.Component;

@Component
public class RainListener implements WeatherListener {
    @Override
    public void onWeatherEvent(WeatherEvent event) {
        if(event instanceof RainEvent){
            System.out.println("hello "+ event.getWeather());
        }
    }
}
