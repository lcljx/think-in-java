package com.ljx.hello;

public class SplitStr {
	public static void main(String[] args) {
		final String extUrlStr = "workspace:http://soaware.ygsoft.com/skpool,method:cdrztxhSync";
		String method = "";
		if (extUrlStr.indexOf("method") != -1) {
			method = extUrlStr;
		}
		final String[] extUrlStrArr = extUrlStr.split(",");
		for (String subUrl : extUrlStrArr) {
			if (subUrl.indexOf("method") != -1) {
				method = subUrl.split(":")[1];
			}
		}
		System.out.println(method);
	}
}
