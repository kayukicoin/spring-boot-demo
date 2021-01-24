package com.kayukicoin.spring.listener.demo.event;

/**
 * ---------- 发布  ----------   监听     ---------
 * |        |----> |  事件A   |  ------> | 监听器A |
 * |        |      ----------            ----------
 * | 广播器 |        ----------           ----------
 * |        |---->  |  事件B  |  ------> |  监听器B |
 * ----------       ----------           ----------
 *
 */
public class Test {
    public static void main(String[] args) {
        WeatherEventMulticaster eventMulticaster = new WeatherEventMulticaster();
        RainListener rainListener = new RainListener();
        SnowListener snowListener = new SnowListener();
        eventMulticaster.addListener(rainListener);
        eventMulticaster.addListener(snowListener);
        eventMulticaster.multicasterEvent(new SnowEvent());
        eventMulticaster.multicasterEvent(new RainEvent());

        eventMulticaster.removeListener(rainListener);
        eventMulticaster.multicasterEvent(new SnowEvent());
        eventMulticaster.multicasterEvent(new RainEvent());
    }
}
