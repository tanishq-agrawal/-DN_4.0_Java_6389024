import java.util.*;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product(1, "Laptop", "Electronics"),
            new Product(2, "Phone", "Electronics"),
            new Product(3, "Shoes", "Footwear"),
            new Product(4, "Watch", "Accessories"),
            new Product(5, "Jeans", "Clothing")
        };

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter product name to search: ");
        String name = scan.nextLine();
        scan.close();

        Product found1 = Search.linearSearch(products, name);
        if (found1 != null) System.out.println("Linear Search: " + found1);
        else System.out.println("Linear Search: Not Found");

        Arrays.sort(products, Comparator.comparing(p -> p.productName.toLowerCase()));

        Product found2 = Search.binarySearch(products, name);
        if (found2 != null) System.out.println("Binary Search: " + found2);
        else System.out.println("Binary Search: Not Found");
    }
}
