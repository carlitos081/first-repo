package com.tailbro.demo;

import org.springframework.stereotype.Repository;

/**
 * Created by carlitos081 on 04/07/2018.
 */
@Repository
public class Dao1 {
    public String retrieveSomething() {
        return "Dao1";
    }
}