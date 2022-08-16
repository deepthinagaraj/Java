import java.util.concurrent.atomic.AtomicInteger;
 
public class design {
    private static final AtomicInteger count = new AtomicInteger(0);
    private int designId;
    private String designName;
    private String category;
    private double price;
    private double discount;
    private int stock;
   
    public design(String designName, String category, double price, double discount, int stock) {
        this.designId = count.incrementAndGet();
        this.designName = designName;
        this.category = category;
        this.price = price;
        this.discount = discount;
        this.stock = stock;
    }
   
    //getters and setters
    public int getdesignId() {
        return designId;
    }
 
    public void setdesignId(int designId) {
        this.designId = designId;
    }
 
    public String getdesignName() {
        return designName;
    }
 
    public void setdesignName(String designName) {
        this.designName = designName;
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
 

