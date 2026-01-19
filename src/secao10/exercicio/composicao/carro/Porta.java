package secao10.exercicio.composicao.carro;

public class Porta {
	private double tamanho;
	private boolean portaAberta = false;
	public Porta() {
		
	}
	public Porta(double tamanho) {
		this.tamanho = tamanho;
		 //this.portaAberta = portaAberta;
	}
	
	public void abrirPorta() {
		System.out.println("Porta aberta");
		portaAberta = true;
	}
	public void fecharPorta() {
		System.out.println("Porta fechada");
		portaAberta = false;
	}
	public double getTamanho() {
		return tamanho;
	}
	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}
	
	public String toString() {
		return "Porta: tamanho = " + tamanho + " \n";
	}
	
}
