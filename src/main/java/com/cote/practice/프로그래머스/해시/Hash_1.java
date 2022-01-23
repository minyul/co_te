package com.cote.practice.프로그래머스.해시;

import java.util.HashMap;
import java.util.Map;

public class Hash_1 {

	/**
	 * 완주하지 못한 선수
	 * @param participant
	 * @param completion
	 * @author : Minyul
	 */
	public String solution(String[] participant, String[] completion) {
		String answer = "";
		Map<String, Integer> map = new HashMap<>();

		for (String person : participant) {
			map.put(person, map.getOrDefault(person, 0) + 1);
		}

		for (String person : completion) {
			map.put(person, map.get(person) - 1);
		}

		for (String key : map.keySet()) {
			if (map.get(key) != 0) {
				answer = key;
			}
		}

		return answer;
	}
}
