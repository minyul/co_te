package com.cote.practice.강의;

public class q {

	public static void main(String[] args) {
		String answer = "";
		String str = "abcde";

		// 별건 아닌데 Character.toUpperCase 하고 Character.toLowerCase를 외워두면 좋은 것 같아.

		for (char c : str.toCharArray()) {
			System.out.println(c + 1);
			System.out.println(Character.toUpperCase(c));
		}

		// Todo : 만약에 toUpperCase, toLowerCase 를 까먹었을 경우, 97 과 65를 생각하면 되며
		// Todo : c + 1 로 숫자를 찍어보고 확인해보면 됨. + 65 로 컨트롤 하여 소문자, 대문자로 변환 쌉가능이요~
	}
}
