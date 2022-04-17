package com.cote.practice.강의;

public class h {

	public static void main(String[] args) {
		// 가장 긴 단어를 answer 에다가 넣는..
		String str = "I love you";
		String answer = "";
		int len = Integer.MIN_VALUE;

		for (String indexStr : str.split(" ")) {
			if (len < indexStr.length()) {
				len = indexStr.length();
				answer = indexStr;
			}
		}

		System.out.println(answer);


		// indexOf 와 subString 으로 풀어보기
		int pos;
		while((pos = str.indexOf(" ")) != -1) {
			String temp = str.substring(0, pos);
			int tempLen = temp.length();
			if (tempLen > len) {
				len = tempLen;
				answer = temp;
			}
			str = str.substring(pos + 1);
		}
	}
}
