import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class Cart {
    private Map<Product, Integer> cartProducts = new HashMap<>();
    int capacity = 5;

//    public List<Product> getCartProducts() {
//        return cartProducts;
//    }

    public Cart(Map<Product, Integer> cartProducts1) {
        this.cartProducts = cartProducts1;
    }

    public Cart() {
    }

    public Map<Product, Integer> getCartProducts() {
        return cartProducts;
    }

    public void setCartProducts(Map<Product, Integer> cartProducts) {
        this.cartProducts = cartProducts;
    }

    public void addProductToCart(Product product, int quantity) {
        cartProducts.merge(product, quantity, Integer::sum);
    }

//    public void printCart() {
//        for (Product product : cartProducts) {
//            System.out.println(product.getName() + ", " + "$" + product.getPrice());
//        }
//        System.out.println("The sum of all products in a cart is: $" + (getSumOfAllProducts()));
//    }

    public void printCart() {
        System.out.println("\nYour cart contains:");
        for (Map.Entry<Product, Integer> productEntry : cartProducts.entrySet()) {
            System.out.println("* Product name: " + productEntry.getKey().getName() + "\nPrice for the single product is: " + "$"
                    + productEntry.getKey().getPrice() + " - Quantity: " + productEntry.getValue());
        }
        System.out.println("The sum of all products in a cart is: $" + (getSumOfAllProducts()));
    }

    public BigDecimal getSumOfAllProducts() {
        BigDecimal sum = new BigDecimal("0.00");

        for (Map.Entry<Product, Integer> productEntry : cartProducts.entrySet()) {
            BigDecimal productTotalPrice;
            productTotalPrice = productEntry.getKey().getPrice().multiply(BigDecimal.valueOf(productEntry.getValue()));
            sum = sum.add(productTotalPrice);
        }
        return sum;
    }
}

