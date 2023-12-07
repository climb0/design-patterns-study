package com.climb.design.observer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author climb
 * @date 2023/12/7
 */
@Slf4j
@Service
public class ObserverImpl1 implements Observer {

    @Override
    public void update() {
        log.info("observer_1 receive msg, update ...");
    }
}
