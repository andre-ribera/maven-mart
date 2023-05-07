package MavenMarketApp;

import MavenMarketApp.Item.Item;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Stack;

public class ShoppingCart {
    private ArrayList<Item> contents;
    private boolean escape;
    private boolean hasWobblyWheel;
    private Stack<ShoppingCart> cartCorral = new Stack<>();

    public ShoppingCart(){
        this.contents = new ArrayList<>(15);
        this.escape = false;
        this.hasWobblyWheel = true;
    }

    public ShoppingCart(boolean hasWobblyWheel){
        this();
        this.hasWobblyWheel = hasWobblyWheel;
    }

    public ArrayList<Item> getContents() {
        return contents;
    }

    public void setContents(ArrayList<Item> contents) {
        this.contents = contents;
    }
    public boolean isEscaping() {
        return escape;
    }

    public void setEscape(boolean escape) {
        this.escape = escape;
    }

    public boolean hasWobblyWheel() {
        return hasWobblyWheel;
    }

    public void setHasWobblyWheel(boolean hasWobblyWheel) {
        this.hasWobblyWheel = hasWobblyWheel;
    }

    public void addToCart(Item item){
        this.contents.add(item);
    }

    public void putCartInCorral(){
        cartCorral.push(new ShoppingCart());
    }

    @Override
    public String toString() {
        return "ShoppingCart{" + "contents=" + contents + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShoppingCart that = (ShoppingCart) o;
        return escape == that.escape && hasWobblyWheel == that.hasWobblyWheel && Objects.equals(contents, that.contents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contents, escape, hasWobblyWheel);
    }

}
