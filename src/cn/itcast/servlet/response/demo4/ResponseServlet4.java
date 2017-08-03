package cn.itcast.servlet.response.demo4;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 通过Servlet禁止 缓存
 * 
 * @author seawind
 * 
 */
public class ResponseServlet4 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 默认 浏览器产生 该程序缓存

		// 禁用浏览器缓存
		response.setHeader("Cache-Control", "no-cache");
		response.setHeader("Pragma", "no-cache");
		// 设置expires 因为日期格式很复杂
		// response.setHeader("Expires", "Thu, 01 Dec 1994 16:00:00 GMT");

		// 通过 setDateHeader 为 expires设置 毫秒值 --- 从1970年1月1日 00:00:00毫秒
		response.setDateHeader("expires", -1); // 已经过期

		response.getWriter().println("HelloXXXX!");
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
