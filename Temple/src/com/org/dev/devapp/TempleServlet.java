package com.org.dev.devapp;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/TempleServlet")
public class TempleServlet extends GenericServlet{
	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		String TempleName= req.getParameter("name");
		String Area= req.getParameter("area");
		String noOfItems = req.getParameter("items");
		
		
		ServletOutputStream outputStream = resp.getOutputStream();
		//outputStream.print("welcome" +TempleName);
		outputStream.print("welcome" +Area);
		outputStream.print("welcome" +noOfItems);
		
		
		
	}
}
