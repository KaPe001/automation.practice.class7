import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Cart {
    List<Product> cartProducts = new ArrayList<>();

    public List<Product> getCartProducts() {
        return cartProducts;
    }

    public void setCartProducts(List<Product> cartProducts) {
        this.cartProducts = cartProducts;
    }

    public void addProductToCart() {
        for (Product product : cartProducts) {
            cartProducts.add(product);
            //product increases in a cart, stock decreases in a product, HOW
        }
    }

    public void printCart() {
        double sum = 0.00d;
        for (Product product : cartProducts) {
            System.out.println(product.getName() + " " + product.getPrice());
            //print whole cart plus the sum of all products

        }
    }
}

