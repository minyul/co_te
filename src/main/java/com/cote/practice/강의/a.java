package com.cote.practice.강의;

import java.util.HashMap;

public class a {

	public static void main(String[] args) {
		String str = "abcdd";
		char answer = ' ';
		HashMap<Character, Integer> map = new HashMap<>();
		for (Character c : str.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}

		int max = Integer.MIN_VALUE;

		for (Character c : map.keySet()) {
			if (map.get(c) > max) {
				max = map.get(c);
				answer = c;
			}
		}
		System.out.println(answer);
	}
}
