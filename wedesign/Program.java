import java.util.*; 
import java.lang.*; 
public class Program {
	public static void main(String[] args) {
		Admin admin = new Admin(0, "Nagaraj", "Nagaraj@gmail.com", "7384843384", "BTM Layout");
		Employe employe = admin.addEmployee("Deepthi Nagaraj", "7384843384", "7384843384", "KR Puram");
		
		Customer customer1 = new Customer("SANJAY", "7384843384", "SANJAY@gmail.coms");
		Cart cart1 = new Cart(customer1.getCustomerId());
		customer1.setCart(cart1);
		employe.assignEmployee(customer1);
		
		Product product1 = new Product("furniture", "Office", 1000, 10, 50);
		customer1.addProductCart(product1);
		customer1.checkOutCart();
		customer1.makePayment();
		Scanner sc= new Scanner(System.in);    //System.in is a standard input stream
        System.out.print("ADMIN INFO- " +admin );
		System.out.print("EMPLOYE INFO- " +employe);
		System.out.print("ADMIN INFO- " +customer1);
		System.out.print("ADMIN INFO- " +cart1);


	}
}
