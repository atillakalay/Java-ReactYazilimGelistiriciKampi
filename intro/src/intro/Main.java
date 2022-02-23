package intro;

public class Main {

	public static void main(String[] args) {
		// camelCase
		// Don't repeat your self.

		String internetSubeButonu = "Ýnternet þubeye gir";
		double dolarDun = 8.15;
		double dolarBugun = 8.18;
		boolean dustuMu = false;

		System.out.println(internetSubeButonu);

		if (dolarBugun < dolarDun) {
			System.out.println("Dolar düþtü!");
		} else if (dolarDun == dolarBugun) {
			System.out.println("Dolar eþit");
		} else {
			System.out.println("Dolar çýktý!");
		}

		String kredi1 = "Hýzlý Kredi";
		String kredi2 = "Mutlu Emekli Kredisi";
		String kredi3 = "Konut kredisi";
		String kredi4 = "Çiftçi kredisi";
		String kredi5 = "Msb Kredisi";
		String kredi6 = "Meb Kredisi";
		String kredi7 = "Kültür Bakanlýðý Kredisi";

		System.out.println(kredi1);
		System.out.println(kredi2);
		System.out.println(kredi3);
		System.out.println(kredi4);
		System.out.println(kredi5);
		System.out.println(kredi6);
		System.out.println(kredi7);

		String[] krediler = { "Hýzlý Kredi", "Mutlu Emekli Kredisi", "Konut kredisi", "Çiftçi kredisi", "Msb Kredisi",
				"Meb Kredisi", "Kültür Bakanlýðý Kredisi" };

		// Foreach
		for (String kredi : krediler) {
			System.out.println("Listele: " + kredi);
		}

		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}

		int sayi1 = 10;
		int sayi2 = 20;
		sayi1 = sayi2;
		sayi2 = 100;
		System.out.println(sayi1);

		int[] sayilar1 = { 1, 2, 3, 4, 5 };
		int[] sayilar2 = { 10, 20, 30, 40, 50 };
		sayilar1 = sayilar2;
		sayilar2[0] = 100;
		System.out.println(sayilar1[0]);

		String sehir1 = "Ankara";
		String sehir2 = "Ýstanbul";
		sehir1 = sehir2;
		sehir2 = "Ýzmir";
		System.out.println(sehir1);
	}

}
