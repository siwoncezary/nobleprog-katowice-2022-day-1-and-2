package pl.vattenfall.springpart1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {

    @Bean
    public Cities getCities(){
        return new Cities();
    }

}
