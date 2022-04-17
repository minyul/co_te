package com.cote.practice.강의;

public class 숫자만갖고오고싶은데 {
	
	public static void main(String[] args) {
		String str = "a0bc1fe3";
		int answer; // 내가 원하는 답은 13인데.

		String tempStr = "";
		for (char c : str.toCharArray()) {
			if (Character.isDigit(c)) {
				tempStr += c;
			}
		}

		answer = Integer.parseInt(tempStr);
		System.out.println(answer);
	}
}
