package com.solid.interfacesegragation;

public class InterfaceSegregation {

	public static void main(String[] args) {
		Set ts = new TreeSet();
		ts.ceiling(new Double(10.5));
		
		Set hs = new HashSet();
		ts.ceiling(new Double(10.5)); // Doesn't want to implement this method in HashSet
		
		TreeSetInterfaceSegregation treeSet = new TreeSetInterfaceSegregation();
		treeSet.floor(new Double(15.5));
		
		HashSetInterfaceSegregation hashSet = new HashSetInterfaceSegregation();
		hashSet.add("10");
	}
}
