package com.org.dev.devapp;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/FirstServlet")
public class FirstServlet extends GenericServlet{
	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = req.getParameter("nm");
		String emailId = req.getParameter("email");
		String password = req.getParameter("pw");
		
		ServletOutputStream outputStream = resp.getOutputStream();
				outputStream.print("welcome" +name);
		
				//PrintWriter printWriter = resp.getWriter();
				//printWriter.print("welcome" +name);
			//("<html><body bgcolor='green'>"+</body><html>>)
		
		
		
		
	}
}
