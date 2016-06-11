package demo;

import org.hibernate.Session;  
import org.hibernate.SessionFactory;  
  
import model.Customer;  
import init.HibernateUtil;  
  
public class Demo{  
  
    public static void main(String[] args) {  
  
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();  
        Session session = sessionFactory.openSession();  
        session.beginTransaction();  
          
        Customer customer = new Customer();  
        customer.setName("Sinni");  
        customer.setContact("9872666643");  
        customer.setAddress("Tagore Nagar");
        customer.setCity("Ahmedgarh");
        customer.setEmail("sinnisingla@gmail.com");
        
        session.save(customer);  
        session.getTransaction().commit();  
          
        session.close();  
  
    }  
}  