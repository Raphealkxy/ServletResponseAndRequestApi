package cn.itcast.servlet.request.demo1;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 通过request api 获得客户机信息
 * 
 * @author seawind
 * 
 */
public class RequestServlet1 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 问题一 区分 getRequestURL 和 getRequestURI
		System.out.println("url:" + request.getRequestURL());
		System.out.println("uri:" + request.getRequestURI()); // 返回
		// /day06/request1

		// 问题二：了解 通过 getQueryString 可以获得 get方式提交查询串 url中？后面部分
		System.out.println("querystring:" + request.getQueryString());

		// 获得客户端ip
		System.out.println("ip: " + request.getRemoteAddr());

		// 通过 getContextPath 获得工程虚拟目录名称
		System.out.println(request.getContextPath()); // 返回 /day06

		// 通过getMethod 获得请求方式
		System.out.println("请求方式 ： " + request.getMethod());

		// 问题： 获得当前访问资源路径 --- /request1
		System.out.println("当前访问资源路径 ："
				+ request.getRequestURI().substring(
						request.getContextPath().length()));

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
