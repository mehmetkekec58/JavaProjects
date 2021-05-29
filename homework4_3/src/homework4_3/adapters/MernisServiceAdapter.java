package homework4_3.adapters;

import java.rmi.RemoteException;

import homework4_3.abstracts.GamerCheckService;
import homework4_3.entities.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements GamerCheckService {

	@Override
	public boolean CheckIfRealPerson(Gamer gamer) {

		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		
		
		
		try {
			return client.TCKimlikNoDogrula(Long.parseLong(gamer.getNationalityId()),gamer.getFirstName().toUpperCase(),gamer.getLastName().toUpperCase(),gamer.getDate().getYear());
		} catch (NumberFormatException e) {
			
			e.printStackTrace();
		} catch (RemoteException e) {
		
			e.printStackTrace();
		}
		return false;
	
	}
	}


