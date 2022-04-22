package com.nbteam.killer.helper.config;

import cn.hutool.core.util.StrUtil;
import com.nbteam.killer.helper.vo.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;

@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public Result<Object> allExceptionHandler(HttpServletRequest request, Exception exception) {
        Enumeration<String> parameterNames = request.getParameterNames();
        while (parameterNames.hasMoreElements()) {
            String name = parameterNames.nextElement();
            String parameter = StrUtil.trimToNull(request.getParameter(name));
            if (parameter != null) {
                log.error("allExceptionHandler key {} value {}", name, parameter);
            }
        }
        String url = request.getRequestURI();
        log.error("system exception,url:[{}],msg:", url, exception);

        return Result.error(exception.getMessage());
    }
}
