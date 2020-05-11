package com.solid.liskovsubstitution;

public class Square extends Rectangle {
	public void setBreadth(int breadth) {
		super.setBreadth(breadth);
		super.setLength(breadth);
	}

	public void setLength(int length) {
		setBreadth(length);
	}

}
