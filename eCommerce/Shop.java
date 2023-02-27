package eCommerce;

import java.util.*;
import JavaAssignment.*;
public class Shop {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        ShoppingCart shopCart = new ShoppingCart();
        int choice = 0;
        int product;
        do {
            System.out.println(
                    "\n 1 - Adding Product\n 2 - Remove Product \n 3 - Calulate Price \n 4 - Calculate Tax \n 5- Show Shopping Cart Item \n 6- Exit from E-commerece");
            choice = GetUserInput.getInt("\n\t Enter your choice");
            switch (choice) {
                case 1:
                    System.out.println("Which Product do you choose to Add in your Cart ?");
                    product = shopCart.getProductsList();
                    shopCart.addItem(product);
                    break;
                case 2:
                    System.out.println("Which Product do you choose  to Remove from your Cart ?");
                    product = ShoppingCartLineItem.cartProductsList();
                    shopCart.removeItem(product);
                    break;
                case 3:
                    shopCart.calculatePrice();
                    break;
                case 4:
                    shopCart.calculatePriceWithTax();
                    break;
                case 5:
                    ShoppingCartLineItem.showCartItems();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Choice!!!");
                    break;
            }
        } while (choice != 6);
    }

}
