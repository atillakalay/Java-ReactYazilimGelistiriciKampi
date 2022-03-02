package recapDemo_Classes;

public class DortIslem {
	public int topla(int... sayilar) {
		int toplam = 0;
		for (int sayi : sayilar) {
			toplam = toplam + sayi;
		}
		return toplam;
	}

	public int cikar(int... sayilar) {
		int sonuc = 0;
		for (int sayi : sayilar) {
			sonuc = sayi - sonuc;
		}
		return sonuc;
	}

	public int carp(int sayi1, int sayi2) {
		return sayi1 * sayi2;
	}

	public int bol(int sayi1, int sayi2) {
		return sayi1 / sayi2;
	}
}
