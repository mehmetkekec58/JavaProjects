package homework4_2.Concrete;

import homework4_2.Abstract.BaseCustomerManager;
import homework4_2.Abstract.CustomerCheckService;
import homework4_2.Entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager {
 private CustomerCheckService customerCheckService;
	
	
	
	public NeroCustomerManager(CustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}
	
	@Override
	public void save(Customer customer) {
		if(this.customerCheckService.CheckIfRealPerson(customer)) {
			super.save(customer);
		}else {
			System.out.println("Not a valid person");
		}
		
	
		
	}

	

	public CustomerCheckService getCustomerCheckService() {
		return customerCheckService;
	}

	public void setCustomerCheckService(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}


}
