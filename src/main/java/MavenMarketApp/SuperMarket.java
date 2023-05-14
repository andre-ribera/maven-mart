package MavenMarketApp;

import MavenMarketApp.Customer.Customer;
import MavenMarketApp.Customer.Karen;
import MavenMarketApp.Department.ProduceDepartment;
import MavenMarketApp.Employee.Bagger;
import MavenMarketApp.Employee.Cashier;
import MavenMarketApp.Employee.ProduceManager;
import MavenMarketApp.Employee.StoreManager;
import MavenMarketApp.Item.Groceries;
import MavenMarketApp.Item.Item;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.*;
import java.util.Queue;

public class SuperMarket {

    private static String getShoppingList() throws IOException {
        File file = new File("ShoppingList.txt");
        try (FileReader fr = new FileReader(file);
             BufferedReader br = new BufferedReader(fr)) {
            return br.readLine();
        }
    }


    public static void main(String[] args) {
        Customer marge = new Customer("Marge");
        Customer fredrickson = new Customer("Mr. Fredrickson");
        Karen karen = new Karen("Karen");
        Bagger bobby = new Bagger();
        Cashier sueAnne = new Cashier("SueAnne");
        ProduceManager miles = new ProduceManager();
        StoreManager kurt = new StoreManager();
        ShoppingCart karenCart = new ShoppingCart(true);
        Queue<Item> conveyorBelt;
        CustomLinkedList<Customer> checkoutLine = new CustomLinkedList<>();

        ProduceDepartment produceDepartment = new ProduceDepartment();
        
        try {
            File file = new File("ShoppingList.txt");
            String fileContent = FileUtils.readFileToString(file, "UTF-8");
            System.out.println("What is on the shopping list? " + fileContent);
        } catch (IOException ioe) {
            System.out.println("You lost the Shopping List!");
        }

        Groceries tomatoes = new Groceries("tomatoes", 100, 0.75D, 0.25D);
        Groceries potatoes = new Groceries("potatoes", 100, 0.5D, 0.10D);
        Groceries milk = new Groceries("milk", 100, 3D, 1.5D);
        Groceries butter = new Groceries("butter", 100, 5D, 2D);
        Groceries flour = new Groceries("flour", 100, 5D, 2D);
        Groceries cheese = new Groceries("cheese", 100, 8D, 5D);
        Groceries salad = new Groceries("salad", 100, 3D, 1D);
        Groceries celery = new Groceries("celery", 100, 3D, 0.5D);

        karenCart.addToCart(tomatoes);
        karenCart.addToCart(potatoes);
        karenCart.addToCart(milk);
        karenCart.addToCart(butter);
        karenCart.addToCart(flour);
        karenCart.addToCart(cheese);
        karenCart.addToCart(salad);
        karenCart.addToCart(celery);

        checkoutLine.add(fredrickson);
        checkoutLine.add(marge);
        checkoutLine.add(karen);

        conveyorBelt = karen.loadItemsOntoBelt(karenCart);

        System.out.println(sueAnne.getName() + ": Your total today is: " + sueAnne.checkout(conveyorBelt) + "\n");

        for (Item item : bobby.bagGroceries(conveyorBelt)) {
            if (item.isDented()) {
                karen.askForManager();
                System.out.println(karen.getName() + ": " + karen.getComplaint());
            }
        }

//        System.out.println(karenCart.getContents());

    }
}
