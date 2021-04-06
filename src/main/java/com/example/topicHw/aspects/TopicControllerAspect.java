package com.example.topicHw.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TopicControllerAspect {
    private Logger logger  = LoggerFactory.getLogger(this.getClass());

    @After("execution(* com.example.topicHw.contrrollers.TopicController.*(..))")
    public  void  AfterController(JoinPoint joinPoint) {
        logger.info("Topic Controller method { " +joinPoint.getSignature().getName() + " } was execuded");

    }




}
