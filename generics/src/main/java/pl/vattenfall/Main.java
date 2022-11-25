package pl.vattenfall;

import pl.vattenfall.generics.IntLocation;
import pl.vattenfall.generics.Location;

public class Main {
    public static void main(String[] args) {

//        Location<Object , Object> objLocation = Location.builder()
//                .x(10)
//                .y(5)
//                .build();           //jak nie robić klas generycznych
//        objLocation.setX("Abc");    //można wstawić wszystko

        Location<Integer, Integer> intLocation = new Location<>(10, 5);
        intLocation.setX(5);        //nie można podać innego typu
        Location<Double, Double> doubleLocation = new Location<>(2.5, 3.6);
        IntLocation location = new IntLocation();
        location.setX(10);
        location.setY(5);
        System.out.println(location.distance(doubleLocation));
    }
}