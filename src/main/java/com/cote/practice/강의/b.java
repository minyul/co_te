package com.cote.practice.강의;

import java.util.HashMap;

public class b {

	public static void main(String[] args) {
		String answer = "false";
		String str1 = "abcd";
		String str2 = "abdc";

		// 길이 맞지 않으면
		if (str1.length() != str2.length()) {
			return answer; // 컴파일 에러 ㄱㅊ
		}

		// 기본으로 담아 우선
		HashMap<Character, Integer> map = new HashMap<>();
		for (char x : str1.toCharArray()) {
			map.put(x, map.getOrDefault(x, 0) + 1);
		}

		for (char x : str2.toCharArray()) {
			if (!map.containsKey(x) || 0 == map.get(x)) {

				return answer;
			}
		}

		for (char c : map.keySet()) {
			if (0 != map.get(c)) {

				return answer;
			}
		}
		return "yes";
	}
}
