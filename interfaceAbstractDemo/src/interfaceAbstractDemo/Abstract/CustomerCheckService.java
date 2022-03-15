package interfaceAbstractDemo.Abstract;

import java.rmi.RemoteException;

import interfaceAbstractDemo.Entities.Customer;

public interface CustomerCheckService {
	default boolean checkIfRealPerson(Customer customer) throws NumberFormatException, RemoteException {
		return true;
	}

}