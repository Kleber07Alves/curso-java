package secao13.exercicio.abstrato;

public abstract class TaxPayer {
	private String name;
	private Double currentIncome;
	
	public TaxPayer() {
		
	}
	
	public TaxPayer(String name, Double currentIncome) {
		this.name = name;
		this.currentIncome = currentIncome;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getCurrentIncome() {
		return currentIncome;
	}
	public void setCurrentIncome(Double currentIncome) {
		this.currentIncome = currentIncome;
	}
	
	public abstract double taxCalc();
	
	
	public String toString() {
		return this.getName() + " $ " + String.format("%.2f", taxCalc());
	}

	
}
