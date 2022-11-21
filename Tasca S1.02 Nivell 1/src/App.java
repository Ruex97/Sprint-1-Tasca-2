import java.util.ArrayList;
import java.util.Scanner;

public class App {
public static void main(String[] args) {
		
		// First we try to call the method with our ArrayList empty.
		ArrayList<Producte> inventory= null; 
		Selling mySelling = new Selling(inventory);
		
		inventoryWorth(mySelling);
		
		// I create and update the ArrayList in the object mySelling.
		inventory = new ArrayList<Producte>();
		mySelling.setProductes(inventory);
		
		// I create new products for the Array.
		newProduct("Pera", 2.50, inventory);
		newProduct("Manzana", 1.50, inventory);
		newProduct("Piña", 4.50, inventory);
		newProduct("Platano", 3, inventory);
		
		// And calculate the value
		inventoryWorth(mySelling);
		
		// I generate and catch an ArrayIndexOutOfBoundsException 
		try {
			inventory.get(5);
		} catch(IndexOutOfBoundsException e) {
			System.out.println("You have to search between index 0 and " + inventory.size());
		}
		
		
	}
	
	static void newProduct(String name, double price, ArrayList<Producte> inventory) {
		Producte myProduct = new Producte(name, price);
		inventory.add(myProduct);
	}
	
	static int typeInt(String str) {
		    Scanner input = new Scanner(System.in);
			System.out.println(str);
			int valor = input.nextInt();
			return valor;
	}	
	
	static void inventoryWorth(Selling mySelling) {
		try {
			double inventoryValue = mySelling.calculateTotal();
			System.out.println("Total value of our inventory is: " + inventoryValue);
		}
		catch(EmptySellException customex) {
			System.out.println(customex.getMessage());
		}
		
	}

}
