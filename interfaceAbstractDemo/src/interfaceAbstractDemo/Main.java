package interfaceAbstractDemo;

import interfaceAbstractDemo.Adapters.MernisServiceAdapter;
import interfaceAbstractDemo.Concrete.BaseCustomerManager;
import interfaceAbstractDemo.Concrete.StarbucksCustomerManager;
import interfaceAbstractDemo.Entities.Customer;

public class Main {

	public static void main(String[] args) throws Exception {

		BaseCustomerManager baseCustomerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		Customer atilla = new Customer(1, "Atilla", "Kalay", 1999, "111111111111");
		baseCustomerManager.save(atilla);

	}
}
