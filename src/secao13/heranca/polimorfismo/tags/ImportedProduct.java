package secao13.heranca.polimorfismo.tags;

public class ImportedProduct extends Product{
	private Double customsFee;

	
	public ImportedProduct() {
		
	}
	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}
	public Double getCustomsFee() {
		return customsFee;
	}
	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}
	private Double totalPrice() {
		
		return (this.getPrice() + this.customsFee);
	}
	
	
	@Override
	public String priceTag() {
		return this.getName() + " $ " 
				+ String.format("%.2f",this.totalPrice()) 
				+ " (Customsfee: $ " + String.format("%.2f", this.customsFee) + ")";
		
	}
	
}
