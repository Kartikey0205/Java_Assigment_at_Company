package eCommerce;

import java.util.ArrayList;

public class Book implements Item {
    public String name;
    public String description;
    public double price;
    public double taxAmmount;

    Book(String name, String description, double price, double taxAmmount) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.taxAmmount = taxAmmount;
    }




}
