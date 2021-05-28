package homework4_2.Adapter;


import java.rmi.RemoteException;

import  homework4_2.Abstract.CustomerCheckService;
import  homework4_2.Entities.Customer;
import  tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;


public class MernisServiceAdapter implements CustomerCheckService{
	

	@Override
	public boolean CheckIfRealPerson(Customer customer) {

		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		
		
		
		try {
			return client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()),customer.getFirstName().toUpperCase(),customer.getLastName().toUpperCase(),customer.getDateOfBirth().getYear());
		} catch (NumberFormatException e) {
			
			e.printStackTrace();
		} catch (RemoteException e) {
		
			e.printStackTrace();
		}
		return false;
	
	}
	

}