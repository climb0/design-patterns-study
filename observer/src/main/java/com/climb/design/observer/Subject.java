package com.climb.design.observer;

import com.google.common.collect.Lists;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author climb
 * @date 2023/12/7
 */
@Component
public class Subject {

    private List<Observer> observerList = Lists.newArrayList();

    void addObserver(Observer observer) {
        this.observerList.add(observer);
    }

    List<Observer> getObserverList() {
        return this.observerList;
    }

    void notifyObserver() {
        this.observerList.forEach(o -> o.update());
    }

}
