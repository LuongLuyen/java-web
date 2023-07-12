package com.javaweb.controller.admin.api;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javaweb.utils.HttpUtil;

@WebServlet(urlPatterns = {"/api-admin-new"})
public class NewAPI extends HttpServlet {

	private static final long serialVersionUID = -6922552214992789789L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("application/json");
		HttpUtil.of(request.getReader());

	}
	protected void doPut(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}
	protected void doDelete(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
