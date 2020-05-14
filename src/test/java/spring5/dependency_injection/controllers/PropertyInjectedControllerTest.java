package spring5.dependency_injection.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import spring5.dependency_injection.services.GreetingService;

class PropertyInjectedControllerTest {

    @Autowired
    public GreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}