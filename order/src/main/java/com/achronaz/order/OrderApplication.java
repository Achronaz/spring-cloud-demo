package com.achronaz.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class OrderApplication {

    public static void main(String[] args) throws InterruptedException {
        //SpringApplication.run(OrderApplication.class,args);
        ConfigurableApplicationContext applicationContext = SpringApplication.run(OrderApplication.class, args);
        while(true){
            System.err.println("name :"+applicationContext.getEnvironment().getProperty("name"));
            Thread.sleep(1000L);
        }
    }
}
