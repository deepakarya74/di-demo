package Com.deep.springframeworkExample.didemo.controllers;

import Com.deep.springframeworkExample.didemo.services.GreetingService;
import Com.deep.springframeworkExample.didemo.services.impl.GreetingServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SetterInjectedControllerTest {

    SetterInjectedController setterInjectedController;

    @Before
    public void setup(){
       this.setterInjectedController =  new SetterInjectedController();
       this.setterInjectedController.setGreetingService(new GreetingServiceImpl());

    }

    @Test
    public void testGreeting(){
        assertEquals(GreetingServiceImpl.HELLO_GURU,setterInjectedController.sayHello());
    }


}
