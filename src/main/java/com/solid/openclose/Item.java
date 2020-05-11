package com.solid.openclose;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Item implements Serializable {
	private static final long serialVersionUID = 1L;
	private long id;
	private String name;
	private double price;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public List<Item> addItems() {
		List<Item> items = new ArrayList<>();
		Item item = new Item();
		item.setId(1);
		item.setName("Laptop");
		item.setPrice(30000);
		items.add(item);
		item = new Item();
		item.setId(1);
		item.setName("Laptop");
		item.setPrice(30000);
		items.add(item);
		item = new Item();
		item.setId(1);
		item.setName("Laptop");
		item.setPrice(30000);
		items.add(item);
		return items;
	}

}
