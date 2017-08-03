package cn.itcast.servlet.response.demo3;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ����Զ���ת����
 * 
 * @author seawind
 * 
 */
public class ResponseServlet3 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// ͨ��refresh ͷ��Ϣ�����ת
		response
				.setHeader("refresh", "3;url=/day06/response/demo3/result.html");

		response.setContentType("text/html;charset=utf-8");// ������Ӧ����
		response.getWriter().println("3��� ����ת result.htmlҳ�棡");
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
