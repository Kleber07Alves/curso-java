package secao10.exercicio.composicao.reservahotel;

import java.util.ArrayList;
import java.util.List;

public class Room {
	private String number;
	private RoomType type;
	private Double dailyRate;
	//private List<RoomItem> roomItems = new ArrayList<>();
	
	public Room() {
		
	}
	public Room(String number, RoomType type, Double dailyRate) {
		super();
		this.number = number;
		this.type = type;
		this.dailyRate = dailyRate;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public RoomType getType() {
		return type;
	}
	public void setType(RoomType type) {
		this.type = type;
	}
	public Double getDailyRate() {
		return dailyRate;
	}
	/*public void setDailyRate(Double dailyRate) {
		this.dailyRate = dailyRate;
	}
	*/
	
	/*public void addRoomItems(RoomItem roomItem) {
		this.roomItems.add(roomItem);
	}
	public void removeRoomItems(RoomItem roomItem) {
		this.roomItems.remove(roomItem);
	}*/
	
}
