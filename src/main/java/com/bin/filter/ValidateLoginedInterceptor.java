package com.bin.filter;

import com.bin.base.constants.Constants;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Administrator on 2017/8/15.
 */
public class ValidateLoginedInterceptor extends HandlerInterceptorAdapter{

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String token = request.getHeader(Constants.CLIENT_TOKEN);
        if(!StringUtils.equals(token, "token")) {
            response.sendRedirect("/noLogin");
            return false;
        }
        return true;
    }
}
