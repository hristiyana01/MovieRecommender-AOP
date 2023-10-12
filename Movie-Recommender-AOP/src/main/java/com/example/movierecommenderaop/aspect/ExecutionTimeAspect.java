package com.example.movierecommenderaop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class ExecutionTimeAspect {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

        @Around("com.example.movierecommenderaop.aspect.JoinPointConfig.measureTimeAnnotation()")
        public Object calculateExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {

        long startTime = System.currentTimeMillis();

        Object returnValue = joinPoint.proceed();

        long timeTaken = System.currentTimeMillis() - startTime;

        logger.info("\\n\\n>>Time taken by {} to complete execution is: {}\n", joinPoint, timeTaken);
        return returnValue;
    }
}
