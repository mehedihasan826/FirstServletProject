package com.telvrestsrif;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SqServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		
//		int k = (int) req.getAttribute("k");   ///request dispatcher
		int k = Integer.parseInt(req.getParameter("k")); ///session management/url rewriting
		
		PrintWriter out = res.getWriter();
		out.println("Hello to sq servlet "+ k*k);
	}

}
