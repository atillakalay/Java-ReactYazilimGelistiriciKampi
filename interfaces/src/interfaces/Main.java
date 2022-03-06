package interfaces;

public class Main {

	public static void main(String[] args) {

		Logger[] loggers = { new EmailLogger(), new DatabaseLogger(), new FileLogger() };

		CustomerManager customerManager = new CustomerManager(loggers);

		Customer atilla = new Customer(1, "Atilla", "Kalay");
		customerManager.add(atilla);
	}

}
