package com.dev.devapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
@WebServlet(urlPatterns="/lifecycle",loadOnStartup=688,
initParams= {
		@WebInitParam(name="jingalala",value="ulala"),
		@WebInitParam(name="age",value="ggg")
})


public class LifeCycleServlet extends GenericServlet {
	public LifeCycleServlet() {
		  System.out.println("servlet object is created");
	  }
	
	/*@Override
	public void init() throws ServletException {
		System.out.println("Initializing the resources of LifeCycleResources");
		}
	*/


	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ServletConfig cong=getServletConfig();
		String value =cong.getInitParameter("jingalala");
		String age=cong.getInitParameter("age");
		
		System.out.println("service method is excuted");
		String AppName=req.getParameter("appName");
		String AppSize=req.getParameter("appSize");
		String AppVersion=req.getParameter("appVersion");
		
		ServletOutputStream outputStream = resp.getOutputStream();
		outputStream.print("Thank you for visiting" +AppName + " " +value+ " " +age);
			
	}
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("close only the costly resources");
	}	
		
	}



