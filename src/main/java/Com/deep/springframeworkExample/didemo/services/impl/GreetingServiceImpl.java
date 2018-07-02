package Com.deep.springframeworkExample.didemo.services.impl;

import Com.deep.springframeworkExample.didemo.services.GreetingService;
import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {


    public static final String HELLO_GURU = "Hello Guru!!!!";

    @Override
    public String sayGreeting() {
        return HELLO_GURU;
    }
}
