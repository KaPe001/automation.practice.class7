import java.math.BigDecimal;
import java.util.Scanner;

public class Ui {

    public void addProductToCartByName(String productName){
        Scanner sc = new Scanner(System.in);
        int userChoice = 1;

        do{
            System.out.println("Select a product");

            String userChoiceOfProduct = sc.next();
            userChoice++;

            System.out.println("Select a size");
            String userChoiceOfSize = sc.next();

            System.out.println("Enter the prize");
            BigDecimal userEntersPrice = sc.nextBigDecimal();

            System.out.println("Enter the amount of products, max 5");
            int amountOfProducts = sc.nextInt();

            Cart cart = new Cart();
            cart.addProductToCart();

        }while(userChoice == 5);

    }
}
