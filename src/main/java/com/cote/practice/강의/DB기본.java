package com.cote.practice.강의;

public class DB기본 {

	static int[] arr = new int[11];

	public static void main(String[] args) {
		arr[0] = 1;
		arr[1] = 2;

		// Todo : 나는 arr[10] 이 알고싶은걸?

		for (int index = 2 ; index < 11; ++index) {
			arr[index] = arr[index - 1] + arr[index - 2];
		}

		System.out.println(arr[10]);
	}
}
