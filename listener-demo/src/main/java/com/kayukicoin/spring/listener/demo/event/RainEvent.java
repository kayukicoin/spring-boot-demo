package com.kayukicoin.spring.listener.demo.event;

public class RainEvent extends WeatherEvent {
    @Override
    public String getWeather() {
        return "Rain";
    }
}
