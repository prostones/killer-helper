package com.nbteam.killer.helper.proxy;

import cn.hutool.json.JSONUtil;
import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 黑死病模式代理
 *
 * @author wsl45
 */
@Slf4j
public class UnbelievableModalProxy {

    @SuppressWarnings("unchecked")
    public static <T> T getProxy(T obj) {
        return (T) Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(),
                (proxy, method, args) -> {
                    beforeInvoke(method, args);
                    Object result = method.invoke(obj, args);
                    afterInvoke(method, args, result);
                    return result;
                });
    }

    private static void beforeInvoke(Method method, Object[] args) {
        log.info("before black death modal on.");
        log.info("method:" + method.getName());
        log.info("args:" + JSONUtil.toJsonStr(args));

    }

    private static void afterInvoke(Method method, Object[] args, Object result) {
        System.out.println("after black death modal on.");

        if (method.getName().equals("create")) {
            // 校验是否是12人本
        }

    }

}
