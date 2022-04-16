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

		/**
		 * 'a' 와 "a" 는 다르다. 주의해야한다.
		 */
		System.out.println(map.size());
		map.remove('a');

		int max = Integer.MIN_VALUE;

		for (Character c : map.keySet()) {
			System.out.println(c);
			if (map.get(c) > max) {
				max = map.get(c);
				answer = c;
			}
		}
		System.out.println(answer);
	}
}
