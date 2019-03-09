package com.rqbin.factory.factoryMethod;

import com.rqbin.factory.Phone;

/**
 * Created by renqingbin on 2019/3/9.
 */
public class CratePhone {
    public static void main(String[] args) {
        PhoneFactory phone = new SamsungPhoneFactory();
        Phone samsung = phone.create();

        System.out.println(samsung.getPhoneName());
    }
}
