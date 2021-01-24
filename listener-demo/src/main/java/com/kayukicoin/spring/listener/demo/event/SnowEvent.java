package com.kayukicoin.spring.listener.demo.event;

public class SnowEvent extends WeatherEvent{
    @Override
    public String getWeather() {
        return "Snow";
    }
}
