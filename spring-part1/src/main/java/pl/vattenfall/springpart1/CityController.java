package pl.vattenfall.springpart1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/cities")
public class CityController {

    @Autowired
    private Cities cities;


    @GetMapping("/list")
    @ResponseBody
    public String cities(){
        return cities.getCities().toString() + " Stan licznika " + cities.getCounter();
    }

    @Autowired
    public void setCities(Cities cities){
        this.cities = cities;
    }
}
