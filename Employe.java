import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
 
public class Architect {
    private static final AtomicInteger count = new AtomicInteger(0);
    private int ArchitectId;
    private String ArchitectName;
    private String email;
    private String phone;
    private String address;
    private ArrayList<Customer> customers;
   
    public Architect(String ArchitectName, String email, String phone, String address) {
        this.ArchitectId =  count.incrementAndGet();;
        this.ArchitectName = ArchitectName;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.customers = new ArrayList<>();
    }
   
    public void assignArchitecte(Customer customer) {
        this.customers.add(customer);
    }
   
    public int getArchitectId() {
        return ArchitectId;
    }
    public void setArchitectId(int ArchitectId) {
        this.ArchitectId = ArchitectId;
    }
    public String getArchitectName() {
        return ArchitectName;
    }
    public void setArchitectName(String ArchitectName) {
        this.ArchitectName = ArchitectName;
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
 

