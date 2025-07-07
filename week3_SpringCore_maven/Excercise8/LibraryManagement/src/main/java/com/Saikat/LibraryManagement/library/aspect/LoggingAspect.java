package com.Saikat.LibraryManagement.library.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.After;

@Aspect
@Component
public class LoggingAspect {
    private static final Logger logger = LoggerFactory.getLogger(LoggingAspect.class);

    @Around("execution(* com.Saikat.LibraryManagement.library..*(..))")
    public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.currentTimeMillis();
        Object proceed = joinPoint.proceed();
        long executionTime = System.currentTimeMillis() - start;
        logger.info("{} executed in {} ms", joinPoint.getSignature(), executionTime);
        return proceed;
    }

    @Before("execution(* com.Saikat.LibraryManagement.library..*(..))")
    public void logBefore(JoinPoint joinPoint) {
        logger.info("Before method: {}", joinPoint.getSignature());
    }

    @After("execution(* com.Saikat.LibraryManagement.library..*(..))")
    public void logAfter(JoinPoint joinPoint) {
        logger.info("After method: {}", joinPoint.getSignature());
    }
} 