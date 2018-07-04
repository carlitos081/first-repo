package com.tailbro.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by carlitos081 on 04/07/2018.
 */
@Service
public class Business1 {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private Dao1 dao1;
    public String calculateSomething() {
        String value = dao1.retrieveSomething();
        logger.info("In Business - {}", value);
        return value;
    }
}
