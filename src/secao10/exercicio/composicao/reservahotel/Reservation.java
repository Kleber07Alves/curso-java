package secao10.exercicio.composicao.reservahotel;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class Reservation {
	private LocalDate checkIn;
	private LocalDate checkOut;
	private Guest guest;
	private List<RoomItem> roomItems = new ArrayList<>();
	private RoomItem roomItem;
	
	public Reservation() {
		
	}
	public Reservation(LocalDate checkIn, LocalDate checkOut, Guest guest) {
		super();
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		this.guest = guest;
	}
	public LocalDate getCheckIn() {
		return checkIn;
	}
	public void setCheckIn(LocalDate checkIn) {
		this.checkIn = checkIn;
	}
	public LocalDate getCheckOut() {
		return checkOut;
	}
	public void setCheckOut(LocalDate checkOut) {
		this.checkOut = checkOut;
	}
	public Guest getGuest() {
		return guest;
	}
	public void setGuest(Guest guest) {
		this.guest = guest;
	}
	public void addRoomItems(RoomItem roomItem) {
		this.roomItems.add(roomItem);
	}
	public void removeRoomItems(RoomItem roomItem) {
		this.roomItems.remove(roomItem);
	}
	
	
	
	public Long duration(LocalDate checkIn, LocalDate checkOut) {
		
		Long duration = (ChronoUnit.DAYS.between(checkIn, checkOut));
		return duration;
		
	}
	public Double total() {
		Double soma= 0.0;
		for(RoomItem item : roomItems) {
			soma += item.subSoma();
		}
		return soma;
	}
	
	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append("=== HOTEL RESERVATION SUMMARY === \n");
		str.append(guest + " \n");
		str.append("Check-in: " + this.getCheckIn() + "\n");
		str.append("Check-out: " + this.getCheckOut() + "\n");
		str.append("Duration: " + this.duration(checkIn, checkOut) + " nigths \n");
		str.append("\nRoooms: \n");
		//str.append(
		
		return str.toString();
							
	}
	
}
