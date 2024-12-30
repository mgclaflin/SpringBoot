package hft.matthew.SpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = SpringApplication.run(App.class, args);

        // Retrieve the Spring-managed bean
        Person obj = context.getBean(Person.class);

        // Call methods on the bean
        obj.code();
    }
}
