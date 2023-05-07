package MavenMarketApp.Employee;

import MavenMarketApp.Item.Item;

import java.util.ArrayList;
import java.util.Queue;

public class Bagger extends Employee {
    private boolean collectCarts;

    public ArrayList<Item> bagGroceries(Queue<Item> groceries){
        ArrayList<Item> bags = new ArrayList<>(groceries.size());

        groceries.forEach(item -> item.isDented());
        bags.addAll(groceries);

        return bags;
    }

    public boolean isCollectCarts() {
        return collectCarts;
    }

    public void setCollectCarts(boolean collectCarts) {
        this.collectCarts = collectCarts;
    }
}
