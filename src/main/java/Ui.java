import java.math.BigDecimal;
import java.util.Scanner;

public class Ui {

    public void addProductToCartByName() {
        Product product = new Product();
        Scanner sc = new Scanner(System.in);
        Cart cart = new Cart();

        for (int i = 1; i <= cart.capacity; i++) {
            System.out.println("Select " + i + " product to add to a cart");
            String userChoiceOfProduct = sc.next();
            System.out.println("Enter the price of a the product");
            BigDecimal productPrice = sc.nextBigDecimal();
            System.out.println("Enter the amount of products to add to a cart");
            int amountOfProducts = sc.nextInt();

            cart.addProductToCart(new Product(userChoiceOfProduct, productPrice), amountOfProducts);

            BigDecimal result = productPrice.multiply(BigDecimal.valueOf(amountOfProducts));
            System.out.println("Product: " + userChoiceOfProduct + ", product price: $" + productPrice + ", the amount of products: " + amountOfProducts +
                    "\nPrice together: $" + result);
        }
        cart.printCart();
    }
}
