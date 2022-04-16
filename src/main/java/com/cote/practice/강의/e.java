package com.cote.practice.강의;

import java.util.Stack;

public class e {

	private static final Stack<Integer> stack= new Stack<>();

	public void binaryAAAA(int n) {
		if (0 == n) {

			return ;
		}

		stack.push(n % 2);
		binaryAAAA(n / 2);
	}

	/**
	 * Stack -> push, pop, isEmpty() 만 좀 알아 두자.
	 *
	 */

	public static void main(String[] args) {
		e e = new e();
		String answer = "";
		e.binaryAAAA(11); // 그럼 이진법으로 1011 이 나와야함.
		// 아니 스택도 get으로 접근가능?
		for (int index = 0 ; index < stack.size(); ++index) {
			answer += stack.get(index);
		}

		System.out.println("진짜 답 : " + answer);

		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
	}
}
