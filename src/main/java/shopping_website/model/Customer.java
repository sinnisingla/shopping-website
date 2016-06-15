package shopping_website.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
//@XmlRootElement
public class Customer {
	@Id
	private int id;
	private String name;
	private String contact;
	private String address;
	private String city; 
	private String email;
	
	public Customer() {
		
	}
	public Customer(String name, String contact, String address, String city, String email) {
		super();
		this.name = name;
		this.contact = contact;
		this.address = address;
		this.city = city;
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", contact=" + contact + ", address=" + address + ", city=" + city
				+ ", email=" + email + "]";
	}
	
}
