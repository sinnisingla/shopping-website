package shopping_website.dao;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import shopping_website.init.HibernateUtil;
import shopping_website.model.Customer;
@Repository
public class CustomerDao implements ApplicationContextAware,BeanNameAware{
	
	ApplicationContext context=null; 
	
	public List<Customer> getCustomerList() {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
	
		Query query = session.createQuery("from Customer");
		List<Customer> list = (List<Customer>) (query).list();

//		Iterator iterator = list.iterator();
//		for (Customer customer : list) {
//			System.out.println(customer.getAddress());
//		}
		session.getTransaction().commit();
		session.close();
		System.out.println(list);
		return list;

	}
	
	public void setBeanName(String arg0) {
		System.out.println("Class="+arg0);
	}

	public void setApplicationContext(ApplicationContext context) throws BeansException {
		this.context=context;
	}

}
