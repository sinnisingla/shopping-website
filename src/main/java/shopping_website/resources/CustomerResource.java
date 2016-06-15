package shopping_website.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.jboss.logging.Param;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import shopping_website.dao.CustomerDao;
import shopping_website.model.Customer;

@Component
@Path("/customer")
public class CustomerResource{
	
	@Autowired
	CustomerDao customer;
	ApplicationContext context =null;
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public List<Customer> getAllCustomers(){
		ApplicationContext context = 
		    	   new ClassPathXmlApplicationContext("Beans.xml");
		customer=(CustomerDao) context.getBean("customerDao");
		List<Customer> customer1= customer.getCustomerList(); 
//		System.out.println(customer1);
		return customer1;
	}

	
}
