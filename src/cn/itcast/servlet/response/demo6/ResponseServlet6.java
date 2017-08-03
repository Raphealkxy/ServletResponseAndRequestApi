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
 * 实现文件下载
 * 
 * @author seawind
 * 
 */
public class ResponseServlet6 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 获得文件名
		String filename = request.getParameter("filename");
		System.out.println(filename);

		response.setContentType(getServletContext().getMimeType(filename));// 设置MIME类型
		// tomcat/conf/web.xml
		response.setHeader("Content-Disposition", "attachment;filename="
				+ filename);

		// 下载 读取目标文件，通过response 将目标文件内容写到客户端
		// 绝对磁盘路径 读取文件
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
