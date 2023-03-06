package eCommerce;

import java.util.*;
import JavaAssignment.*;

public class Shop {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("\n\t\t.....Welcome to eCommerce Website....\n");
        ShoppingCart shopCart = new ShoppingCart();
        int choice = 0;
        do {
            System.out.println(
                    "\n 1- Show Shopping Cart Item \t 2 - Add Product \t 3 - Remove Product \t 4 - Calulate Price \t 5 - Calculate Tax\t 6- Generate Bill \t 7- Exit from E-commerece");
            choice = GetUserInput.getInt("\n\t Enter your choice");
            switch (choice) {
                case 1:
                    ShoppingCartLineItem.showCartItems();
                    break;
                case 2:
                    System.out.println("Which Product do you choose to Add in your Cart ?");
                    ShoppingCart.addItem();
                    break;
                case 3:
                    ShoppingCart.removeItem();
                    break;
                case 4:
                    ShoppingCart.calculatePrice();
                    break;
                case 5:
                    ShoppingCart.calculatePriceWithTax();
                    break;
                case 6:
                    ShoppingCartLineItem.generateBill();
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Choice!!!");
                    break;
            }
        } while (choice != 7);
    }

}
