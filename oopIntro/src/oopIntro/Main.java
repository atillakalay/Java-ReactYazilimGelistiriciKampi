package oopIntro;

public class Main {

	public static void main(String[] args) {

		Product product1 = new Product(1, "Lenovo V14", "16GB Ram", 14000, 750);

		Product product2 = new Product(2, "Lenovo V15", "64 GB Ram", 15000, 800);
		product2.id = 2;
		product2.name = "Lenovo V15";
		product2.price = 18000;
		product2.detail = "64 GB Ram";

		Product product3 = new Product();
		product3.id = 3;
		product3.name = "Lenovo V16";
		product3.price = 15000;
		product3.detail = "16 GB Ram";

		Product[] products = { product1, product2, product3 };

		for (Product product : products) {
			System.out.println(product.name);
		}

		System.out.println(products.length);

		Category category1 = new Category();
		category1.id = 1;
		category1.name = "Bilgisayar";

		Category category2 = new Category();
		category2.id = 1;
		category2.name = "Ev/Bahçe";

		ProductManager productManager = new ProductManager();
		productManager.addToCart(product1);
		productManager.addToCart(product2);
		productManager.addToCart(product3);
	}

}
