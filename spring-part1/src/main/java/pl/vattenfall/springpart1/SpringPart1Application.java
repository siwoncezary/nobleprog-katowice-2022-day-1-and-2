package pl.vattenfall.springpart1;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class SpringPart1Application implements CommandLineRunner {
    private final Cities cities;

    private final CitiesRepository citiesRepository;

    public SpringPart1Application(Cities cities, Cities citiesRepository) {
        this.cities = cities;
        this.citiesRepository = citiesRepository;
    }

    public static void main(String[] args) {

       SpringApplication.run(SpringPart1Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(citiesRepository.getCities());
    }
}
