package interfaceAbstractDemo.Concrete;

import interfaceAbstractDemo.Abstract.CustomerService;
import interfaceAbstractDemo.Entities.Customer;

public abstract class BaseCustomerManager implements CustomerService {
	@Override
	public void save(Customer customer) throws Exception {
		System.out
				.println("Müþteri veritabanýna kaydedildi: " + customer.getFirstName() + " " + customer.getLastName());
	}
}