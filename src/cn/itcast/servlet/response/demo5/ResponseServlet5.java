package cn.itcast.servlet.response.demo5;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ���������� ������Ϣ
 * 
 * @author seawind
 * 
 */
public class ResponseServlet5 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setCharacterEncoding("utf-8"); // ������Ӧ���ݱ��뼯 ���޷�����������鿴����

		System.out.println("c1:" + response.getCharacterEncoding());

		// ��Ҫ֪ͨ����� �鿴����
		response.setContentType("text/html;charset=gbk"); // ������Ӧ���� �� ������鿴����

		System.out.println("c2:" + response.getCharacterEncoding());

		// ���������Ϣ--- �ַ���
		PrintWriter out = response.getWriter();
		out.println("�Һܺã�");

		// Ĭ���ڷ����������Զ��ر� response�������flush����������
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
