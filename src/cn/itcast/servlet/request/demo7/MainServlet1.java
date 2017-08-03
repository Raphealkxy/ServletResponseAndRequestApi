package cn.itcast.servlet.request.demo7;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 网页布局页面
 * 
 * @author seawind
 * 
 */
public class MainServlet1 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 编写网页logo
		// response.getWriter().println("<h1>LOGO</h1>");
		request.getRequestDispatcher("/request/demo7/logo.html").include(
				request, response);

		// 网页正文
		response.getOutputStream().write("<h1>Main 1 YYYYYY</h1>".getBytes());

		// 编写网页 版权信息
		// response.getWriter().println("<h1>@Copy</h1>");
		request.getRequestDispatcher("/request/demo7/footer.html").include(
				request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
