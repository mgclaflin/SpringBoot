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
        obj.age = 25;
        System.out.println(obj.age);
        
        
        
        //SINGLETON VS PROTOTYPE
        //Singleton - spring by default will give you just one object

        //this is referring to the same/single object that was created above for the Person class
        Person obj1 = context.getBean(Person.class);
        obj1.code();
        System.out.println(obj1.age);
        
        //Prototype - allows for the creation of multiple objects/instances to be created of a class
        PrototypeObj objP = context.getBean(PrototypeObj.class);
        objP.age = 25;
        System.out.println(objP.age);
        
        PrototypeObj objP2 = context.getBean(PrototypeObj.class);
        System.out.println(objP2.age);
        
        
    }
}
