package interfaceAbstractDemo.Concrete;

import interfaceAbstractDemo.Abstract.CustomerCheckService;
import interfaceAbstractDemo.Entities.Customer;

public class CustomerCheckManager implements CustomerCheckService {
	public boolean checkIfRealPerson(Customer customer) {
		return true;
	}
}