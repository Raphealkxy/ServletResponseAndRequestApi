package cn.itcast.servlet.request.demo2;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 获得头信息内容
 * 
 * @author seawind
 * 
 */
public class RequestServlet2 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("test...");
		// 获得指定头信息字段 Accept-Encoding: gzip, deflate
		String value = request.getHeader("Accept-Encoding"); // 如果头信息存在多个值，将多个值拼接到一起，形成String
		System.out.println(value); // gzip, deflate

		System.out.println("--------------------------------");
		// 获得所有头信息内容 ---- 获得所有头信息名称
		Enumeration<String> enumeration = request.getHeaderNames();
		while (enumeration.hasMoreElements()) {
			String name = enumeration.nextElement(); // name 就是一个头信息名字
			System.out.println(name + ":" + request.getHeader(name));
		}

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
