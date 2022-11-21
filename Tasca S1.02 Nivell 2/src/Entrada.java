import java.util.*;
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
	
	// ***NO FUNCIONA AL MAIN, NO SE PERQUÈ*** 
	/*public static char readChar(String str) throws Exception {
		char value = 0; // I can compare characters with numbers because of ASCII code, and 0 is = null, so you can't introduce null by coincidence
		
		do {
			System.out.println(str);
			value = readData.next().charAt(0);
			if (readData.next().length() > 1) {
				throw new Exception();
			}
			try {
				System.out.println(str);
				value = readData.next().charAt(0);
				// As nextChar is not a method of class Scanner,I read it as a String and check for first character
				
			} catch (Exception e) {
				System.out.println(e.toString());
			}
			readData.nextLine();
		} while (value == 0);
		return value;
	} */
	
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
				str = readData.nextLine();
				if (str.equalsIgnoreCase("s")) {
					bool = true;
					correct = true;
				} else if (str.equalsIgnoreCase("n")) {
					bool = false; 
					correct = true;
				} else {
					System.out.println("Wrong. You must type S or N");
					correct = false;
				}
			} catch (Exception e) {
				System.out.println("Wrong. You must type S or N");
			}
		} while (!correct); 
		return bool;
	}
	
	 
    
	

}
