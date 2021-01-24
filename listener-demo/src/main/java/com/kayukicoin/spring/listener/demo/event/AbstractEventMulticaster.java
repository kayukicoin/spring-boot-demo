package com.kayukicoin.spring.listener.demo.event;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractEventMulticaster implements EventMultiCaster {

    private List<WeatherListener> listeners = new ArrayList<>();
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
