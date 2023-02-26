package eCommerce;
import java.util.*;

public class Shop {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int choice = 0;
        int product;
        ShoppingCart shoppingCart = new ShoppingCart();
        ShoppingCartLineItem cartItems = new ShoppingCartLineItem();
        do {
            System.out.println("\n1 - Adding Product\n 2 - Remove Product \n 3 - Calulate Price \n 4 - Calculate Tax \n");
            choice = input.nextInt();
            switch(choice) {
                case 1:
                System.out.println("Which Product do you choose to Add in your Cart ?");
                    product = ShoppingCart.productsList();
                    shoppingCart.addItem(product);
                    break;
                case 2:
                    System.out.println("Which Product do you choose  to Remove from your Cart  ?");
                    product = cartItems.cartProductsList();
                    shoppingCart.removeItem(product);
                    break;  
                case 3:
                    shoppingCart.calculatePrice();
                    break;  
                case 4:
                    shoppingCart.calculatePriceWithTax();
                    break;
                default:
                    System.out.println("Invalid Choice!!!");
                    break;
            }
        } while(choice <= 4);
    }
    
}
