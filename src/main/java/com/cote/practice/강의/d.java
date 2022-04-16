package com.cote.practice.강의;

public class d {

	public static void main(String[] args) {
		int[] arr = {2, 3, 10, 6, 5};
		int n = arr.length;

		// 오름 차순, 내림 차순으로 정렬할 때, 가장 중요한 기준은 그 자리에 오는 그 ! 숫자가 중요해
		// 그러면, 우선 n개가 있다고 하면 마지막은 이미 정해진거니까 n - 1번만 돌리면되잖아 ?

		for (int index = 0 ; index < n - 1 ; index++) {
			int k = index; // k 자리 숫자를 정할 차례 라는 거지.

			// 오름 차순이니까 가장 작은걸 넣어야겠지.
			for (int innerIndex = k + 1 ; innerIndex < n ; innerIndex++) {
				if (arr[k] > arr[innerIndex]) {
					k = innerIndex;
				}
				int temp = arr[index];
				arr[index] = arr[k];
				arr[k] = temp;
			}
		}

		for (int index = 0; index < n ; ++index) {
			System.out.println(arr[index]);
		}
	}
}
