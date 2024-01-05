package ex14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Product {
    int id;
    String name;
    int price;

    public Product(int id, String name, int price) {
        super();
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

public class StreamExample3 {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<Product>();

        list.add(new Product(1, "Notebook", 100));
        list.add(new Product(2, "TV", 320));
        list.add(new Product(3, "Washing Machine", 250));
        list.add(new Product(4, "Air Conditioner", 500));

        List<String> result = list.stream().filter(p -> p.price > 300).map(p -> p.name).collect(Collectors.toList());

        System.out.println(result);
    }
}
