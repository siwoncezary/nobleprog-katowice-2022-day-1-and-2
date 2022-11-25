package pl.vattenfall;
import pl.vattenfall.generics.Box;
import pl.vattenfall.generics.Location;
import pl.vattenfall.generics.Pizza;

import java.util.ArrayList;
import java.util.List;

public class BoxDemo {
    public static void main(String[] args) {
        Pizza p1 = new Pizza();
        List<String> list = new ArrayList<>();
        list.add("ser");
        list.add("pepperoni");
        p1.setIngredients(list);
        Pizza p2 = new Pizza();
        Box<Pizza> b1 = new Box<>(p1);
        Box<Pizza> b2 = new Box<>(p2);
        Box.copyContent(b1, b2);
        System.out.println(b2);

    }
}
