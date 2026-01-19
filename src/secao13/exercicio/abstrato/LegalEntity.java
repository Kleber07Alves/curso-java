package secao13.exercicio.abstrato;

public class LegalEntity extends TaxPayer{
	private Integer numberEmployeees;
	
	public LegalEntity() {
		
	}
	public LegalEntity(String name, Double currentIncome, Integer numberEmployeees) {
		super(name, currentIncome);
		this.numberEmployeees = numberEmployeees;
	}

	public Integer getNumberEmployeees() {
		return numberEmployeees;
	}
	public void setNumberEmployeees(Integer numberEmployeees) {
		this.numberEmployeees = numberEmployeees;
	}
	
	
	@Override
	public double taxCalc() {
		double tax = 0.0;
		if(this.getNumberEmployeees() > 10) {
			tax = this.getCurrentIncome() * 0.14;
		}
		else {
			tax = this.getCurrentIncome() * 0.16;
		}
		return tax;
	}
	
	
}
