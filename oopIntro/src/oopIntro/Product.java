package oopIntro;

public class Product {

	public Product() {
		System.out.println("Constructor çalýþtý.");
	}

	public Product(int id, String name, String detail, double price, int stockAmount) {
		this.id = id;
		this.name = name;
		this.detail = detail;
		this.price = price;
		this.stockAmount = stockAmount;

	}

	int id;
	String name;
	String detail;
	double price;
	int stockAmount;
}
