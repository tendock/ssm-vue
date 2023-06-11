package com.dock.aspect;

import com.dock.entity.SysLog;
import com.dock.service.SysLogService;
import com.dock.utils.ReflectionUtils;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.weaver.ast.Var;
import org.springframework.stereotype.Component;
import com.dock.entity.Result;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.annotation.Resource;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.Principal;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Locale;
import java.util.Map;

/**
 * @author:XuJianYuan
 * @date:2023/6/8 18:08
 * @version:1.0
 */
@Aspect
@Component
public class WmsAspect {
    @Resource
    private SysLogService sysLogService;
//    @Before(value = "execution(* com.dock.controller.*.*(..))")
//    public void method(JoinPoint joinPoint){
//        System.out.println("前置通知"+joinPoint.getSignature().getName());
//    }
    @Around(value = "execution(* com.dock.controller.*.*(..))")
    public Object methodAround(ProceedingJoinPoint joinPoint) {
        SysLog sysLog = new SysLog();
        Object r =null;
//        Class<?> aClass = Class.forName("javax.servlet.http.HttpServletRequest");
//        Class<HttpServletRequest> aClass1 = HttpServletRequest.class;
//        HttpServletRequest o= (HttpServletRequest)aClass1.newInstance();
//        System.out.println(o.getMethod()+"--------------------------");
//        System.out.println(ReflectionUtils.getHttpServletRequest());
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        String method = request.getMethod();
        String userName = (String) request.getSession().getAttribute("userName");
        sysLog.setMethod(method);
        sysLog.setMethodName(joinPoint.getSignature().getName());
        sysLog.setIpAddr(request.getRemoteHost());
        if(userName==null){
            userName="测试名称";
        }
        sysLog.setNickName(userName);
        if(joinPoint.getSignature().getName().equals("login")||joinPoint.getSignature().getName().equals("token")){
            sysLog.setType(1);
        }else{
            sysLog.setType(0);
        }
        sysLogService.addSysLog(sysLog);
        try {
            r=joinPoint.proceed();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }finally {
        }
        return r;
    }
}
