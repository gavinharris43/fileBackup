package com.qa.Library;

public final  class Journal extends Item /*interface ItemInt*/ {
	private int volume;
	private int pages;
	private String author;

	public Journal(boolean isAvailable, String name, String published,int volume,int pages , String author) {
		super(isAvailable, name, published);
		this.volume=volume;
		this.pages=pages;
		this.author=author;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

}
