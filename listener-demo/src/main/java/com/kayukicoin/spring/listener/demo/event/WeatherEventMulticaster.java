package com.kayukicoin.spring.listener.demo.event;

public class WeatherEventMulticaster extends AbstractEventMulticaster {
    @Override
    void doStart() {
        System.out.println("begin broadcast weather event");
    }

    @Override
    void doEnd() {
        System.out.println("end broadcast weather event");
    }
}
