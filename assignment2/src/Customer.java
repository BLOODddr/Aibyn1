import java.util.List;

public class Customer extends User {
    private List<Order> orders;
    private String shippingAddress;

    public Customer(int userId, String name, String email, String shippingAddress) {
        super(userId, name, email);
        this.shippingAddress = shippingAddress;
    }

    @Override
    public void displayDetails() {
        System.out.println("Customer ID: " + getUserId() + ", Name: " + getName() + ", Email: " + getEmail() + ", Shipping Address: " + shippingAddress);
    }

    public void placeOrder(Product product, int quantity) {
        if (product.getStock() >= quantity) {
            double totalPrice = product.getPrice() * quantity;
            Order order = new Order("O" + (orders.size() + 1), this, product, quantity, totalPrice, "Placed");
            orders.add(order);
            product.reduceStock(quantity);
            System.out.println("Order placed successfully for product " + product.getName());
        } else {
            System.out.println("Not enough stock to place the order.");
        }
    }

    public void cancelOrder(Order order) {
        if (order.getStatus().equals("Placed")) {
            order.cancelOrder();
            order.getProduct().increaseStock(order.getQuantity());
            System.out.println("Order cancelled successfully.");
        } else {
            System.out.println("Cannot cancel this order.");
        }
    }
}
