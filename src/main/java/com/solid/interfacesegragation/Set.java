package com.solid.interfacesegragation;

public interface Set<E> {
	boolean add(E e);
	boolean contains(Object o);
	E ceiling(E e);
	E floor(E e);
}
