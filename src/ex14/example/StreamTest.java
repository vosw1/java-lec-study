package ex14.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Product {
    private static int count = 0;
    private int id;
    private String name;
    private int price;

    public Product(String name, int price) {
        this.id = count++;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}

public class StreamTest {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        Product p1 = new Product("Notebook", 50000000);
        Product p2 = new Product("LG Gram Notebook", 7000000);
        Product p3 = new Product("Apple Macbook M3", 7000000);
        Product p4 = new Product("SAMSUNG Galluxy Botebook", 7000000);
        Product p5 = new Product("HP NoteBook Model 100", 5000000);

        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        list.add(p5);

        System.out.println("상품을 검색하세요.");
        System.out.print("상품의 이름(*은 모든 상품을 의미): ");
        Scanner sn = new Scanner(System.in);
        String sname = sn.nextLine();

        System.out.print("상품의 가격 상한: ");
        int sprice = sn.nextInt();

        System.out.println();

        for (Product product : list) {
            if (sprice == product.getPrice()) {
                System.out.println("검색한 상품은 " + product.getName() + " 입니다.");
            }
        }
    }
}
