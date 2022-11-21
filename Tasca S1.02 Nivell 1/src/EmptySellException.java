// I create my own exception class
class EmptySellException extends Exception {
	
	public EmptySellException(String str) {
		super(str);  // I call the constructor of Exception, and giving as a parameter the String str
	}
	
	
}
