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
 * 获得最复杂form 的所有数据
 * 
 * @author seawind
 * 
 */
public class RequestServlet5 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 解决post乱码
		// request.setCharacterEncoding("utf-8");

		// 通过 getParameter 获得指定数据
		String username = request.getParameter("username");
		System.out.println(username); // 获得一个值

		// 解决get乱码 --- 使用手动编码
		// username = URLEncoder.encode(username, "ISO-8859-1");// 用ISO编码
		// username = URLDecoder.decode(username, "utf-8"); // 用utf-8解码

		username = new String(username.getBytes("ISO-8859-1"), "utf-8");
		System.out.println(username);

		// 非空校验
		if (username != null && username.trim().length() > 0) {
			System.out.println("username 合法");
		}

		// 使用 getParameter 获得 checkbox 提交数据。默认只能获得第一个数据
		String hobby = request.getParameter("hobby"); // 多选框
		System.out.println(hobby);

		// 获得checkbox所有提交数据--- getParameterValues
		String[] hobbies = request.getParameterValues("hobby");
		System.out.println(Arrays.toString(hobbies));

		System.out.println("--------------------------------");

		// 打印所有请求提交参数
		// 方式一 : 先获得所有参数 name ，然后通过name 获得value
		Enumeration<String> names = request.getParameterNames();
		while (names.hasMoreElements()) {
			String name = names.nextElement();// 获得每一个参数名称
			System.out.println(name + ":"
					+ Arrays.toString(request.getParameterValues(name)));
		}

		System.out.println("----------------------------");
		// 方式二 ：通过request.getParameterMap
		Map<String, String[]> parameterMap = request.getParameterMap();
		Set<String> keys = parameterMap.keySet();
		for (String key : keys) { // key是参数 name
			System.out.println(key + ":"
					+ Arrays.toString(parameterMap.get(key)));
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
