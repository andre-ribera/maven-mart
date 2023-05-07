package MavenMarketApp.Customer;

import MavenMarketApp.Item.Item;
import MavenMarketApp.ShoppingCart;

import java.util.LinkedList;
import java.util.Queue;

public class Customer {
    private boolean askForAssistance;
    private boolean shop;
    private ShoppingCart shoppingCart;
    private double money;
    private String name;

    public Customer(){
        this.askForAssistance = false;
        this.shop = true;
        this.shoppingCart = new ShoppingCart();
        this.money = money;
        this.name = "Jane Doe";
    }

    public boolean isAskForAssistance() {
        return askForAssistance;
    }

    public boolean isShop() {
        return shop;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Customer(String name){
        this();
        this.name = name;
    }

    public Queue<Item> loadItemsOntoBelt(ShoppingCart shoppingCart){
        return new LinkedList<>(shoppingCart.getContents());
    }

    public boolean isAskingForAssistance() {
        return askForAssistance;
    }

    public void setAskForAssistance(boolean askForAssistance) {
        this.askForAssistance = askForAssistance;
    }

    public boolean isShopping() {
        return shop;
    }

    public void setShop(boolean shop) {
        this.shop = shop;
    }

    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
