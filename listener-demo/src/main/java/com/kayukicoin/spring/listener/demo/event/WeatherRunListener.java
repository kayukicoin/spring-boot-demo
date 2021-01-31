package com.kayukicoin.spring.listener.demo.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class WeatherRunListener {
    @Autowired
    private WeatherEventMulticaster weatherEventMulticaster;

    public void snow(){
        weatherEventMulticaster.multicasterEvent(new SnowEvent());
    }
    public  void rain(){
        weatherEventMulticaster.multicasterEvent(new RainEvent());
    }
}
