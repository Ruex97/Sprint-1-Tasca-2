package nivell3;

import java.util.ArrayList;

public class SeatsManagement {
	private ArrayList<Seat> seats;

	public SeatsManagement() {
		seats = new ArrayList<>();
	}

	public ArrayList<Seat> getSeats() {
		return seats;
	}
	
	public void addSeat(Seat seat) throws OccupiedSeatException{
		if (seats.size() == 0) {
			seats.add(seat);
		} else {
		int position = searchSeat(seat.getRow(), seat.getSitNumber());
		if (position != -1) {
			throw new OccupiedSeatException("This seat is occupied, try in other one");
		}
		
		seats.add(seat);	
		}
	}
	
	public void deleteSeat(int row, int seat) throws FreeSeatException {
		int position = searchSeat(row, seat);
		if (position == -1) {
			throw new FreeSeatException("You can't delete an empty seat");
		}
		seats.remove(position);
	}
	

	public int searchSeat (int row, int seat) {
		int value = -1;
		int i = 0;
		while (i < seats.size() && value == -1) {
			if(row == seats.get(i).getRow()) {
				if (seat == seats.get(i).getSitNumber()) {
					value = i;
				}
			}
			i++;
		}
		
		return value;
	}

	@Override
	public String toString() {
		return "Booked seats:" + seats.toString();
	}
	
	

	

}
