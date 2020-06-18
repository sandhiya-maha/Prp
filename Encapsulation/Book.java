package Encapsulation;

public class Book extends Author {
	private String bookName;
	private double price;
	private int qtyInStock;
	public Book(String name, String email, char gender, String bookName, double price, int qtyInStock) {
		super(name, email, gender);
		this.bookName = bookName;
		this.price = price;
		this.qtyInStock = qtyInStock;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQtyInStock() {
		return qtyInStock;
	}
	public void setQtyInStock(int qtyInStock) {
		this.qtyInStock = qtyInStock;
	}
	
	
}
