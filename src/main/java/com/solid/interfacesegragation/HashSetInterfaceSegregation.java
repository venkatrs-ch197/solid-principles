package com.solid.interfacesegragation;

public class HashSetInterfaceSegregation implements SetInterfaceSegregation {
	@Override
	public boolean add(Object e) {
		return false;
	}

	@Override
	public boolean contains(Object o) {
		return false;
	}
}
