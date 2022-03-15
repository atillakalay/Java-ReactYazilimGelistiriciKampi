package interfaceAbstractDemo.Adapters;

import java.rmi.RemoteException;

import interfaceAbstractDemo.Abstract.CustomerCheckService;
import interfaceAbstractDemo.Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

	public boolean checkIfRealPerson(Customer customer) throws NumberFormatException, RemoteException {

		KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();

		boolean check = kpsPublicSoapProxy.TCKimlikNoDogrula(Long.parseLong(customer.getNationaltyId()),
				customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(),
				customer.getDateOfBirth());

		return check;
	}
}