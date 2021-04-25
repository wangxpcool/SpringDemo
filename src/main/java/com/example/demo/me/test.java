package com.example.demo.me;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class test {


    public void fun(){
        ApplicationContext applicationContext =  new FileSystemXmlApplicationContext("applicationContext.xml");

        applicationContext.getId();

        FactoryBean factoryBean;

    }


}
