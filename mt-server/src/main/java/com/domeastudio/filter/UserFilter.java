package com.domeastudio.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by domea on 15-4-30.
 */
public class UserFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
