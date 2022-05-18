package Greeter;

public class Greeter {
	String greeting;
	
	String name;
	
	public Greeter(String greeting) {
		this.greeting = greeting;
	}

	public  String getGreeting() {
		return this.greeting;
	}
	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}
	public String greet(String name) {
		return this.greeting + ", " + name;
	} 
	
}

