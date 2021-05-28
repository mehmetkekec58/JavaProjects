package homework4_2.Concrete;

import homework4_2.Abstract.CustomerCheckService;
import homework4_2.Entities.Customer;


public class CustomerCheckManager implements CustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
	
		//if(customer.getFirstName()=="Mehmet" && customer.getLastName()=="Kekeç" && customer.getNationalityId()=="123" && customer.getDateOfBirth().getYear()==2001)
		//return true;
	

	return true;

}}
