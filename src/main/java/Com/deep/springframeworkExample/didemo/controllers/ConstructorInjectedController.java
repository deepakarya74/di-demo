package Com.deep.springframeworkExample.didemo.controllers;

import Com.deep.springframeworkExample.didemo.services.GreetingService;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {

    private GreetingService greetingService;

    //Constructor Dependency Injection

    public ConstructorInjectedController(@Qualifier("constructorGreetingService")GreetingService greetingService){

        this.greetingService = greetingService;

    }

    public String sayHello(){
      return  greetingService.sayGreeting();
    }
}
