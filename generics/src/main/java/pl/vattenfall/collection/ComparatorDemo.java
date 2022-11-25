package pl.vattenfall.collection;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Function;

class PersonCompartor implements Comparator<Person>{

    @Override
    public int compare(Person o1, Person o2) {
        return Integer.compare(o1.getPoints(), o2.getPoints());
    }
}
@FunctionalInterface
interface Operation{
    double apply(double a, double b);
}
public class ComparatorDemo {
    public static void main(String[] args) {
        List<Person> personSet = new ArrayList<>();
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
        personSet.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        personSet.sort(new PersonCompartor());
        System.out.println(personSet);
        personSet.sort((p1, p2) -> p1.getName().compareTo(p2.getName()));
        Operation add = (a, b) -> a + b;
        Function<Double, Double> power = a -> a * a;
        BiFunction<Double, Double, Double> mul = (a, b) -> a * b;
        List<BiFunction<Double, Double, Double>> operators = new ArrayList<>();
        operators.add(mul);
        BiFunction<Double, Double, Double> div = (a, b) -> a / b;
        operators.add(div);
        System.out.println(operators.get(0).apply(5.0,4.0));
    }

    public static Double div(Double a, Double b){
        return a / b;
    }

}
