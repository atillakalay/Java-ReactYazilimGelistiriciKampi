package abstractClasses;

public class Main {

	public static void main(String[] args) {
		GameCalculator gameCalculator = new ManGameCalculator();
		gameCalculator.hesapla();
		gameCalculator.gameOver();
	}

}
