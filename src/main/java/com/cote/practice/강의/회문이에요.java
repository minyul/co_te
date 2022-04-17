package com.cote.practice.강의;

public class 회문이에요 {

	public static void main(String[] args) {
		String str = "abcbb";
		String answer = "YES";
		int len = str.length();
		for (int index = 0 ; index < (len/2); ++index) {
			if (str.charAt(index) != str.charAt(len - 1 - index)) {
				answer = "NO";
				break;
			}
		}
		System.out.println(answer);
	}
}
