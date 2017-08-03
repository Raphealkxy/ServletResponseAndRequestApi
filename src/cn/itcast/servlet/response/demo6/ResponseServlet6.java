package cn.itcast.servlet.response.demo6;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ʵ���ļ�����
 * 
 * @author seawind
 * 
 */
public class ResponseServlet6 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// ����ļ���
		String filename = request.getParameter("filename");
		System.out.println(filename);

		response.setContentType(getServletContext().getMimeType(filename));// ����MIME����
		// tomcat/conf/web.xml
		response.setHeader("Content-Disposition", "attachment;filename="
				+ filename);

		// ���� ��ȡĿ���ļ���ͨ��response ��Ŀ���ļ�����д���ͻ���
		// ���Դ���·�� ��ȡ�ļ�
		String fullFilename = getServletContext().getRealPath(
				"/response/demo6/" + filename);
		InputStream in = new FileInputStream(fullFilename);
		OutputStream out = response.getOutputStream();
		int b;
		while ((b = in.read()) != -1) {
			out.write(b);
		}
		in.close();
		out.close();
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
