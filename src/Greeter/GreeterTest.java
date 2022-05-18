package Greeter;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GreeterTest {

	@Test
	void testGreeterGreet() {
		Greeter g1 = new Greeter("Hey");
		assertEquals("Hey, Jim Blow", g1.greet("Jim Blow"));
	}
	@Test
	void testGreeterGetGreeting() {
		Greeter g1 = new Greeter("Hey");
		assertEquals("Hey", g1.getGreeting());
	}
	@Test
	void testSimonGreeter() {
		SimonGreeter g1 = new SimonGreeter("Hey");
		assertEquals("Simon Says, Hey, Peter Parker", g1.greet("Peter Parker"));
		
		
		
	}
	@Test
	void testSimonGreeterGreet() {
		SimonGreeter g1 = new SimonGreeter("Hey");
		assertEquals("Hey", g1.getGreeting());
		
		
		
	}
	
	@Test
	void testLoudGreeter() {
		LoudGreeter g1 = new LoudGreeter("Hello");
		assertEquals("Hello, Tom Myers!!", g1.greet("Tom Myers"));
		
		
		
		
	}
	
	

}
