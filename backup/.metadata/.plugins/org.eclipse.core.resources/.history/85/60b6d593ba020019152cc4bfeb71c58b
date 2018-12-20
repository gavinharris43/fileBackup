package com.qa.Library;

public abstract class Item {

	private int itemID;
	public static int counter = 1;
	private boolean isAvailable;
	private String name;
	private String published;

	public Item(boolean isAvailable, String name, String published) {
		itemID = counter;
		counter++;
		this.isAvailable = isAvailable;
		this.name = name;
		this.published = published;

	}

	public int getItemId() {
		return itemID;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPublished() {
		return published;
	}

	public void setPublished(String published) {
		this.published = published;
	}

}
