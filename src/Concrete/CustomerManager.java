package Concrete;

import Abstract.ICustomerCheckService;
import Entity.Customer;

public class CustomerManager implements ICustomerCheckService{

	@Override
	public boolean check(Customer customer) {
		// TODO Auto-generated method stub
		return true;
	}

}
