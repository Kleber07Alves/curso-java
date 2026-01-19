package secao10.exercicio.composicao.carro;

public class Parafuso {
	private double tamanho;
	private double peso;
	
	public Parafuso() {
		
	}

	public Parafuso(double tamanho, double peso) {
		this.tamanho = tamanho;
		this.peso = peso;
	}

	
	public double getTamanho() {
		return tamanho;
	}

	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String toString() {
		return "Parafuso: tamanho = " + tamanho + ", peso = " + peso + " \n";
	}
	
	
	
}
