package secao13.exercicio.abstrato;

public class Individual extends TaxPayer{
	private Double healthExpenses;
	
	public Individual() {
		
	}
	
	public Individual(String name, Double currentIncome, Double healthExpenses) {
		super(name, currentIncome);
		this.healthExpenses = healthExpenses;
	}

	public Double getHealthExpenses() {
		return healthExpenses;
	}

	public void setHealthExpenses(Double healthExpenses) {
		this.healthExpenses = healthExpenses;
	}

	@Override
	public double taxCalc() {
		double tax = 0.0;
		if(this.getCurrentIncome() <  20000) {
			tax = this.getCurrentIncome() * 0.15;
		}
		else {
			tax = this.getCurrentIncome() * 0.25;
		}
		return tax - this.getHealthExpenses() * 0.5;
	}
	
	
	
	
}
