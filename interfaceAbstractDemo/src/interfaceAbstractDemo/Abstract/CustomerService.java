package interfaceAbstractDemo.Abstract;

import interfaceAbstractDemo.Entities.Customer;

public interface CustomerService {
	void save(Customer customer) throws Exception;
}