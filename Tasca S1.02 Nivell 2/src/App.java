import java.util.*;

public class App {

	public static void main(String[] args) {
				
		byte age = Entrada.readByte("Enter your age");
		System.out.println("You're "+ age + " years old");
		
		int num = Entrada.readInt("Enter your favourite number");
		System.out.println("Your favourite number is "+ num);
		
		float x = Entrada.readFloat("Enter a float");
		System.out.println("Float you entered is: " + x);
		
		double y = Entrada.readDouble("Enter a double");
		System.out.println("Double you entered is: " + y);
	
		char letter = Entrada.readChar("Type your favourite letter");
		System.out.println("Your favourite character is "+ letter);
		
		String sentence = Entrada.readString("Type your favourite sentence");
		System.out.println("Your favourite character is "+ sentence);
		
		boolean binary = Entrada.readYesNo("Type S for true and N for false");
		System.out.println("Your have typed " + binary);
		
		
		
		
	
	
	}
		

}
