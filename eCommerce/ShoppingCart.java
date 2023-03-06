package eCommerce;

import java.util.ArrayList;

import JavaAssignment.*;

public class ShoppingCart {

    static ArrayList<Item> productList = new ArrayList<>();

    ShoppingCart() {

        productList.add(new Book("ComicBook", "English", 20, 19));
        productList.add(new Book("PoemBook", "Hindi", 10, 100));
        productList.add(new Book("History", "English", 60, 80));
        productList.add(new AutoPartItem("carSeat", "Balck Car seat", 5000, 100));
        productList.add(new AutoPartItem("carWheel", "White wheel", 500, 50));
        productList.add(new AutoPartItem("carWheel", "White wheel", 800, 50));
        productList.add(new AutoPartItem("CarMirror", "rear mirror", 250, 10));

        System.out.println("\tItems available are...");
        showProducts();

    }

    public static void showProducts() {
        int iterator = 1;

        for (Item productListItem : productList) {
            System.out.println((iterator++) + " - " + productListItem.getName());
        }

    }

    public static int getProductsList() {
        showProducts();
        int iterator = GetUserInput.getInt("Enter product number which you want");
        if(iterator > productList.size()){
            return 0;
        }
        return iterator;
    }

    public static void addItem() {
        int productNumber = getProductsList();
        if(productNumber == 0){
            System.out.println("Invalid item choosed...");
            return;
        }
        Item selectedItem = productList.get(productNumber - 1);
        boolean present = selectedItem.equalityCheck();

        if (present) {
            return;
        } else {
            ShoppingCartLineItem.cartItemsList.add(new ShoppingCartLineItem(selectedItem.getName(),
                    selectedItem.getPrice(), selectedItem.getTax(), 1));

        }
        System.out.println("Item added suceesfully to the cart...");

    }

    public static void removeItem() {
        int productNumber = ShoppingCartLineItem.getRemoveItemNumber();
        if(productNumber == 0){
            return;
        }
        if (ShoppingCartLineItem.cartItemsList.get(productNumber - 1).count > 1) {
            ShoppingCartLineItem.cartItemsList.get(productNumber - 1).count--;
        } else {

            ShoppingCartLineItem.cartItemsList.remove(productNumber - 1);
        }
    }

    public static void calculatePrice() {
        double totalPrice = 0;
        for (int i = 0; i < ShoppingCartLineItem.cartItemsList.size(); i++) {
            totalPrice += (ShoppingCartLineItem.cartItemsList.get(i).price)
                    * (ShoppingCartLineItem.cartItemsList.get(i).count);
        }
        System.out.println("Total price for added Items = Rs. " + totalPrice);
    }

    public static void calculatePriceWithTax() {
        double totalTax = 0;
        for (int i = 0; i < ShoppingCartLineItem.cartItemsList.size(); i++) {
            totalTax += (ShoppingCartLineItem.cartItemsList.get(i).taxAmmount)
                    * (ShoppingCartLineItem.cartItemsList.get(i).count);
        }
        System.out.println("Total tax for added Items = Rs. " + totalTax);
    }
}
