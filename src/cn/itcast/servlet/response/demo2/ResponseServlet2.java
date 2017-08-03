package cn.itcast.servlet.response.demo2;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 通过这个程序 完成用户登陆
 * 
 * @author seawind
 * 
 */
public class ResponseServlet2 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 1. 获得客户端提交用户名和密码
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		// 2、判断是否正确 ，假设 admin / admin
		if ("admin".equals(username) && "admin".equals(password)) {
			// 用户名 和 密码正确
			// response.setStatus(302);
			// response.setHeader("Location", "/day06/welcome.html");

			// 使用response.sendRedirect完成重定向
			response.sendRedirect("/day06/welcome.html");
		} else {
			// 不正确
			// response.setStatus(302);
			// response.setHeader("Location",
			// "/day06/response/demo2/login.html");
			response.sendRedirect("/day06/response/demo2/login.html");
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
