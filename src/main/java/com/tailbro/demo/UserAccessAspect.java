package com.tailbro.demo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

/**
 * Created by carlitos081 on 04/07/2018.
 */
//@Aspect
//@Configuration
public class UserAccessAspect {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    //What kind of method calls I would intercept
    //execution(* PACKAGE.*.*(..))
    //Weaving & Weaver
    @Before("execution(* com.tailbro.demo.*.*(..))")
    public void before(JoinPoint joinPoint){
        //Advice
        logger.info(" Check for user access ");
        logger.info(" Allowed execution for {}", joinPoint);
    }


    @Before("execution(* org.springframework.jdbc.core.JdbcOperations.*(String, ..))")
    public void testJdbcTemplate(){
        logger.info("colled");
    }

}
