package com.javaweb.controller.admin;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javaweb.constant.SystemConstant;
import com.javaweb.model.NewModel;
import com.javaweb.service.INewService;

@WebServlet(urlPatterns = {"/admin-new"})
public class NewController extends HttpServlet {
	
	private static final long serialVersionUID = -6922552214992789789L;
	@Inject
	private INewService newService;


	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		NewModel model = new NewModel();
		String pageStr = request.getParameter("page");
		String maxPageItemStr = request.getParameter("maxPageItem");
		if(pageStr != null) {
			model.setPage(Integer.parseInt(pageStr));
		}else {
			model.setPage(1);
		}
		if(maxPageItemStr != null) {
			model.setMaxPageItem(Integer.parseInt(maxPageItemStr));
		}
		Integer offset = (model.getPage() - 1)* model.getMaxPageItem()
;		model.setListResult(newService.findlAll(offset, model.getMaxPageItem()));
		model.setTotalItem(newService.getTotalItem());
		model.setTotalPage((int) Math.ceil((double) model.getTotalItem() / model.getMaxPageItem()));
		request.setAttribute(SystemConstant.MODEL, model);
		RequestDispatcher rd = request.getRequestDispatcher("/views/admin/new/list.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
