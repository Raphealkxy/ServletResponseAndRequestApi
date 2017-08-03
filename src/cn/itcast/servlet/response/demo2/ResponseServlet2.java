package cn.itcast.servlet.response.demo2;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ͨ��������� ����û���½
 * 
 * @author seawind
 * 
 */
public class ResponseServlet2 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 1. ��ÿͻ����ύ�û���������
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		// 2���ж��Ƿ���ȷ ������ admin / admin
		if ("admin".equals(username) && "admin".equals(password)) {
			// �û��� �� ������ȷ
			// response.setStatus(302);
			// response.setHeader("Location", "/day06/welcome.html");

			// ʹ��response.sendRedirect����ض���
			response.sendRedirect("/day06/welcome.html");
		} else {
			// ����ȷ
			// response.setStatus(302);
			// response.setHeader("Location",
			// "/day06/response/demo2/login.html");
			response.sendRedirect("/day06/response/demo2/login.html");
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
