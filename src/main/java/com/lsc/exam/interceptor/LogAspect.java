package com.lsc.exam.interceptor;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 日志记录AOP实现
 * Created by ZhangShuzheng on 2017/3/14.
 */
@Aspect
public class LogAspect {

    private static Logger _log = LoggerFactory.getLogger(LogAspect.class);

    // 开始时间
    private long startTime = 0L;
    // 结束时间
    private long endTime = 0L;


    @Before("execution(* *..controller..*.*(..))")
    public void doBeforeInServiceLayer(JoinPoint joinPoint) {
        _log.debug("doBeforeInServiceLayer");
        startTime = System.currentTimeMillis();
    }

    @After("execution(* *..controller..*.*(..))")
    public void doAfterInServiceLayer(JoinPoint joinPoint) {
        _log.debug("doAfterInServiceLayer");
    }

    @Around("execution(* *..controller..*.*(..))")
    public Object doAround(ProceedingJoinPoint pjp) throws Throwable {
        // 从注解中获取操作名称、获取响应结果
        Object result = pjp.proceed();
        endTime = System.currentTimeMillis();
        _log.debug("doAround>>>result={},耗时：{}", result, endTime - startTime);


        return result;
    }

}
