package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.object_controller;


public class SignUpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
			req.getRequestDispatcher("/_view/signup.jsp").forward(req, resp);	
		}


	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		object_controller controller = new object_controller();
		
		
		
			req.getRequestDispatcher("/_view/signup.jsp").forward(req, resp);
	}
}
