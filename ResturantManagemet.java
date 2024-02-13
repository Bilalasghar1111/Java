import java.util.ArrayList;
import java.util.Scanner;

class MenuItem {
    private String name;
    private double price;

    public MenuItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class OrderItem {
    private MenuItem menuItem;
    private int quantity;

    public OrderItem(MenuItem menuItem, int quantity) {
        this.menuItem = menuItem;
        this.quantity = quantity;
    }

    public MenuItem getMenuItem() {
        return menuItem;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getTotalPrice() {
        return menuItem.getPrice() * quantity;
    }
}

public class RestaurantManagementSystem {
    private ArrayList<MenuItem> menu;
    private ArrayList<OrderItem> orders;

    public RestaurantManagementSystem() {
        menu = new ArrayList<>();
        orders = new ArrayList<>();
    }

    public void addMenuItem(MenuItem menuItem) {
        menu.add(menuItem);
    }

    public void placeOrder(OrderItem orderItem) {
        orders.add(orderItem);
    }

    public double calculateTotalBill() {
        double total = 0;
        for (OrderItem orderItem : orders) {
            total += orderItem.getTotalPrice();
        }
        return total;
    }

    public static void main(String[] args) {
        RestaurantManagementSystem rms = new RestaurantManagementSystem();
        Scanner scanner = new Scanner(System.in);

        // Adding menu items
        rms.addMenuItem(new MenuItem("Burger", 5.99));
        rms.addMenuItem(new MenuItem("Pizza", 8.99));
        rms.addMenuItem(new MenuItem("Salad", 4.99));
        rms.addMenuItem(new MenuItem("Fries", 2.99));

        // Placing orders
        System.out.println("Menu:");
        for (int i = 0; i < rms.menu.size(); i++) {
            MenuItem menuItem = rms.menu.get(i);
            System.out.println((i + 1) + ". " + menuItem.getName() + " - $" + menuItem.getPrice());
        }
        System.out.println("Enter the number of items to order:");
        int numItems = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        for (int i = 0; i < numItems; i++) {
            System.out.println("Enter item number " + (i + 1) + " and quantity (separated by space):");
            int itemNumber = scanner.nextInt();
            int quantity = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            MenuItem menuItem = rms.menu.get(itemNumber - 1);
            rms.placeOrder(new OrderItem(menuItem, quantity));
        }

        // Displaying total bill
        System.out.println("Total Bill: $" + rms.calculateTotalBill());
    }
}
