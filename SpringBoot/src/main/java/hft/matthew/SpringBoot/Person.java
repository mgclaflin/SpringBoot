package hft.matthew.SpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
	
	int age;
	
	public Person() {
		System.out.println("Person object created");
	}

	@Autowired
	Laptop lap;
	
	public void code() {
		lap.compile();
	}
}
