import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class Employe {
	private static final AtomicInteger count = new AtomicInteger(0); 
	private int employeId;
	private String employeName;
	private String email;
	private String phone;
	private String address;
	private ArrayList<Customer> customers;
	
	public Employe(String employeName, String email, String phone, String address) {
		this.employeId =  count.incrementAndGet();;
		this.employeName = employeName;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.customers = new ArrayList<>();
	}
	
	public void assignEmployee(Customer customer) {
		this.customers.add(customer);
	}
	
	public int getEmployeId() {
		return employeId;
	}
	public void setEmployeId(int employeId) {
		this.employeId = employeId;
	}
	public String getEmployeName() {
		return employeName;
	}
	public void setEmployeName(String employeName) {
		this.employeName = employeName;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
