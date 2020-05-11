package com.solid.liskovsubstitution;

public class SquareLiskov extends Shape {
	public void setBreadth(int breadth) {
		super.setBreadth(breadth);
		super.setLength(breadth);
	}

	public void setLength(int length) {
		setBreadth(length);
	}

}
