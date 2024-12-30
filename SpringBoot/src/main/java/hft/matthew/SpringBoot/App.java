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
        obj.setAge(25);
        System.out.println(obj.getAge());
        
        
        
        //SINGLETON VS PROTOTYPE
        //Spring Boot will auto create a singleton object upon running while it will wait for a prototype object to be explicitly called to create an object
        
        
        
        //Singleton - spring by default will give you just one object
        //this is referring to the same/single object that was created above for the Person class
        Person obj1 = context.getBean(Person.class);
        obj1.code();
        System.out.println(obj1.getAge());
        
        //Prototype - allows for the creation of multiple objects/instances to be created of a class
        PrototypeObj objP = context.getBean(PrototypeObj.class);
        objP.age = 25;
        System.out.println(objP.age);
        
        PrototypeObj objP2 = context.getBean(PrototypeObj.class);
        System.out.println(objP2.age);
        
        
        //setter injection
        //constructor injection
        //autowire
        //primary
        
        
        
        //SPRING BOOT JDBC
        //uses connection pooling to manage resources/connections with the database
        //reduces lines coded/chance of bugs
        //JDBC template/framework
        
        
        
      
        
    }
}
