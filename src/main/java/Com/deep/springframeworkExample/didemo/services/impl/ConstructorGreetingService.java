package Com.deep.springframeworkExample.didemo.services.impl;

import Com.deep.springframeworkExample.didemo.services.GreetingService;
import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Test Constructor Greeting Service";
    }
}
