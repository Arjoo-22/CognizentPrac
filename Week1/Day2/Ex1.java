import java.util.*;

class Product {
    String name;

    Product(String name) {
        this.name = name;
    }
}

public class Ex1 {

    public static void main(String[] args) {

        ArrayList<Product> products = new ArrayList<>();

        products.add(new Product("Laptop"));
        products.add(new Product("Mobile"));
        products.add(new Product("Headphones"));
        products.add(new Product("Shoes"));
        products.add(new Product("Watch"));

        String searchItem = "Mobile";

        boolean found = false;

        for(Product p : products) {

            if(p.name.equalsIgnoreCase(searchItem)) {

                System.out.println("Product Found: " + p.name);

                found = true;
                break;
            }
        }

        if(!found) {
            System.out.println("Product not found");
        }
    }
}