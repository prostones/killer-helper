package com.nbteam.killer.helper.config;

import cn.hutool.json.JSONUtil;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

@Component
@Slf4j
@Aspect
public class RequestAspect {

    @Pointcut("execution(public * com.nbteam.killer.helper.controller.*.*(..))")
    public void pointcut() {

    }

    @Around("pointcut()")
    public Object handle(ProceedingJoinPoint joinPoint) throws Throwable {
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        Object[] params = joinPoint.getArgs();

        String url = request.getRequestURL().toString();
        String param = JSONUtil.toJsonStr(params);

        log.info("请求URL:【{}】,【{}】", url, param);
        long begin = System.currentTimeMillis();
        Object result = joinPoint.proceed();
        log.info("耗时：【{}ms】,请求URL:【{}】,【{}】", (System.currentTimeMillis() - begin), url, param);
        return result;
    }

}
