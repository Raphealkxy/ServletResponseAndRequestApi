package cn.itcast.test;

import java.io.IOException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class URLEncoderTest {
	public static void main(String[] args) throws IOException {
		String s = " +/?%&#";
		String s1 = URLEncoder.encode(s, "utf-8");
		System.out.println(s1);
		String s2 = URLDecoder.decode(s1, "utf-8");
		System.out.println(s2);
	}
}
