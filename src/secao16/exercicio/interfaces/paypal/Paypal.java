package secao16.exercicio.interfaces.paypal;

public class Paypal implements PayService{
	
	
	
	public double calcularTaxa(double valor) {
		return valor * 0.02;
	}
	public double calcularTotal(double valor) {
		return valor + this.calcularTaxa(valor);
	}
	
	//public String toString() {
		//return "Total Pay Service:" + this.calcularTotal(double valor);
	//}
}
