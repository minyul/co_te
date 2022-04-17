package com.cote.practice.강의;

public class 중복스트링 {

	public static void main(String[] args) {

		String str = "abbccde";
		String answer = "";
		int index = 0;

		for (char c : str.toCharArray()) {
			if (str.indexOf(c) == index) {
				answer += c;
			}
			index++;
		}
		System.out.println(answer);
		answer = "";
		for (int i = 0 ; i < str.length() ; ++i) {
			if (str.indexOf(str.charAt(i)) == i) {
				answer += str.charAt(i);
			}
		}
		System.out.println(answer);
	}
}
