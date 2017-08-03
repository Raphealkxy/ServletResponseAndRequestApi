package cn.itcast.servlet.response.demo1;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 验证状态码 设置效果
 * 
 * @author seawind
 * 
 */
public class ResponseServlet1 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("response1 ...");
		// response.setStatus(500); // 通过setStatus 向客户端设置不同响应 状态码

		// 302 客户端重定向 --- 结合 Location头信息一起使用
		response.setStatus(302);
		// 通知浏览器 定向到哪个页面
		response.setHeader("Location", "/day06/welcome.html"); // 相对路径 和 绝对路径
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
