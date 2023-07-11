package com.javaweb.controller.web;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javaweb.model.NewModel;
import com.javaweb.service.ICategoryService;
import com.javaweb.service.INewService;


@WebServlet(urlPatterns = {"/trang-chu"})
public class HomeController extends HttpServlet {
	@Inject
	private INewService newService;
	
	@Inject
	private ICategoryService categoryService;
	private static final long serialVersionUID = -6622126168801261536L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// test
		String title = "bai viet";
		String content = "bai viet";
		Long categoryId = 1L;
		NewModel newModel = new NewModel();
		newModel.setTitle(title);
		newModel.setContent(content);
		newModel.setCategoryId(categoryId);
		newService.save(newModel);
		request.setAttribute("news", newService.findByCategoryId(categoryId));
		request.setAttribute("categories", categoryService.findAll());
		
		RequestDispatcher rd = request.getRequestDispatcher("/views/web/home.jsp");
		rd.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}
}