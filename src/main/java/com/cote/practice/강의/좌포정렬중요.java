package com.cote.practice.강의;

import java.util.ArrayList;
import java.util.Collections;

class Point implements Comparable<Point> {

	public int x;
	public int y;

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// this -> object : 음수 - Todo : 오름차순 이걸 무조건 기억해야해
	@Override
	public int compareTo(Point point) {
		if (this.x == point.x) {
			return this.y - point.y;
		}
		return this.x - point.x;
	}
}

public class 좌포정렬중요 {

	public static void main(String[] args) {

		ArrayList<Point> points = new ArrayList<>();
		Point point = new Point(1,2);
		// 등등 추가하고
		Collections.sort(points); // 하면 저절로 가능~요.
	}
}
