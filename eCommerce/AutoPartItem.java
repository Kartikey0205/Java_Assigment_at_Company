package eCommerce;

public class AutoPartItem {
    String name;
    String description;
    double price = 0.0;
    double taxAmmount = 0.0;

    AutoPartItem(String name, String description, double price, double taxAmmount) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.taxAmmount = taxAmmount;
    }

}
