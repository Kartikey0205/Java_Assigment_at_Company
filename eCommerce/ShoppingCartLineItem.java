package eCommerce;

import java.util.*;
public class ShoppingCartLineItem {
    public String name;
    public double price;
    public double taxAmmount;
    static List<ShoppingCartLineItem> itemsList = new ArrayList<ShoppingCartLineItem>();
    public static Scanner input = new Scanner(System.in);
    
    ShoppingCartLineItem() {

    }
    ShoppingCartLineItem(String name, double price, double taxAmmount) {
        this.name = name;
        this.price = price;
        this.taxAmmount = taxAmmount;
    }

    public int cartProductsList() {
        int iterator = 1;
        for (ShoppingCartLineItem shoppingCartItems : itemsList) {
            System.out.println((iterator++)+" - "+shoppingCartItems.name);
        }
        iterator=0;
        iterator = input.nextInt();
        return iterator;
    }
}
