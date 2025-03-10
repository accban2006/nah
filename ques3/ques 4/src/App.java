import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class Item {
    private String id, name;
    private double price;
    public Item(String id, String name, double price) { this.id = id; this.name = name; this.price = price; }
    public String getId() { return id; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public void setId(String id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setPrice(double price) { this.price = price; }
}
class Order {
    private String id;
    private List<Item> items = new ArrayList<>();
    public Order(String id) { this.id = id; }
    public String getId() { return id; }
    public void setId(String id) { this.id = id;}
    public void addItem(Item item) { items.add(item); }
    public List<Item> getItems() { return items; }
    public double calculateAverageCost() {
        return items.isEmpty() ? 0.0 : items.stream().mapToDouble(Item::getPrice).average().orElse(0.0);
    }
}
class TestOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap Id theo trat tu: ");
        Order order = new Order(scanner.nextLine());
        System.out.print("Co bao nhieu item theo trat tu: ");
        int numItems = scanner.nextInt();
        scanner.nextLine(); 
        for (int i = 1; i <= numItems; i++) {
            System.out.print("Nhap ID item " + i + ": ");
            String itemId = scanner.nextLine();
            System.out.print("Ten item " + i + ": ");
            String itemName = scanner.nextLine();
            System.out.print("Gia item " + i + ": ");
            double itemPrice = 0;
             try{
                 itemPrice = scanner.nextDouble();
            }catch(Exception e){
                System.err.println("kp valid price. ");
            }
            scanner.nextLine();
            order.addItem(new Item(itemId, itemName, itemPrice));
        }

        System.out.println("You have a new order with ID: " + order.getId());
        System.out.println("In the order, you have " + numItems + " items.");
        System.out.printf("The average price in the order is: %.2f%n", order.calculateAverageCost());
        scanner.close();
    }
}