package MavenMarketApp.Department;

import MavenMarketApp.Item.Item;

import java.util.HashMap;
import java.util.Map;

public class Warehouse extends Department {
    private static Map<Item, Integer> warehouse;

    public Warehouse(){
        this.warehouse = new HashMap<>();
    }

    public void addItem(Item item, Integer amountInStock){
        warehouse.put(item, amountInStock);
    }

    public void removeItemFromStock(Item item, Integer amount){
        Integer amountCurrentlyInStock = warehouse.get(item);
        warehouse.replace(item, amountCurrentlyInStock - amount);
    }
}
