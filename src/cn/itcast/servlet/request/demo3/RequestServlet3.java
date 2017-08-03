package cn.itcast.servlet.request.demo3;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 通过头信息 进行程序防盗链
 * 
 * @author seawind
 * 
 */
public class RequestServlet3 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 通过getHeader 获得referer头信息
		String referer = request.getHeader("referer");
		// 判断头信息 可以知道是不是盗链
		response.setContentType("text/html;charset=utf-8");
		if (referer == null || !referer.startsWith("http://localhost")) {
			// 是盗链
			response.getWriter().println("是盗链");
		} else {
			// 不是盗链
			response.getWriter().println("这个真不是盗链！");
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
