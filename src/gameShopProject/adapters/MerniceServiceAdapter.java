package gameShopProject.adapters;

import gameShopProject.abstracts.CustomerCheckService;
import gameShopProject.entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MerniceServiceAdapter implements CustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) throws Exception {
		
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		
		boolean result= client.TCKimlikNoDogrula(
				Long.parseLong(customer.getNationalityId()),
				customer.getFirstName().toUpperCase(),
				customer.getLastName().toUpperCase(),
				customer.getDateOfBirth());
		
		if(result == true) {
			return true;
		}
		else {
			return false;
		}
	}

}
