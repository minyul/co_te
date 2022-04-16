package com.cote.practice.강의;

import java.util.HashMap;

public class c {

	public static void main(String[] args) {
		int[] arr = {20, 12, 20, 10, 23, 17, 10}; // 7 - 3 = 4
		int n = arr.length;
		int k = 3; // 20 12 20 -> 12 20 10 -> 20 10 23 -> 10 23 17 -> 23 17 10
		int lt = 0;

		int[] answer = new int[n - k + 1];

		HashMap<Integer, Integer> hashMap = new HashMap<>();

		for (int index = 0 ; index < k - 1; ++index) {
			hashMap.put(arr[index], hashMap.getOrDefault(arr[index], 0) + 1);
		}

		for (int rt = k - 1 ; rt < n ; rt++) {
			hashMap.put(arr[rt], hashMap.getOrDefault(arr[rt], 0) + 1);
			answer[lt] = hashMap.size();
			hashMap.put(arr[lt], hashMap.get(arr[lt]) - 1);
			if (0 == hashMap.get(arr[lt])) {
				hashMap.remove(arr[lt]);
			}
			lt++;
		}

		for (int index = 0 ; index < answer.length ; ++index) {
			System.out.println(answer[index]);
		}
	}
}
