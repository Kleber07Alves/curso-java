package secao10.exercicio.composicao.reservahotel;

public class RoomItem {
	private int quantity;
	private Double pricePerNight;
	
	public RoomItem(int quantity, Double pricePerNight) {
		super();
		this.quantity = quantity;
		this.pricePerNight = pricePerNight;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Double getPricePerNight() {
		return pricePerNight;
	}

	public void setPricePerNight(Double pricePerNight) {
		this.pricePerNight = pricePerNight;
	}
	
	public Double subSoma() {
		return quantity * pricePerNight;
	}
	public String toString() {
		StringBuilder str = new StringBuilder();  
		str.append(this.getQuantity() + "x");
		
		return str.toString();
	}
}
