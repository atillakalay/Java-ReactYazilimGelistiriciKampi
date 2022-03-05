package inheritance;

public class Main {

	public static void main(String[] args) {
		IndividualCustomer atilla = new IndividualCustomer();
		atilla.id = 1;
		atilla.firstName = "Atilla";
		atilla.lastName = "Kalay";
		atilla.customerNumber = "1234";

		CorporateCustomer hepsiBurada = new CorporateCustomer();
		hepsiBurada.id = 1;
		hepsiBurada.companyName = "Hepsi Burada";
		hepsiBurada.customerNumber = "6789";

		SendikaCustomer sendikaCustomer = new SendikaCustomer();
		sendikaCustomer.id = 1;
		sendikaCustomer.customerNumber = "99999";

		CustomerManager customerManager = new CustomerManager();
		// customerManager.add(atilla);
		// customerManager.add(hepsiBurada);
		// customerManager.add(sendikaCustomer);

		Customer[] customers = { atilla, hepsiBurada, sendikaCustomer };

		customerManager.addMultiple(customers);
	}

}
