package secao10.exercicio.lists;

public class Employe {
	
	String name;
	Integer id;
	Double salary;

	public Employe(Integer id, String name, Double salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public Integer getId() {
		return id;
	}
	public double getSalary() {
		return salary;
	}
	
	public void increaseSalary(double percent) {
		this.salary =+ this.salary * percent;
	}
	
	
	@Override
	public String toString() {
		return id + ", " + name + ", " + salary;
	}
}
