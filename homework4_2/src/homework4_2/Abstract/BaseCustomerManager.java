package homework4_2.Abstract;

import homework4_2.Entities.Customer;

public class BaseCustomerManager implements CustomerService {

	 @Override
	    public void save(Customer customer) {
	        System.out.println("Saved to db: "+customer.getFirstName()+" "+customer.getLastName());

	    }

}
