public class Order {
    private String orderId;
    private Customer customer;
    private Product product;
    private int quantity;
    private double totalPrice;
    private String status;

    public Order(String orderId, Customer customer, Product product, int quantity, double totalPrice, String status) {
        this.orderId = orderId;
        this.customer = customer;
        this.product = product;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
        this.status = status;
    }

    public void cancelOrder() {
        status = "Cancelled";
    }

    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderId + ", Product: " + product.getName() + ", Quantity: " + quantity + ", Total Price: " + totalPrice + ", Status: " + status);
    }

    public String getOrderId() {
        return orderId;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getStatus() {
        return status;
    }
}
