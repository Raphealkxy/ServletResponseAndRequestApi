package cn.itcast.servlet.request.demo3;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ͨ��ͷ��Ϣ ���г��������
 * 
 * @author seawind
 * 
 */
public class RequestServlet3 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// ͨ��getHeader ���refererͷ��Ϣ
		String referer = request.getHeader("referer");
		// �ж�ͷ��Ϣ ����֪���ǲ��ǵ���
		response.setContentType("text/html;charset=utf-8");
		if (referer == null || !referer.startsWith("http://localhost")) {
			// �ǵ���
			response.getWriter().println("�ǵ���");
		} else {
			// ���ǵ���
			response.getWriter().println("����治�ǵ�����");
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
