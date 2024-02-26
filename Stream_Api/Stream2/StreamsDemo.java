import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

class Product {
    private String name;
    private double price;
    private int itemsInWarehouse;

    public Product(String name, double price, int itemsInWarehouse) {
        this.name = name;
        this.price = price;
        this.itemsInWarehouse = itemsInWarehouse;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getItemsInWarehouse() {
        return itemsInWarehouse;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product [name=" + name + ", price=" + price + ", itemsInWarehouse=" + itemsInWarehouse + "]";
    }
}

class Warehouse {
    private List<Product> products;

    public Warehouse(List<Product> products) {
        this.products = products;
    }

    public List<Product> getProducts() {
        return products;
    }
}

public class StreamsDemo {

    public static void main(String[] args) {
        System.out.println("========== Filter, Map, and Collect Demo ==========");
        
        List<Product> products = Arrays.asList(
            new Product("iPhone", 1099.99, 1345),
            new Product("Boots", 49.99, 15200),
            new Product("HP Laptop", 2599.99, 876),
            new Product("SSD", 239.99, 900),
            new Product("Sony PlayStation", 2009.99, 1001)
        );

        List<Product> modifiedProducts = products.stream()
            .filter(product -> product.getItemsInWarehouse() > 1000)
            .peek(product -> product.setPrice(product.getPrice() - (product.getPrice() * 0.1)))
            .collect(Collectors.toList());

        modifiedProducts.forEach(System.out::println);

        System.out.println("========== FlatMap Demo ==========");

        List<Warehouse> warehouses = Arrays.asList(
            new Warehouse(Arrays.asList(new Product("iPhone", 1099.99, 1345))),
            new Warehouse(Arrays.asList(new Product("Boots", 49.99, 15200), new Product("HP Laptop", 2599.99, 876))),
            new Warehouse(Arrays.asList(new Product("SSD", 239.99, 900), new Product("Sony PlayStation", 2009.99, 1001)))
        );

        Product[] productsArray = warehouses.stream()
            .flatMap(warehouse -> warehouse.getProducts().stream())
            .filter(product -> product.getItemsInWarehouse() > 1000)
            .peek(product -> product.setPrice(product.getPrice() - (product.getPrice() * 0.1)))
            .toArray(Product[]::new);

        Arrays.stream(productsArray).forEach(System.out::println);

        System.out.println("========== ToMap Demo ==========");

        Map<String, Product> productMap = products.stream()
            .collect(Collectors.toMap(Product::getName, Function.identity()));

        System.out.println(productMap);

        System.out.println("========== MapToInt and Sum Demo ==========");

        int totalItemsAmount = products.stream()
            .mapToInt(Product::getItemsInWarehouse)
            .sum();
        System.out.println("Items in warehouse: " + totalItemsAmount);
    }
}
