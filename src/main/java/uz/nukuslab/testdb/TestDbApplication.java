package uz.nukuslab.testdb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class TestDbApplication {

    @Autowired
    CarRepository carRepository;

    @GetMapping("/")
    public String home(){
        List<Car> all = carRepository.findAll();
        return all.toString();
    }

    public static void main(String[] args) {
        SpringApplication.run(TestDbApplication.class, args);
    }

}
