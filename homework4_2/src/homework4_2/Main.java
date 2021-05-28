package homework4_2;

import java.time.LocalDate;

import homework4_2.Abstract.BaseCustomerManager;
import homework4_2.Adapter.MernisServiceAdapter;
import homework4_2.Concrete.StarbucksCustomerManager;
import homework4_2.Entities.Customer;


public class Main {

	public static void main(String[] args) {
		
	BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
	Customer customer = new Customer(1,"Mehmet","Kekeç",LocalDate.of(2001,1,1),"11111111111");
    customerManager.save(customer);

	}

}
