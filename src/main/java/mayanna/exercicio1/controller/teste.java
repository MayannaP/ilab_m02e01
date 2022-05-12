package mayanna.exercicio1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class teste {
	
	@GetMapping("/hello")
	public String sayHello() { 
		System.out.print("\n \n Aplicacao ta on, bb \n \n ");
		return "Hello World";
	}

}
