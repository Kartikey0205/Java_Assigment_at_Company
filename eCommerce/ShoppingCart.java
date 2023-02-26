package eCommerce;

import java.util.*;

public class ShoppingCart {
    // String name;//
    // String description = "dhfb";//
    // double price = 0.0; //
    // double taxAmmount = 0.0;//
    public static Scanner input = new Scanner(System.in);
    // List<ShoppingCart> items = new ArrayList<ShoppingCart>(); //
    public static ArrayList<Book> bookItems = new ArrayList<Book>();
    public static ArrayList<AutoPartItem> autoPartItems = new ArrayList<AutoPartItem>();

    ShoppingCart() {
        bookItems.add(new Book("The Free Voice", "English Edition | written by Ravish Kumar", 257, 12));
        bookItems.add(new Book("Bolna Hi Hai", "Hindi Edition | written by Ravish Kumar", 194, 12));
        bookItems.add(new Book("Data Structures & Algorithms in JS", "English Edition | written by Federico Kereki",
                2999, 12));

        // autoPartItems.add(new AutoPartItem("Samsung M32 Back Cover", "Samsung M32
        // Back Cover made with transperent Silicone", 299, 18));
        // autoPartItems.add(new AutoPartItem("Bike Phone Mount", "Easy Installation |
        // Adjustable 360 degree Study & Safe", 249, 18));
        // autoPartItems.add(new AutoPartItem("36W Quick Charger for Car", "36W Quick
        // Charger for Car with 2 USB Ports and 1 type-C Port", 349, 18));
    }
    // ShoppingCart(String name, String description, double price, double
    // taxAmmount) {
    // this.name = name;
    // this.description = description;
    // this.price = price;
    // this.taxAmmount = taxAmmount;
    // }

    public static int productsList() {
        int iterator = 1;
        for (Book item : bookItems) {
            System.out.println((iterator++) + " - " + item.name);
        }
        iterator = 0;
        iterator = input.nextInt();
        return iterator;
    }

    public void addItem(int product) {
        ShoppingCartLineItem.itemsList.add(new ShoppingCartLineItem(bookItems.get(product - 1).name,
                bookItems.get(product - 1).price, bookItems.get(product - 1).taxAmmount));
    }

    public void removeItem(int product) {
        ShoppingCartLineItem.itemsList.remove(product - 1);
    }

    public void calculatePrice() {

    }

    public void calculatePriceWithTax() {

    }
}
