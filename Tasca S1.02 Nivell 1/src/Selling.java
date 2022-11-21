import java.util.ArrayList;
  
public class Selling {
	private ArrayList<Producte> productes;
	private double totalSellPrice;
	
	public Selling(ArrayList<Producte> productes) {
		this.productes = productes;
		try {
			totalSellPrice = calculateTotal();
		}
		catch(EmptySellException customex) {
					
		}
	}
	
	// Getters
	public ArrayList<Producte> getProductes(){
		return productes;
	}
	public double getTotalSellPrice() {
		return totalSellPrice;
	}
	
	// Setters
	public void setProductes(ArrayList<Producte> productes) {
		this.productes = productes;
	}
	
	// Class methods
	public double calculateTotal() throws EmptySellException{
		if(productes == null){
			throw new EmptySellException("Per fer una venda primer has d'afegir productes");
		} 
		double sumOf = 0;
		for (int i=0;i<productes.size();i++) {
			sumOf += productes.get(i).getPrice();
		}
		return sumOf;
	}
	

}
