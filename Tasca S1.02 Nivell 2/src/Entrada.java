
import java.util.InputMismatchException;
import java.util.Scanner;

public abstract class Entrada {
	private static Scanner readData = new Scanner(System.in);
	
	// Methods that catch InputMismatchException. read: Byte, int, double and float.
	
	public static byte readByte(String str) throws InputMismatchException {
		byte value = 0;
		do {
			try {
				System.out.println(str);
				value = readData.nextByte();
			} catch (InputMismatchException e) {
				System.out.println("Format Error");
			}
			readData.nextLine();
		} while (value == 0);
		return value;
	}
	
	
	public static int readInt(String str) throws InputMismatchException {
		int value = 0;
		do {
			try {
				System.out.println(str);
				value = readData.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Format Error");
			}
			readData.nextLine();
		} while (value == 0);
		return value;
	}
	
	
	public static float readFloat (String str) throws InputMismatchException {
		float value = 0f; // 0f is a float, 0.0 is considered a double.
		do {
			try {
				System.out.println(str);
				value = readData.nextFloat();
			} catch (InputMismatchException e) {
				System.out.println("Format Error");
			}
			readData.nextLine();
		} while (value == 0);
		return value;
	}
	
	public static double readDouble (String str) throws InputMismatchException {
		double value = 0.0; 
		do {
			try {
				System.out.println(str);
				value = readData.nextDouble();
			} catch (InputMismatchException e) {
				System.out.println("Format Error");
			}
			readData.nextLine();
		} while (value == 0);
		return value;
	}
	
	public static char readChar(String str) {
		char value = 0;
		do {
	         System.out.println(str);
	         try {
	        	 value = readData.next().charAt(0);
	         } catch (Exception e) {
	             System.out.println(e.toString());
	         }
	         readData.nextLine();
	     } while (value == 0);
	     return value;
	}

	
	public static String readString(String sentence) {
		String str = "";
		do {
	         System.out.println(sentence);
	         try {
	        	 str = readData.nextLine();
	         } catch (Exception e) {
	             System.out.println("error en la introduccion del String");
	         }
	     } while (str == "");
	     return str;
	}
	
	public static boolean readYesNo (String sentence) {
    	String str = "";
		boolean bool = false;
		boolean correct = true;
		do {
			System.out.println(sentence);
			try {
				str = readData.nextLine().toUpperCase();
				if (str.charAt(0) == 'S') {
					bool = true;
					correct = true;
				} else if (str.charAt(0) == 'N') {
					bool = false; 
					correct = true;
				} else {
					System.out.println("Wrong. You must type S or N");
					correct = false;
				}
			} catch (Exception e) {
				System.out.println("Wrong. You must type si or no");
			}
		} while (!correct); 
		return bool;
	}
	
	 
    
	

}
