package com.nxg.nxgecomm;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

@Component
public class SimpleCORSFilter implements Filter {

	public SimpleCORSFilter() {
	    System.out.println("SimpleCORSFilter init");
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		
		  HttpServletRequest request = (HttpServletRequest) req;
		    HttpServletResponse response = (HttpServletResponse) res;

		    response.setHeader("Access-Control-Allow-Origin", request.getHeader("Origin"));
		    response.setHeader("Access-Control-Allow-Credentials", "true");
		    response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE, PUT");
		    response.setHeader("Access-Control-Max-Age", "3600");
		    response.setHeader("Access-Control-Allow-Headers", "Content-Type, Accept, X-Requested-With, remember-me");

		    chain.doFilter(req, res);
		
	}

	@Override
	public void destroy() {
		
	}
	
	
}
