package gameShopProject.abstracts;

import gameShopProject.entities.Customer;

public abstract class BaseCustomerManager implements CustomerService{
	public void save (Customer customer) throws Exception{
		System.out.println("Saved base: "+customer.getFirstName());
	}

}
