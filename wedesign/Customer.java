import java.util.concurrent.atomic.AtomicInteger;

public class Customer {
	private static final AtomicInteger count = new AtomicInteger(0); 
	private int customerId;
	private String customerName;
	private String phoneNumber;
	private String emailAddress;
	private Cart cart;
	
	public Customer(String customerName, String phoneNumber, String emailAddress) {
		this.customerId = count.incrementAndGet();
		this.customerName = customerName;
		this.phoneNumber = phoneNumber;
		this.emailAddress = emailAddress;
	}
	
	//important methods
	public boolean addProductCart(Product p) {
		return this.cart.addProduct(p);
	}
	
	public boolean removeProductCart(Product p) {
		return this.cart.removeProduct(p);
	}
	
	public boolean checkOutCart() {
		System.out.println("Total amount for the cart is: " + this.cart.getTotalBill());
		return true;
	}
	
	public void makePayment() {
		Payment payment = new Payment(this.customerId, this.cart.getCartId(), this.cart.getTotalBill(), "Online");
		System.out.println(payment);
	}

	//getters and setters
	public int getCustomerId() {
		return customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}
}
