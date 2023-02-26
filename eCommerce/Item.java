package eCommerce;

import java.util.ArrayList;

public interface Item {
    ArrayList<String> autoPartItemList = new ArrayList<> ();
    ArrayList<Book> bookItemList = new ArrayList<> ();
    abstract void addItem(int a);
    abstract void removeItem(int a);
    abstract void calculatePrice();
    abstract void calculatePriceWithTax();
}
