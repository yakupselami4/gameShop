package gameShopProject.abstracts;

import gameShopProject.entities.Customer;

public interface CustomerCheckService {
	
	boolean checkIfRealPerson(Customer customer) throws Exception;
}
