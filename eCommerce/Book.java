package eCommerce;


public class Book implements Item{
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


    public String getName() {
        return this.name;
    }


    public String getDescription() {
        return this.description;

    }


    public Double getTax() {
        return this.taxAmmount;

    }


    public Double getPrice() {
        return this.price;

    }
    
    public Boolean equalityCheck(){
        
        String itemName = this.name;
        double itemPrice = this.price;
        for (ShoppingCartLineItem item : ShoppingCartLineItem.cartItemsList) {
            if (item.name.equals(itemName) && item.price == itemPrice) {
                item.count++;
                return true;
            }
        }
        return false;
    }

}
