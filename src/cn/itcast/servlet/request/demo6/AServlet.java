package cn.itcast.servlet.request.demo6;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 通过AServlet传递一个数据 给 BServlet
 * 
 * @author seawind
 * 
 */
public class AServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 情况一 如果flush ，不能forward
		// response.getWriter().println("Hello");// Hello默认输出浏览器，服务器内部缓存
		// response.getWriter().flush();

		// 情况二 在同一个Servlet不能使用多次 forward 或者 sendRedirect
		// response.sendRedirect("/day06/welcome.html");

		response.getWriter().println("Hello"); // Hello输出内存缓冲区。在forward时，缓冲区会被清除

		// 通过request对象传递
		// 向request域对象 保存一个属性
		request.setAttribute("name", "itcast");

		// 传递数据给 BServlet 必须使用请求转发
		RequestDispatcher dispatcher = request.getRequestDispatcher("/b");
		dispatcher.forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
