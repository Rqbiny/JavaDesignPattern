package com.rqbin.factory.abstractFactory;

/**
 * Created by renqingbin on 2019/3/9.
 */
public class SamsungPhoneFactory implements PhoneFactory {
    public Battery installBattery(){
        return new SamsungBattery();
    }

    public Screen installScreen(){
        return new SamsungScreen();
    }
}
