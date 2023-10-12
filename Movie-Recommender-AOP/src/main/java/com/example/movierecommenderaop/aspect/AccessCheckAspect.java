package com.example.movierecommenderaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class AccessCheckAspect {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Before("execution(* com.example.movierecommenderaop..*.*(..))")
    public void before(JoinPoint joinPoint) {
        logger.info("Intercepted call before execution of: {}", joinPoint);
    }
}
