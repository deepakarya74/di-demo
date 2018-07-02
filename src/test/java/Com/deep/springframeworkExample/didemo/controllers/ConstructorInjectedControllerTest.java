package Com.deep.springframeworkExample.didemo.controllers;

import Com.deep.springframeworkExample.didemo.services.impl.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConstructorInjectedControllerTest {

    ConstructorInjectedController constructorInjectedController;

    @Before
    public void setUp(){

        this.constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting(){
        assertEquals(GreetingServiceImpl.HELLO_GURU,constructorInjectedController.sayHello());
    }


}

