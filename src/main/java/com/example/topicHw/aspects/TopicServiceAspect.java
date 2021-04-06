package com.example.topicHw.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TopicServiceAspect {
    private Logger logger  = LoggerFactory.getLogger(this.getClass());

    @AfterReturning(pointcut = "execution(* com.example.topicHw.service.TopicService.*(..))", returning = "returningObject")
    public void afterReturn(JoinPoint joinPoint, Object returningObject) {
        logger.info("Topic Service method { " +joinPoint.getSignature().getName() + " } was execuded and returned");
        logger.info(returningObject.toString());
    }
}
