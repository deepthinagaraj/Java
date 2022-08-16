
 
public class Program {
    public static void main(String[] args) {
        Admin admin = new Admin(011, "Deepthi", "Deepthigmail.com", "8867131967", "BTM Layout");
        Architect Architect1 = admin.addArchitect("Deepthinagaraj", "Deepthigmail.com", "8867131967", "BTM Layout");
       
        Customer customer1 = new Customer("Deepthi", "7384843384", "Deepthi2@gmail.coms");
        Cart cart1 = new Cart(customer1.getCustomerId());
        customer1.setCart(cart1);
        Architect.assignArchitect(customer1);
       
        Designs designs1 = new design("blueprint", "office", 1000, 100, 5);
        customer1.adddesignCart(designs1);
        customer1.checkOutCart();
        customer1.makePayment();
    }
}

