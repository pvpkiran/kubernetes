package in.phani.springboot.kubernetes.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${base.country:India}")
    String baseCountry;

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello from : " + baseCountry;
    }

    @GetMapping("/isAlive")
    public String isAlive() {
        return "Yes of course.";
    }
}
