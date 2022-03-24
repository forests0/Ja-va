package ch13;

public class Book {
	private static int number = 100;
	
	private String name;
	private String author;
	private int price;
	private int booknum;
	
	public Book(String name, String author, int price) {
		this.name = name;
		this.author = author;
		this.price = price;
		this.booknum = number++;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getBooknum() {
		return booknum;
	}

	public void setBooknum(int booknum) {
		this.booknum = booknum;
	}
	public void ShowInfo() {
		System.out.println("å �̸� : " + name);
		System.out.println("å ���� : " + author);
		System.out.println("å ���� : " + price);
		System.out.println("å ��ȣ : " + booknum);
	}
}
