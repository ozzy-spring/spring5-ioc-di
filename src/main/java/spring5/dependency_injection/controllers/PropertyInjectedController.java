package spring5.dependency_injection.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import spring5.dependency_injection.services.GreetingService;

@Controller
public class PropertyInjectedController {

    @Autowired
    @Qualifier("propertyInjectedGreetingService")
    public GreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
