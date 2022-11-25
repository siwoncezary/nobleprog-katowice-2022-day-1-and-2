package pl.vattenfall.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        Stream<String> names = Stream.of("Adam", "Ewa", "Karol");
        List<String> list = new ArrayList<>();
        list.stream();
        final OptionalInt max = names.filter(name -> {
                    System.out.println("Filter A");
                    return name.startsWith("A");
                })
                .filter(name -> {
                    System.out.println("Filter B");
                    return name.endsWith("A");
                })
                .mapToInt(name -> name.length())
                .max();

        if (max.isPresent()){
            System.out.println(max.getAsInt());
        }
        max.ifPresent(m -> System.out.println(m));
        names = Stream.of("Adam", "Ewa", "Karol");
        final String maxName = names
                .reduce("", (accu, name) -> accu.length() < name.length() ? name : accu);
        System.out.println(maxName);
    }
}
