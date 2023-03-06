package eCommerce;


public interface Item {    
    String getName();
    String getDescription();
    Double getTax();
    Double getPrice();
    Boolean equalityCheck();
}
