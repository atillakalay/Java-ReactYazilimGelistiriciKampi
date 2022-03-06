
public class Main {

	public static void main(String[] args) {
		Product product = new Product(1, "Laptop", "Monster Laptop", 13500, 5, "Siyah");
		product.setName("Laptop");
		product.setDescription("Monster Laptop");
		product.setPrice(13000);
		product.setStockAmount(750);

		System.out.println(product.getKod());

		ProductManager productManager = new ProductManager();
		productManager.add(product);
		productManager.add2(1, "Kalem", "Faber Castel", 1000, 7.5);
	}

}
