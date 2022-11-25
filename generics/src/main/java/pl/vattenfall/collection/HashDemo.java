package pl.vattenfall.collection;

import java.util.HashSet;
import java.util.Set;

public class HashDemo {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add(new String("Ewa"));
        set.add("Adam");
        set.add(new String("Ewa"));
        System.out.println(set);
        Set<User> users = new HashSet<>();
        User a = new User();
        a.name = "Adam";
        a.points = 100;
        users.add(a);
        User b = new User();
        b.name = "Adam";
        b.points = 100;
        users.add(b);
        System.out.println(users.size());
        Set<Person> personSet = new HashSet<>();
        personSet.add(Person.builder()
                .name("Adam")
                .points(10)
                .build());
        personSet.add(Person.builder()
                .name("Ewa")
                .points(7)
                .build());
        personSet.add(Person.builder()
                .name("Adam")
                .points(10)
                .build());
        System.out.println(personSet);
    }
}
