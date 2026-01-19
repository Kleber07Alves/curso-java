package secao13.heranca.polimorfismo.tags;

import java.time.LocalDate;
//import java.util.Date;

public class UsedProduct extends Product{
	private LocalDate  manufactureDate;
	
	public UsedProduct() {
		
	}

	public UsedProduct(String name, Double price, LocalDate  manufactureDate) {
		super(name,  price);
		this.manufactureDate = manufactureDate;
	}

	public LocalDate  getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(LocalDate  manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	
	@Override
	public String priceTag() {
		return this.getName() + " (used) $ " 
				+ String.format("%.2f", this.getPrice()) 
				+ " (Manufacture date: " + this.getManufactureDate() + ")";
		
	}
	

}
