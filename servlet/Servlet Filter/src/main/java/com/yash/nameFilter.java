package com.yash;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet Filter implementation class nameFilter
 */
@WebFilter("/addAlien")
public class nameFilter extends HttpFilter implements Filter {
       
  
	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {



		PrintWriter out=response.getWriter();

		HttpServletRequest req = (HttpServletRequest) request;
		String name = request.getParameter("aname");


		if(name.length()>=3)
		{
			chain.doFilter(request, response);
		}
		else
		{
			out.println("Name should be greater than 3");
		}





	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
