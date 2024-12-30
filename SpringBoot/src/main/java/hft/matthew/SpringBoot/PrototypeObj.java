package hft.matthew.SpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class PrototypeObj {
	
	int age;
	
	public PrototypeObj() {
		System.out.println("Prototype object created");
	}

}
