import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Cart {
	private static final AtomicInteger count = new AtomicInteger(0); 
	private int cartId;
	private ArrayList<designs> designs;
	private int customerId;
	private double totalBill;
	
	public Cart(int customerId) {
		this.setCartId(count.incrementAndGet());
		this.designs = new ArrayList<>();
		this.customerId = customerId;
		this.totalBill = 0.0;
	}

	public boolean addProduct(designs p) {
		this.designs.add(p);
		this.totalBill += p.getPrice();
		return true;
	}
	
	public boolean removedesign(designs p) {
		for (Product designProduct: this.products) {
			if(product.getProductId() == p.getProductId()) {
				this.products.remove(designs);
			}
		}
		return true;
	}

	//getters and setters
	public ArrayList<designs> getdesigns() {
		return designs;
	}

	public void setProducts(ArrayList<Product> products) {
		this.designs = designs;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public double getTotalBill() {
		return totalBill;
	}

	public void setTotalBill(double totalBill) {
		this.totalBill = totalBill;
	}

	public int getCartId() {
		return cartId;
	}

	public void setCartId(int cartId) {
		this.cartId = cartId;
	}	
}
