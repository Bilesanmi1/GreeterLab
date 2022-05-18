package Greeter;
import java.util.Scanner;

public class GreeterApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Greeter g1 = new Greeter("Hey");
		System.out.println(g1.greet("Jim Blow"));
		SimonGreeter g2 = new SimonGreeter("Hello");
		System.out.println(g2.greet("Tom Jerry"));
		LoudGreeter g3 = new LoudGreeter("Hey");
		System.out.println(g3.greet("Luka Migic"));
		g3.addVolume();
		g3.addVolume();
		System.out.println(g3.greet("Luka Magic"));
		HtmlGreeter g4 = new HtmlGreeter("Hello");
		System.out.println(g4.greet("Peter Parker"));
		
		
		

	}

}
