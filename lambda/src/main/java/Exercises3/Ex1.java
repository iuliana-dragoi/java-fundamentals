package src.main.java.Exercises3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

//1.Filter a list of products and return only those that are in stock and priced under 100 RON.
//Create a Product class with name, price, and inStock. Use a Predicate<Product> to filter the list accordingly.
public class Ex1 {

    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();
        list.add(new Product("Product1", 100, true));
        list.add(new Product("Product2", 200, true));
        list.add(new Product("Product3", 50, true));
        list.add(new Product("Product4", 78, false));
        list.add(new Product("Product5", 500, true));
        list.add(new Product("Product6", 99, true));

        Predicate<Product> isInStock = product -> product.inStock && product.price < 100;
        List<Product> filtered = list.stream().filter(isInStock).toList();
        filtered.forEach(System.out::println);
    }

    static class Product {

        String name;
        int price;
        boolean inStock;

        public Product(String name, int price, boolean inStock) {
            this.name = name;
            this.price = price;
            this.inStock = inStock;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public boolean isInStock() {
            return inStock;
        }

        public void setInStock(boolean inStock) {
            this.inStock = inStock;
        }

        @Override
        public String toString() {
            return "Product{" +
                    "name='" + name + '\'' +
                    ", price=" + price +
                    ", inStock=" + inStock +
                    '}';
        }
    }
}
