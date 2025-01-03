import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("P1", "Laptop", 1000.00, 10);
        Product product2 = new Product("P2", "Smartphone", 500.00, 20);
        Product product3 = new Product("P3", "Headphones", 150.00, 30);

        Admin admin1 = new Admin(1, "Alice", "alice@admin.com");
        Admin admin2 = new Admin(2, "Bob", "bob@admin.com");

        Customer customer1 = new Customer(1, "John", "john@customer.com", "123 Street");
        Customer customer2 = new Customer(2, "Jane", "jane@customer.com", "456 Avenue");

        admin1.addProduct(product1);
        admin1.addProduct(product2);
        admin2.addProduct(product3);

        admin1.updateStock("P1", 15);
        admin2.removeProduct("P2");

        customer1.placeOrder(product1, 5);
        customer2.placeOrder(product2, 10);

        customer1.displayDetails();
        customer2.displayDetails();
        product1.displayDetails();
        product2.displayDetails();
    }
}
