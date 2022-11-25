package pl.vattenfall.springpart1;

import org.springframework.stereotype.Component;

import java.util.List;

public interface CitiesRepository {
    List<String> getCities();
}
