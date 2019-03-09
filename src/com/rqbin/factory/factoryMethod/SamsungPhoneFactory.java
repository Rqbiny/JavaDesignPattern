package com.rqbin.factory.factoryMethod;

import com.rqbin.factory.Phone;
import com.rqbin.factory.SamsungPhone;

/**
 * Created by renqingbin on 2019/3/9.
 */
public class SamsungPhoneFactory implements PhoneFactory {
    public Phone create(){
        return new SamsungPhone();
    }
}
