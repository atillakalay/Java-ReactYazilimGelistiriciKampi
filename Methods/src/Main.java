
public class Main {

	public static void main(String[] args) {
		sayiBulmaca();

	}

	public static void sayiBulmaca() {
		int[] sayilar = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
		int aranacak = 6;
		boolean varmi = false;

		for (int i = 0; i < sayilar.length; i++) {
			if (i == aranacak) {
				varmi = true;
				break;
			}
		}
		String mesaj = "";
		if (varmi) {
			mesaj = "Sayý Mevcuttur: " + aranacak;
			mesajVer(mesaj);
		} else {
			mesaj = "Sayý Mevcut Deðildir: " + aranacak;
			mesajVer(mesaj);
		}
	}

	public static void mesajVer(String mesaj) {
		System.out.println("Sayý Mevcuttur: ");
	}

}
