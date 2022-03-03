package com.pluralsight.util;

import org.springframework.beans.factory.FactoryBean;

import java.util.Calendar;

// FactoryBean implemented example
public class CalendarFactory implements FactoryBean<Calendar > {
    private Calendar instance = Calendar.getInstance();


    @Override
    public Calendar getObject() throws Exception {
        return instance;
    }

    @Override
    public Class<?> getObjectType() {
        return Calendar.class;
    }

    // example for show that we can take this static instance and add
    // some funcionality around it that we chat then utilize inside the
    // rest of our application

    public void addDays(int num){
        instance.add(Calendar.DAY_OF_YEAR, num);
    }
}
