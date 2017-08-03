package cn.itcast.servlet.response.demo3;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 完成自动跳转功能
 * 
 * @author seawind
 * 
 */
public class ResponseServlet3 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 通过refresh 头信息完成跳转
		response
				.setHeader("refresh", "3;url=/day06/response/demo3/result.html");

		response.setContentType("text/html;charset=utf-8");// 设置响应编码
		response.getWriter().println("3秒后 将跳转 result.html页面！");
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
