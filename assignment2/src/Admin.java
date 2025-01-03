import java.util.List;

public class Admin extends User {
    private List<Product> products;

    public Admin(int userId, String name, String email) {
        super(userId, name, email);
    }

    @Override
    public void displayDetails() {
        System.out.println("Admin ID: " + getUserId() + ", Name: " + getName() + ", Email: " + getEmail());
    }

    public void addProduct(Product product) {
        products.add(product);
        System.out.println("Product added: " + product.getName());
    }

    public void removeProduct(String productId) {
        products.removeIf(product -> product.getProductId().equals(productId));
        System.out.println("Product removed: " + productId);
    }

    public void updateStock(String productId, int newStock) {
        for (Product product : products) {
            if (product.getProductId().equals(productId)) {
                product.setStock(newStock);
                System.out.println("Product stock updated: " + productId);
            }
        }
    }
}
