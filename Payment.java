import java.util.concurrent.atomic.AtomicInteger;

public class Payment {
	private static final AtomicInteger count = new AtomicInteger(0); 
	private int paymentId;
	private int customerId;
	private int cartId;
	private double amount;
	private String mode;
	
	public Payment(int customerId, int cartId, double amount, String mode) {
		this.paymentId = count.incrementAndGet();
		this.customerId = customerId;
		this.cartId = cartId;
		this.amount = amount;
		this.mode = mode;
	}

	public int getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getCartId() {
		return cartId;
	}

	public void setCartId(int cartId) {
		this.cartId = cartId;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}
	
	public String toString() {
		String output = "Payment Successful!";
		return output;
	}
}

