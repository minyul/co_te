package com.cote.practice.강의;

public class 팰린드인데정규식까지 {

	public static void main(String[] args) {
		String str = "abc ; name : eman cba";

		// String 에 특수 문자가 들어가 있으면 replaceAll 를 이용하여 없애버리고
		str = str.toUpperCase().replaceAll("[^A-Z]", "");

		// 만약 반대로 돌려야하는 경우가 생긴다면 StringBuilder를 이용하여 reverse 를 이용하여 돌려라.
		String tempStr = new StringBuilder(str).reverse().toString();

		System.out.println(str);
		System.out.println(tempStr);

		if (str.equals(tempStr)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
