package com.rqbin.factory.simpleFactory;

import com.rqbin.factory.Phone;

/**
 * Created by renqingbin on 2019/3/9.
 */
public class PhoneFactory {

    public Phone create(Class<? extends Phone> clazz){
        try{
            if(null != clazz){
                return clazz.newInstance();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
