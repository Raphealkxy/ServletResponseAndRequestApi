package cn.itcast.servlet.request.demo4;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 获得请求参数
 * 
 * @author seawind
 * 
 */
public class RequestServlet4 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 通过getParameter 获得请求数据
		String name = request.getParameter("name");
		System.out.println(name);
		String city = request.getParameter("city");
		System.out.println(city);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
