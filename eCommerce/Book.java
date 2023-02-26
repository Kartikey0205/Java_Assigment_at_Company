package eCommerce;

import java.util.ArrayList;

public class Book{
    String name;
    String description;
    double price = 0.0; 
    double taxAmmount = 0.0;

    Book(String name, String description, double price, double taxAmmount) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.taxAmmount = taxAmmount;
    }
    

}
