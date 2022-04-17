package com.cote.practice.강의;

import java.util.ArrayList;
import java.util.List;

public class ㅡㅡb {

	public static void main(String[] args) {
		List<String> answer = new ArrayList<>();
		String a = "abc";
		String b = "cba";
		answer.add(new StringBuilder(a).reverse().toString());
		answer.add(new StringBuilder(b).reverse().toString());

		for (String str : answer) {
			System.out.println(str);
		}

		// 우리가 한번 해보자.
		String str = "abcde"; // edcba 로!
		int lp = 0 ;
		int rp = str.length() - 1;
		char[] charStr = str.toCharArray();
		while (lp < rp) {
			// str[lp] <-> str[rp] 바꿔야함.
			char tempChar = charStr[lp];
			charStr[lp] = charStr[rp];
			charStr[rp] = tempChar;
			lp++;
			rp--;
		}
		System.out.println(charStr);
	}
}
