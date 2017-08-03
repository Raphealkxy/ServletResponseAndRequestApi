package cn.itcast.servlet.request.demo2;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ���ͷ��Ϣ����
 * 
 * @author seawind
 * 
 */
public class RequestServlet2 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("test...");
		// ���ָ��ͷ��Ϣ�ֶ� Accept-Encoding: gzip, deflate
		String value = request.getHeader("Accept-Encoding"); // ���ͷ��Ϣ���ڶ��ֵ�������ֵƴ�ӵ�һ���γ�String
		System.out.println(value); // gzip, deflate

		System.out.println("--------------------------------");
		// �������ͷ��Ϣ���� ---- �������ͷ��Ϣ����
		Enumeration<String> enumeration = request.getHeaderNames();
		while (enumeration.hasMoreElements()) {
			String name = enumeration.nextElement(); // name ����һ��ͷ��Ϣ����
			System.out.println(name + ":" + request.getHeader(name));
		}

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
