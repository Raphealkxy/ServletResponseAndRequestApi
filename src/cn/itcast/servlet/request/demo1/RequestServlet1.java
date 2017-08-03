package cn.itcast.servlet.request.demo1;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ͨ��request api ��ÿͻ�����Ϣ
 * 
 * @author seawind
 * 
 */
public class RequestServlet1 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// ����һ ���� getRequestURL �� getRequestURI
		System.out.println("url:" + request.getRequestURL());
		System.out.println("uri:" + request.getRequestURI()); // ����
		// /day06/request1

		// ��������˽� ͨ�� getQueryString ���Ի�� get��ʽ�ύ��ѯ�� url�У����沿��
		System.out.println("querystring:" + request.getQueryString());

		// ��ÿͻ���ip
		System.out.println("ip: " + request.getRemoteAddr());

		// ͨ�� getContextPath ��ù�������Ŀ¼����
		System.out.println(request.getContextPath()); // ���� /day06

		// ͨ��getMethod �������ʽ
		System.out.println("����ʽ �� " + request.getMethod());

		// ���⣺ ��õ�ǰ������Դ·�� --- /request1
		System.out.println("��ǰ������Դ·�� ��"
				+ request.getRequestURI().substring(
						request.getContextPath().length()));

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
