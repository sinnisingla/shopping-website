package resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.jboss.logging.Param;

import dao.CustomerDao;
import model.Customer;

@Path("/customer")
public class CustomerResource {
	
	CustomerDao customer=new CustomerDao();
	@GET
	@Path("/{param}")
	@Produces({MediaType.APPLICATION_JSON})
	public List<Customer> getAllCustomers(){
		List<Customer> customer1= customer.getCustomerList(); 
		System.out.println(customer1);
		return customer1;
	}
	
}
