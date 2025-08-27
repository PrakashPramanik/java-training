package com.filter;

import javax.servlet.annotation.WebFilter;

@WebFilter(filterName = "LogB", urlPatterns = { "/Login" })
public class LogB implements javax.servlet.Filter {

	@Override
	public void init(javax.servlet.FilterConfig filterConfig) {
	}

	@Override
	public void doFilter(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response,
			javax.servlet.FilterChain chain) {
		System.out.println("Entered LogB doFilter()");
		System.out.println("protocol is " + request.getProtocol());
		System.out.println("remote host is " + request.getRemoteHost());
		System.out.println("content type is " + request.getContentType());
		System.out.println("content length is " + request.getContentLength());
		System.out.println("username is " + request.getParameter("username"));

		try {
			chain.doFilter(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void destroy() {
	}
}