package Greeter;

public  class HtmlGreeter extends Greeter {
	String tagName = "h1";

	public HtmlGreeter(String greeting) {
		super(greeting);
	}
	@Override
	public String greet(String name) {
		return "<" + tagName + ">" + this.greeting + ", " + name + "</" + tagName + ">";
		
	} 
	
	
	

}
