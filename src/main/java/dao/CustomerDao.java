package dao;

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

import init.HibernateUtil;
import model.Customer;


public class CustomerDao {
	
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
		return list;

	}

}
