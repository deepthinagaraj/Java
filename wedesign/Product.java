import java.util.concurrent.atomic.AtomicInteger;

public class Product {
	private static final AtomicInteger count = new AtomicInteger(0); 
	private int productId;
	private String productName;
	private String category;
	private double price;
	private double discount;
	private int stock;
	
	public Product(String productName, String category, double price, double discount, int stock) {
		this.productId = count.incrementAndGet();
		this.productName = productName;
		this.category = category;
		this.price = price;
		this.discount = discount;
		this.stock = stock;
	}
	
	//getters and setters
	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}		
}
