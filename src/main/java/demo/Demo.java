package demo;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;  
import org.hibernate.SessionFactory;  
  
import model.Customer;  
import init.HibernateUtil;  
  
public class Demo{  
  
    public static void main(String[] args) {  
  
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();  
        Session session = sessionFactory.openSession();  
        session.beginTransaction();  
          
//        Customer customer = new Customer();  
//        customer.setName("Shanky");  
//        customer.setContact("852839671");  
//        customer.setAddress("Pai Layout");
//        customer.setCity("Bengaluru");
//        customer.setEmail("sinnisingla92@gmail.com");
//        session.save(customer);  
//        
        Query query = session.createQuery("from Customer");
        List<Customer> list = (List<Customer>) (query).list();
//        System.out.println(list);
        Iterator iterator=list.iterator();
        for(Customer customer  : list){
        	System.out.println(customer.getAddress());
        }
        session.getTransaction().commit();  
         System.out.println("hello");
        session.close();  
  
    }  
}  