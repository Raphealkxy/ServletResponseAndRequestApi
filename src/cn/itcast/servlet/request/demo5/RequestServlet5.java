package cn.itcast.servlet.request.demo5;

import java.io.IOException;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ������form ����������
 * 
 * @author seawind
 * 
 */
public class RequestServlet5 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// ���post����
		// request.setCharacterEncoding("utf-8");

		// ͨ�� getParameter ���ָ������
		String username = request.getParameter("username");
		System.out.println(username); // ���һ��ֵ

		// ���get���� --- ʹ���ֶ�����
		// username = URLEncoder.encode(username, "ISO-8859-1");// ��ISO����
		// username = URLDecoder.decode(username, "utf-8"); // ��utf-8����

		username = new String(username.getBytes("ISO-8859-1"), "utf-8");
		System.out.println(username);

		// �ǿ�У��
		if (username != null && username.trim().length() > 0) {
			System.out.println("username �Ϸ�");
		}

		// ʹ�� getParameter ��� checkbox �ύ���ݡ�Ĭ��ֻ�ܻ�õ�һ������
		String hobby = request.getParameter("hobby"); // ��ѡ��
		System.out.println(hobby);

		// ���checkbox�����ύ����--- getParameterValues
		String[] hobbies = request.getParameterValues("hobby");
		System.out.println(Arrays.toString(hobbies));

		System.out.println("--------------------------------");

		// ��ӡ���������ύ����
		// ��ʽһ : �Ȼ�����в��� name ��Ȼ��ͨ��name ���value
		Enumeration<String> names = request.getParameterNames();
		while (names.hasMoreElements()) {
			String name = names.nextElement();// ���ÿһ����������
			System.out.println(name + ":"
					+ Arrays.toString(request.getParameterValues(name)));
		}

		System.out.println("----------------------------");
		// ��ʽ�� ��ͨ��request.getParameterMap
		Map<String, String[]> parameterMap = request.getParameterMap();
		Set<String> keys = parameterMap.keySet();
		for (String key : keys) { // key�ǲ��� name
			System.out.println(key + ":"
					+ Arrays.toString(parameterMap.get(key)));
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
