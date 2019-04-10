package com.lucasmelo.vinho;

import java.io.IOException;

import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lucasmelo.vinho.model.BeerExpert;
import com.lucasmelo.vinho.model.GrapeType;

public class BeerSelect extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(
		HttpServletRequest request,
		HttpServletResponse response
	) throws ServletException, IOException {
		String c = request.getParameter("color");
		String u = request.getParameter("grapeType");
		GrapeType gt = GrapeType.fromInt(Integer.parseInt(u));
		
		BeerExpert be = new BeerExpert();
		List<?> result = be.getBrands(c, gt);
		
		request.setAttribute("styles", result);
		request.setAttribute("grapeType", request.getParameter("grapeType"));
		
		RequestDispatcher view = request.getRequestDispatcher("pages/result.jsp");
		view.forward(request, response);
	}
	
}