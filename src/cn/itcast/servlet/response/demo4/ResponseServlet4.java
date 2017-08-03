package cn.itcast.servlet.response.demo4;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ͨ��Servlet��ֹ ����
 * 
 * @author seawind
 * 
 */
public class ResponseServlet4 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Ĭ�� ��������� �ó��򻺴�

		// �������������
		response.setHeader("Cache-Control", "no-cache");
		response.setHeader("Pragma", "no-cache");
		// ����expires ��Ϊ���ڸ�ʽ�ܸ���
		// response.setHeader("Expires", "Thu, 01 Dec 1994 16:00:00 GMT");

		// ͨ�� setDateHeader Ϊ expires���� ����ֵ --- ��1970��1��1�� 00:00:00����
		response.setDateHeader("expires", -1); // �Ѿ�����

		response.getWriter().println("HelloXXXX!");
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
