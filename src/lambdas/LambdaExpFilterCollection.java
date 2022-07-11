package lambdas;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author njad
 */
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class Product {

    int id;
    String name;
    float price;

    public Product(int id, String name, float price) {
        super();
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

public class LambdaExpFilterCollection {

    public static void main(String[] args) {
        List<Item> list = new ArrayList<>();
        list.add(new Item(1, "Samsung A5", 17000f));
        list.add(new Item(3, "Iphone 6S", 65000f));
        list.add(new Item(2, "Sony Xperia", 25000f));
        list.add(new Item(4, "Nokia Lumia", 15000f));
        list.add(new Item(5, "Redmi4 ", 26000f));
        list.add(new Item(6, "Lenevo Vibe", 19000f));

        // using lambda to filter data  
        Stream<Item> filtered_data = list.stream().filter(p -> p.price > 20000);

        // using lambda to iterate through collection  
        filtered_data.forEach(
                product -> System.out.println(product.name + ": " + product.price)
        );
    }
}
