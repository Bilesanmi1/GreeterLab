package Greeter;

public class LoudGreeter extends Greeter {

	public LoudGreeter(String greeting) {
		super(greeting);
		// TODO Auto-generated constructor stub
	}
	private String extra = "!";
	public void addVolume() {
		extra += extra;
		
	}
	@Override
	public String greet(String name) {
		return this.greeting + ", " + name + "!" + extra;
		
	} 
}
