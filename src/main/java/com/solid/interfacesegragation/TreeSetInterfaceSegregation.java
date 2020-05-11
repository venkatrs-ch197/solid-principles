package com.solid.interfacesegragation;

public class TreeSetInterfaceSegregation implements SetInterfaceSegregation, NavigableSetInterfaceSegregation {
	@Override
	public boolean add(Object e) {
		// Implement this method
		return false;
	}

	@Override
	public boolean contains(Object o) {
		// Implement this method
		return false;
	}

	@Override
	public Object ceiling(Object e) {
		// Implement this method
		return null;
	}

	@Override
	public Object floor(Object e) {
		// Implement this method
		return null;
	}
}
