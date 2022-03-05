package oopIntro;

public class Main {

	public static void main(String[] args) {

		Product product1 = new Product();
		product1.setId(2);
		product1.setName("Lenovo V17");
		product1.setDetail("32GB Ram");
		product1.setDiscount(12);
		product1.setUnitPrice(24000);
		product1.setStockAmount(750);

		Product product2 = new Product();
		product2.setId(2);
		product2.setName("Lenovo V15");
		product2.setDetail("16GB Ram");
		product2.setDiscount(10);
		product2.setUnitPrice(16000);
		product2.setStockAmount(750);

		Product[] products = { product1, product2 };

		for (Product product : products) {
			System.out.println(
					"Ürün Adý: " + product.getName() + " Ýndirimli Fiyatý: " + product.getUnitPriceAfterDiscount());
		}

		ProductManager productManager = new ProductManager();
		productManager.addToCart(product1);
		productManager.addToCart(product2);

		Category category1 = new Category();
		category1.setId(1);
		category1.setName("Ýçecek");

		Category category2 = new Category();
		category2.setId(2);
		category2.setName("Yiyecek");

	}

}
