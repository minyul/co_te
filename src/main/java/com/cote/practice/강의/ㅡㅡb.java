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
	}
}
