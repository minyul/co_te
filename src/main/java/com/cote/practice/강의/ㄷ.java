package com.cote.practice.강의;

public class ㄷ {

	public void A(int n) {
		if (0 == n) {
			return ;
		}
		System.out.println(n);
		A(n - 1);
	}

	public static void main(String[] args) {
		ㄷ e = new ㄷ();
		e.A(5);
	}
}
