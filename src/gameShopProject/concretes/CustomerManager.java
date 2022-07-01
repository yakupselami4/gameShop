package gameShopProject.concretes;

import gameShopProject.abstracts.CustomerCheckService;
import gameShopProject.abstracts.CustomerService;
import gameShopProject.entities.Customer;

public class CustomerManager implements CustomerService{
	
	private CustomerCheckService customerCheckService;
	
	public CustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService=customerCheckService;
	}
	
	@Override
	public void save(Customer customer) throws Exception {
		if(customerCheckService.checkIfRealPerson(customer)) {
			System.out.println("Kayıt işleminiz başarıyla tamamlandı: "+customer.getFirstName()+" "+customer.getLastName());
		}else {
			System.out.println("Gerçek bir kişi girin!");
		}
		
	}

}
