package cn.itcast.servlet.response.demo5;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 向浏览器输出 中文信息
 * 
 * @author seawind
 * 
 */
public class ResponseServlet5 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setCharacterEncoding("utf-8"); // 设置响应内容编码集 ，无法设置浏览器查看编码

		System.out.println("c1:" + response.getCharacterEncoding());

		// 需要通知浏览器 查看编码
		response.setContentType("text/html;charset=gbk"); // 设置响应编码 与 浏览器查看编码

		System.out.println("c2:" + response.getCharacterEncoding());

		// 输出中文信息--- 字符流
		PrintWriter out = response.getWriter();
		out.println("我很好！");

		// 默认在方法结束后，自动关闭 response输出流，flush缓冲区内容
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
