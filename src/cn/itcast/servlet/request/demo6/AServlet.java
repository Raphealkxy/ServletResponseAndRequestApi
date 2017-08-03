package cn.itcast.servlet.request.demo6;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ͨ��AServlet����һ������ �� BServlet
 * 
 * @author seawind
 * 
 */
public class AServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// ���һ ���flush ������forward
		// response.getWriter().println("Hello");// HelloĬ�������������������ڲ�����
		// response.getWriter().flush();

		// ����� ��ͬһ��Servlet����ʹ�ö�� forward ���� sendRedirect
		// response.sendRedirect("/day06/welcome.html");

		response.getWriter().println("Hello"); // Hello����ڴ滺��������forwardʱ���������ᱻ���

		// ͨ��request���󴫵�
		// ��request����� ����һ������
		request.setAttribute("name", "itcast");

		// �������ݸ� BServlet ����ʹ������ת��
		RequestDispatcher dispatcher = request.getRequestDispatcher("/b");
		dispatcher.forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
