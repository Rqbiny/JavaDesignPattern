package com.rqbin.factory.abstractFactory;

/**
 * Created by renqingbin on 2019/3/9.
 */
public interface PhoneFactory {
    Battery installBattery();
    Screen installScreen();
}
