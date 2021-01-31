package com.kayukicoin.spring.listener.demo.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public abstract class AbstractEventMulticaster implements EventMultiCaster {

    @Autowired
    private List<WeatherListener> listeners;
    public void multicasterEvent(WeatherEvent event) {
        doStart();
        listeners.forEach(i -> i.onWeatherEvent(event));
        doEnd();
    }

    public void addListener(WeatherListener listener){
        listeners.add(listener);
    }
    public void removeListener(WeatherListener listener){
        listeners.remove(listener);
    }
    abstract void doStart();

    abstract void doEnd();
}
