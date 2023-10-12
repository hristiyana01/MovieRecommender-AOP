package com.example.movierecommenderaop.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class JoinPointConfig {
    @Pointcut("execution(* com.example.movierecommenderaop  .*.*(..))")
    public void dataLayerPointcut() {}

    @Pointcut("execution(* com.example.movierecommenderaop.*.*(..))")
    public void businessLayerPointcut() {}

    //to intercept method calls for both layers:
    @Pointcut("com.example.movierecommenderaop.aspect.JoinPointConfig.dataLayerPointcut() || "
            + "com.example.movierecommenderaop.aspect.JoinPointConfig.businessLayerPointcut()")
    public void allLayersPointcut() {}

    //for a particular bean
    @Pointcut("bean(movie*)")
    public void movieBeanPointcut() {}

    @Pointcut("@annotation(com.example.movierecommenderaop.aspect.MeasureTime)")
    public void measureTimeAnnotation() {}
}
