package com.rqbin.factory.abstractFactory;

/**
 * Created by renqingbin on 2019/3/9.
 */
public class CreatePhone {
    public static void main(String[] args) {
        SamsungPhoneFactory phone = new SamsungPhoneFactory();
        String batteryInfo = phone.installBattery().install();
        String screenInfo = phone.installScreen().install();
        System.out.println(batteryInfo);
        System.out.println(screenInfo);
    }

}
