package cn.itcast.servlet.response.demo1;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ��֤״̬�� ����Ч��
 * 
 * @author seawind
 * 
 */
public class ResponseServlet1 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("response1 ...");
		// response.setStatus(500); // ͨ��setStatus ��ͻ������ò�ͬ��Ӧ ״̬��

		// 302 �ͻ����ض��� --- ��� Locationͷ��Ϣһ��ʹ��
		response.setStatus(302);
		// ֪ͨ����� �����ĸ�ҳ��
		response.setHeader("Location", "/day06/welcome.html"); // ���·�� �� ����·��
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
