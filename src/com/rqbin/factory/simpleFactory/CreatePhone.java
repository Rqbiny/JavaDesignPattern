package com.rqbin.factory.simpleFactory;

import com.rqbin.factory.Phone;
import com.rqbin.factory.SamsungPhone;

/**
 * Created by renqingbin on 2019/3/9.
 */
public class CreatePhone {
    public static void main(String[] args) {
        PhoneFactory phoneFactory = new PhoneFactory();
        Phone samsung = phoneFactory.create(SamsungPhone.class);
        System.out.println(samsung.getPhoneName());
    }
}
