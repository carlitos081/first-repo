package com.tailbro.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by carlitos081 on 04/07/2018.
 */
@Service
public class Business2 {
    @Autowired
    private Dao2 dao2;
    public String calculateSomething() {
        //Business Logic
        return dao2.retrieveSomething();
    }
}
