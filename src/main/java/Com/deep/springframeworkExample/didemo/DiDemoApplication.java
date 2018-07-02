package Com.deep.springframeworkExample.didemo;

import Com.deep.springframeworkExample.didemo.controllers.ConstructorInjectedController;
import Com.deep.springframeworkExample.didemo.controllers.MyController;
import Com.deep.springframeworkExample.didemo.controllers.PropertyInjectedController;
import Com.deep.springframeworkExample.didemo.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {
	ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);
	MyController myController=(MyController) 	ctx.getBean(MyController.class);
	myController.sayHello();
	System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
	System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());
	System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
	}
}
