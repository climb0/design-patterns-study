package com.climb.design.observer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author climb
 * @date 2023/12/7
 */
@SpringBootApplication
public class ObserverApplication implements CommandLineRunner {

    @Autowired
    private Subject subject;

    @Autowired
    private ObserverImpl1 o1;

    @Autowired
    private ObserverImpl2 o2;

    public static void main(String[] args) {
        SpringApplication.run(ObserverApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        subject.addObserver(o1);
        subject.addObserver(o2);

        subject.notifyObserver();
    }
}
