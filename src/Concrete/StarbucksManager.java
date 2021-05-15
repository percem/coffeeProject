package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Entity.Customer;

public class StarbucksManager extends BaseCustomerManager{
	private ICustomerCheckService _customerCheck;

	public StarbucksManager(ICustomerCheckService customerCheck) {
		_customerCheck=customerCheck;
	}
	
	public void Save(Customer customer) {
	if(_customerCheck.check(customer)) {
		super.Save(customer);
		System.out.println("Kay�t olu�turuldu! "+customer.FirstName);
	}else {
		System.out.println("Ba�ar�s�z giri�!");
	}
}
}
