package recapDemo_Classes;

public class DortIslem {
	public int topla(int... sayilar) {
		int toplam = 0;
		for (int sayi : sayilar) {
			toplam = toplam + sayi;
		}
		return toplam;
	}

	public int cikar(int sayi1, int sayi2) {
		int sonuc = 0;
		sonuc = sayi1 - sayi2;
		return sonuc;
	}

	public int carp(int sayi1, int sayi2) {
		return sayi1 * sayi2;
	}

	public int bol(int sayi1, int sayi2) {
		return sayi1 / sayi2;
	}
}
