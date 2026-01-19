package secao10.exercicio.composicao.carro;

public class Motor {
	private String potencia;
	private String tipo;
	private boolean motorLigado = false;
	
	public Motor() {
		
	}
	public Motor(String potencia, String tipo) {
		this.potencia = potencia;
		this.tipo = tipo;
	}
	
	public void ligarMotor() {
		System.out.println("Motor ligado");
		motorLigado = true;
	}
	public void desligarMotor() {
		System.out.println("Motor desligado");
		motorLigado = false;
	}
	
	
	public String getPotencia() {
		return potencia;
	}
	public void setPotencia(String potencia) {
		this.potencia = potencia;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String toString() {
		return " Motor - Potecia:  " + this.potencia + " Tipo: " + this.tipo + " \n";
	}

}
