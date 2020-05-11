package com.solid.liskovsubstitution;

public class LiskovSubstitution {

	public static void main(String[] args) {
		Rectangle rectangle = new Square();
		rectangle.setBreadth(2);
		rectangle.setLength(3);
		System.out.println("Area: "+ rectangle.getArea());
		
		Shape shape = new RectangleLiskov();
		shape.setLength(2);
		shape.setBreadth(3);
		System.out.println("Rectangle Area: "+ shape.getArea());
		
		shape = new SquareLiskov();
		shape.setLength(2);
		System.out.println("Sqaure Area: "+ shape.getArea());
	}

}
