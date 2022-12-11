package nivell3;


public class Cinema {
	private int rows;
	private int seats;
	private SeatsManagement manager;
	
	public Cinema() {
		this.manager = new SeatsManagement();
		this.rows = 0;
		this.seats = 0;
	}
	
	
	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	public SeatsManagement getManager() {
		return manager;
	}

	public void setManager(SeatsManagement manager) {
		this.manager = manager;
	}

	
	public void start() {
		requestInitialData();
		int option = menu();
		switch(option) {
		
		}
	}
	
	public int menu() {
		int option = -1;
		do {
		option = Tools.readInt("What do you want to do? \n\n1.- Show booked seats \n2.- Show seats of a given person\n"
					+ "3.- Book a seat. \n4.- Cancel seat booking" + "\n5.- Cancel person's booking "
					+ "\n0.- Quit.");
		switch(option) {
			case 1:
				showBookedSeats();
			break;
			case 2:
				showBookedSeatsBySomeone();
			break;
			case 3:
				bookSeat();
			break;
			case 4:
				cancelBookedSeat();
			break;
			case 5:
				cancelBookedSeatsBySomeone();
			break;
			case 0:
				System.out.println("You quit succesfully");
			
		}
		} while (option != 0);
		
		return option;
	}
	
	public void showBookedSeats() {
		System.out.println(manager.toString());
	}
	
	public void showBookedSeatsBySomeone() {
		try {
			String name = typeName();
			for (int i=0; i<manager.getSeats().size(); i++) {
				if(manager.getSeats().get(i).getName().equalsIgnoreCase(name)) {
					System.out.println(manager.getSeats().get(i).toString());
				} else {
					System.out.println("We don't have any book with this name!");
				}
			}
			
		} catch (IncorrectNameException e) {
			e.printStackTrace();
		}
	
	}
	
	public void bookSeat() {
		String name = "";
		int row = -1;
		int seat = -1;
		try {
			name = typeName();
			row = typeRow();
			seat = typeSeat();
		} catch (IncorrectNameException e1) {
			e1.printStackTrace();
		} catch (IncorrectRowException e2) {
			e2.printStackTrace();
		} catch (IncorrectSeatException e3) {
			e3.printStackTrace();
		}
		
		if (name != "" && row != -1 && seat != -1) {
			Seat mySeat = new Seat(row, seat, name);
			try {
				manager.addSeat(mySeat);
				System.out.println("Your seats have been booked :)");
			} catch (OccupiedSeatException e) {
				e.printStackTrace();
			}
		}
		
	}

	public void cancelBookedSeat() {
		
		int row = -1;
		int seat = -1;
		try {
			row = typeRow();
			seat = typeSeat();
		} catch (IncorrectRowException e1) {
			e1.printStackTrace();
		} catch (IncorrectSeatException e2) {
			e2.printStackTrace();
		}
		
		if (row != -1 && seat != -1) {
			try {
				manager.deleteSeat(row, seat);
				System.out.println("Your seat have been canceled");
			} catch (FreeSeatException e) {
				e.printStackTrace();
			}
		}
		
	}

	
	public void cancelBookedSeatsBySomeone() {
		try {
			String name = typeName();
			int bookedSeats = manager.getSeats().size();
			for (int i=bookedSeats-1; i >= 0; i--) {
				if(manager.getSeats().get(i).getName().equalsIgnoreCase(name)) {
					manager.getSeats().remove(i);
				}
		}		
		} catch (IncorrectNameException e) {
			e.printStackTrace();
		}
	
	}
	
	//Comentar tot amb Javadoc
	
	
	public void requestInitialData() {
		rows = Tools.readInt("Introduce the number of rows");
		seats = Tools.readInt("Introduce the number of seats for each row");
	}
	
	public int typeRow() throws IncorrectRowException{
		int rowNumber = Tools.readInt("In which row would you like to sit?");
		if (rowNumber < 0 || rowNumber > rows) {
			throw new IncorrectRowException("Introduce an available row");
		}
		return rowNumber;
	}
	

	public int typeSeat() throws IncorrectSeatException{
		int seatNumber = Tools.readInt("And which seat number do you prefer");
		if (seatNumber < 0 || seatNumber > seats) {
			throw new IncorrectSeatException("Introduce an available seat");
		}
		return seatNumber;
	}
	
	public String typeName() throws IncorrectNameException{
		String name = Tools.readString("What's your name?");
		if (!onlyLetters(name)) {
			throw new IncorrectNameException("Only alphabetical character allowed");
		}

		return name;
	}
	
	public boolean onlyLetters(String sentence) {
		char letter = ' ';
		boolean safe = false;
		int failCount = 0;
		int i = 0;
		while (failCount == 0 && i<sentence.length()){
			letter = sentence.charAt(i);
        
			if(!Character.isLetter(letter)) {
				failCount += 1;
			}
        
			i++;
		}
		if(failCount==0) {
        safe=true;
		}
    	
		return safe;
	}
	
	
	
}
