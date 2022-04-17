package com.cote.practice.강의;

public class q {

	public static void main(String[] args) {
		String answer = "";
		String str = "abcde";

		// 별건 아닌데 Character.toUpperCase 하고 Character.toLowerCase를 외워두면 좋은 것 같아.

		for (char c : str.toCharArray()) {
			System.out.println(Character.toUpperCase(c));
		}
	}
}
