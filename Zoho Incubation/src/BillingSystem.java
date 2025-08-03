import java.util.*;

class Item{
    String name;
    int quantity;
    double price;

    Item(String name, int quantity, double price){
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    double getTotal(){
        return price * quantity;
    }

}

public class BillingSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Item> items = new ArrayList<>();
        double total;

        while(true){
            System.out.print("Enter product name : ");
            String name = sc.next();

            System.out.print("Enter price of " + name + " : ");
            double price = sc.nextDouble();

            System.out.print("Enter quantity : ");
            int quantity = sc.nextInt();

            items.add(new Item(name, quantity, price));

            System.out.print("Do you want to add more items (y / n) : ");
            char choice = sc.next().toLowerCase().charAt(0);
            System.out.println();

            if(choice != 'y') break;
        }

        double grandTotal = 0;

        System.out.printf("%20s%20s%20s%20s", "Description", "Quantity", "Price", "Total");
        System.out.println("\n----------------------------------------------------------------------------------------");

        for(Item item : items){
            total = item.getTotal();

            grandTotal += total;

            System.out.printf("%20s%20s%20s%20s", item.name, item.quantity, item.price, total);
            System.out.println();
        }


        double discount = 0;
        if(grandTotal > 500){
            discount = grandTotal * 5 / 100;

        }
        else{
            System.out.println("No discount.");
        }
        double priceAfterDiscount = grandTotal - discount;
        System.out.println("\n----------------------------------------------------------------------------------------");

        System.out.printf("Grand Total : " + grandTotal + "\n");
        System.out.printf("Price after discount : " + priceAfterDiscount);
        System.out.println();

        double tax = priceAfterDiscount * 12 / 100;
        double priceAfterTax = priceAfterDiscount + tax;
        System.out.printf("Price after tax : " + priceAfterTax);


        sc.close();

    }

}
