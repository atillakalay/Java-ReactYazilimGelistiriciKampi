package inheritance2;

public class Main {

	public static void main(String[] args) {
		// LogManager logManager = new LogManager();
		// logManager.Log(1);

		CustomerManager customerManager = new CustomerManager();
		Logger logger = new FileLogger();

		customerManager.add(logger);

	}

}
