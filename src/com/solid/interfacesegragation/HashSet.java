package com.solid.interfacesegragation;

public class HashSet implements Set {
	@Override
	public boolean add(Object e) {
		return false;
	}

	@Override
	public boolean contains(Object o) {
		return false;
	}

	@Override
	public Object ceiling(Object e) {
		// This method is not applicable for HashSet
		return null;
	}

	@Override
	public Object floor(Object e) {
		// This method is not applicable for HashSet
		return null;
	}
}
