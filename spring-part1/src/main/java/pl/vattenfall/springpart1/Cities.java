package pl.vattenfall.springpart1;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Primary
@Component("fromMemory")
public class Cities implements CitiesRepository {
    private int counter = 0;
    public List<String> getCities(){
        counter++;
        return Stream.of("Katowice", "Kraków", "Łódź").collect(Collectors.toList());
    }

    public int getCounter() {
        return counter;
    }
}
