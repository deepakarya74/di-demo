package Com.deep.springframeworkExample.didemo.controllers;

import Com.deep.springframeworkExample.didemo.services.impl.GreetingServiceImpl;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PropertyInjectedControllerTest {

    PropertyInjectedController propertyInjectedController;

    @Before
    public void setUp() throws Exception{
       this.propertyInjectedController = new PropertyInjectedController();
       this.propertyInjectedController.greetingService = new GreetingServiceImpl();
    }

    @Test
    public void testGreeting(){

        assertEquals(GreetingServiceImpl.HELLO_GURU,propertyInjectedController.sayHello() );

    }

}
