import Abstract.BaseCustomerManager;
import Concrete.NeroManager;
import Concrete.StarbucksManager;


public class MainCoffee {

	public static void main(String[] args) {
		BaseCustomerManager customerManager=new NeroManager();
		customerManager.Save(new Customer(1,"�mm�han","per�em","1234567890","1997"));
		System.out.println();
	}

}
