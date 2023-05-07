package MavenMarketApp.Item;

import MavenMarketApp.Department.Department;

import java.util.Objects;
import java.util.Random;

public abstract class Item {
    protected String type;
    protected Department department;
    protected int amountInStock;
    protected double price;
    protected double cost;
    protected boolean isDented;

    public Item(String type, int amountInStock, double price, double cost) {
        this.type = type;
        this.amountInStock = amountInStock;
        this.price = price;
        this.cost = cost;
        this.isDented = false;
    }

    public Item(String type, Department department, int amountInStock, double price, double cost) {
        this.type = type;
        this.department = department;
        this.amountInStock = amountInStock;
        this.price = price;
        this.cost = cost;
        this.isDented = false;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public int getAmountInStock() {
        return amountInStock;
    }

    public void setAmountInStock(int amountInStock) {
        this.amountInStock = amountInStock;
    }

    public boolean isDented() {
        Random random = new Random();
        byte num = (byte) random.nextInt(99);
        if (num == 6 || num == 66 || num == 9 || num == 99) {
            this.isDented = true;
            return true;
        }
        return false;
    }

    public void setDented(boolean dented) {
        isDented = dented;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return type.equals(item.type) && department.equals(item.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, department);
    }
}
