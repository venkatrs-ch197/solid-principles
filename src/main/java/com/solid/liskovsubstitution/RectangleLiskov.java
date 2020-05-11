package com.solid.liskovsubstitution;

public class RectangleLiskov extends Shape {
	public void setLength(int length) {
		super.setLength(length);
	}

	public void setBreadth(int breadth) {
		super.setBreadth(breadth);
	}
}
