package pl.vattenfall.generics;

import lombok.*;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Location<T extends Number, U extends Number> {
    private T x;
    private U y;

    public int distance(Location<?, ?> target){
        throw new NotImplementedException();
    }


}
