package com.simform.users.Filter;


import jakarta.servlet.*;

import java.io.IOException;

public class StudentFilter implements Filter {

  @Override
  public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
    filterChain.doFilter(servletRequest , servletResponse);
  }
}
