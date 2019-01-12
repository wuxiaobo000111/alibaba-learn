package com.bobo.nocos.spring.config.config;

import com.xiaoleilu.hutool.util.CharsetUtil;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * 处理中文乱码
 * @author wuxiaobo@didachuxing.com
 * @create 2019-01-12 13:20
 **/
public class EncodingFilter implements Filter {
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        MyRequest myRequest = new MyRequest((HttpServletRequest) request);
        myRequest.setCharacterEncoding(CharsetUtil.UTF_8);
        chain.doFilter(request,response);
    }

    public void destroy() {

    }
}
