package nivell3;

public class Seat {
	private int row;
	private int sitNumber;
	private String name;

	public Seat(int row, int sitNumber, String name){
		this.row = row;
		this.sitNumber = sitNumber;
		this.name = name;

	}

	public int getRow() {
		return row;
	}

	public int getSitNumber() {
		return sitNumber;
	}

	public String getName() {
		return name;
	}

	public boolean equals(Seat seat){
		boolean coincidence = false;
		if (seat.getRow() == row && seat.getSitNumber() == sitNumber) {
			coincidence = true;
		}
		return coincidence;
	}

	@Override
	public String toString() {
		return "Row: " + row + ", Seat: " + sitNumber + ", Person: " + name + "\n";
	}

}
