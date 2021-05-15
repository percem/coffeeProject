import Abstract.BaseCustomerManager;
import Concrete.NeroManager;
import Concrete.StarbucksManager;


public class MainCoffee {

	public static void main(String[] args) {
		BaseCustomerManager customerManager=new NeroManager();
		customerManager.Save(new Customer(1,"ümmühan","perçem","1234567890","1997"));
		System.out.println();
	}

}
