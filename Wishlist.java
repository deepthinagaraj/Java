import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class Wishlist {
	private static final AtomicInteger count = new AtomicInteger(0); 
	private int wishListId;
	private ArrayList<Product> products;
	private double totalBill;
	
	public Wishlist(int wishListId) {
		this.setWishListId(count.incrementAndGet());
		this.products = new ArrayList<>();
		this.wishListId = wishListId;
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

	public int getwishListId() {
		return this.wishListId;
	}

	public void setWishListId(int wishListId) {
		this.wishListId = wishListId;
	}

	public double getTotalBill() {
		return totalBill;
	}

	public void setTotalBill(double totalBill) {
		this.totalBill = totalBill;
	}
}
