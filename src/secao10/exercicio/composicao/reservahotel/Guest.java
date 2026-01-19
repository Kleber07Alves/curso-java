package secao10.exercicio.composicao.reservahotel;

public class Guest {
	
	private String name;
	private String email;
	private String cpf;
	
	public Guest() {
		
	}

	public Guest(String name, String email, String cpf) {
		super();
		this.name = name;
		this.email = email;
		this.cpf = cpf;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String toString() {
		return "Guest: " + this.getName() 
				+ "\nCPF: " + this.getCpf()
				+ "\nEmail: " + this.getEmail();
	}
}
