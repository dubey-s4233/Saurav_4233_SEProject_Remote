import java.util.*;
import java.io.*;

///////////////////////////////////////////////Customer Class///////////////////////////////
public class Customer {

	private String Name, CustomerID, email, phone;
	
	public Customer() {
	
		Name = "";
		CustomerID = "";
		email = "";
		phone = "";
		
	}
	
	public void setCustomer(String N, String cd, String e, String p){
		
		Name = N;
		CustomerID = cd;
		email = e;
		phone = p;
		
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getCustomerID() {
		return CustomerID;
	}

	public void setCustomerID(String customerID) {
		CustomerID = customerID;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}

