package EcommercePlatform;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        Product[] products = {
                new Product(103, "Laptop", "Electronics"),
                new Product(101, "Shoes", "Fashion"),
                new Product(105, "Watch", "Accessories"),
                new Product(102, "Phone", "Electronics"),
                new Product(104, "Bag", "Fashion")
        };

        Product result1 = LinearSearch.search(products, 102);

        System.out.println("Linear Search Result:");
        if (result1 != null)
            result1.display();
        else
            System.out.println("Product Not Found");

        Arrays.sort(products, Comparator.comparingInt(p -> p.productId));

        Product result2 = BinarySearch.search(products, 102);

        System.out.println("\nBinary Search Result:");
        if (result2 != null)
            result2.display();
        else
            System.out.println("Product Not Found");
    }
}
