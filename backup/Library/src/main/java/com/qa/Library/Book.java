package com.qa.Library;

public final class Book extends Item{
private boolean isFiction;
private int pages;
private String author;

	public Book(boolean isAvailable, String name, String published,boolean isFiction , String author, int pages) {
		super(isAvailable, name, published);
		this.isFiction=isFiction;
		this.pages=pages;
		this.author=author;
	}

	public boolean isFiction() {
		return isFiction;
	}

	public void setFiction(boolean isFiction) {
		this.isFiction = isFiction;
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
