package pl.vattenfall.springpart1;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Component("fromFile")
public class CitiesFromFile implements CitiesRepository{

    @Override
    public List<String> getCities() {
        return Stream.of("Bytom", "Sosnowiec", "Dąbrowa Górnicza")
                .collect(Collectors.toList());
    }
}
