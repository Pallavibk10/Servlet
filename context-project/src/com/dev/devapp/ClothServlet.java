package com.dev.devapp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cp")
public class ClothServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.service(arg0, arg1);
		
		Product pro=new Product();
		pro.id=3;
		pro.name="silk";
		pro.price=2345;
		pro.brand = "kanchipuram";
		
		ServletOutputStream servletOutputStream = resp.getOutputStream();
		servletOutputStream.println("<html><body bgcolor='pink'>"
		+"<h1>Thank for selecting cloth''"+pro.name +" ' '</h1>" 
				+"<a href='context.html'>back</a>"
				+"</body><html");
	
	}

}
