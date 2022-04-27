package com.Wanyu.filter;

import javax.servlet.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebFilter(filterName = "loggerFilter")
public class loggerFilter implements Filter {
    public void init(FilterConfig config) throws ServletException {
    }

    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        System.out.println("i am in loggerFilter-->doFilter(）-before servlet-(request come here)");

        chain.doFilter(request, response);

        System.out.println("i am in loggerFilter-->doFilter(）-AFTER servlet-(response come here)");
    }
}
