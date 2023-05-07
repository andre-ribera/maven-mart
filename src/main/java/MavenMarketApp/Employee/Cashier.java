package MavenMarketApp.Employee;

import MavenMarketApp.Item.Item;

import java.util.Queue;

public class Cashier extends Employee{
    Bagger bagger = new Bagger();

    public Cashier(){
        super();
    }

    public Cashier(String name){
        super(name);
    }

    public double checkout(Queue<Item> conveyorbelt){
        double sum = 0d;

        for(Item item : conveyorbelt){
            sum += item.getCost();
        }

        return sum;

    }
}
