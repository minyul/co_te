package com.cote.practice.강의;

import java.util.HashMap;

public class a {

	public static void main(String[] args) {
		String str = "abcdd";
		HashMap<Character, Integer> map = new HashMap<>();
		for (Character c : str.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}
		for (Character c : map.keySet()) {
			System.out.println(c);
			System.out.println(map.get(c));
		}
	}
}
