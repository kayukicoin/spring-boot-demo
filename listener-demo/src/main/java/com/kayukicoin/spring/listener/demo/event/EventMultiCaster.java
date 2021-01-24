package com.kayukicoin.spring.listener.demo.event;

public interface EventMultiCaster {
    void multicasterEvent(WeatherEvent event);
    void addListener(WeatherListener listener);
    void removeListener(WeatherListener listener);
}
