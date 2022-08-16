import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Cart {
	private static final AtomicInteger count = new AtomicInteger(0); 
	private int cartId;
	private ArrayList<Product> products;
	private int customerId;
	private double totalBill;
	
	public Cart(int customerId) {
		this.setCartId(count.incrementAndGet());
		this.products = new ArrayList<>();
		this.customerId = customerId;
		this.totalBill = 0.0;
	}

	public boolean addProduct(Product p) {
		this.products.add(p);
		this.totalBill += p.getPrice();
		return true;
	}
	
	public boolean removeProduct(Product p) {
		for (Product product: this.products) {
			if(product.getProductId() == p.getProductId()) {
				this.products.remove(product);
			}
		}
		return true;
	}

	//getters and setters
	public ArrayList<Product> getProducts() {
		return products;
	}

	public void setProducts(ArrayList<Product> products) {
		this.products = products;
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
