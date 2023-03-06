package eCommerce;

import java.util.*;

import FlipCoinProg.GetUserInput;

public class ShoppingCartLineItem {
    public String name;
    public double price;
    public double taxAmmount;
    public int count;

    static ArrayList<ShoppingCartLineItem> cartItemsList = new ArrayList<ShoppingCartLineItem>();

    ShoppingCartLineItem(String name, double price, double taxAmmount, int count) {
        this.name = name;
        this.price = price;
        this.taxAmmount = taxAmmount;
        this.count = count;

    }

    public static Boolean itemExist() {
        if (cartItemsList.isEmpty())
            return false;
        return true;
    }

    public static int getRemoveItemNumber() {
        if(!showCartItems()){
            return 0;
        }
        int iterator = GetUserInput.getInt("Enter the item number which you want to remove");
        if(iterator > cartItemsList.size()){
            System.out.println("Invalid item selected...");
            return 0;
        }
        return iterator;
    }

    public static boolean showCartItems() {

        if (!itemExist()) {
            System.out.println("Nothing added to cart yet...");
            return false;

        }
        System.out.println("\tItems in a cart ...\n");
        int iterator = 1;
        System.out.println("Item Number \tItem Name  \t\tQuantity   \tPrice per piece \t   Tax per piece");
        for (ShoppingCartLineItem shoppingCartItems : cartItemsList) {
            System.out.println((iterator++) + "\t\t" + shoppingCartItems.name + "\t\t" + shoppingCartItems.count
                    + " qty \t\t" + shoppingCartItems.price + "\t\t\t" + shoppingCartItems.taxAmmount);

        }
        System.out.println("\n");
        return true;

    }

    public static void generateBill() {
        double totalPrice = 0.0;
        for (ShoppingCartLineItem shoppingCartItems : cartItemsList) {
            totalPrice += ((shoppingCartItems.price * shoppingCartItems.count)
                    + (shoppingCartItems.taxAmmount * shoppingCartItems.count));

        }
        System.out.println("Rs. " + totalPrice);
    }

}
