package Com.deep.springframeworkExample.didemo.services.impl;

import Com.deep.springframeworkExample.didemo.services.GreetingService;
import org.springframework.stereotype.Service;

@Service
public class SetterGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Test Setter Greeting Service";
    }
}
