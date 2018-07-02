package Com.deep.springframeworkExample.didemo.controllers;

import Com.deep.springframeworkExample.didemo.services.GreetingService;
import Com.deep.springframeworkExample.didemo.services.impl.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {
    @Autowired
    public GreetingServiceImpl greetingService;



    //property dependency injection
   public  String sayHello(){
        return greetingService.sayGreeting();
    }

}

