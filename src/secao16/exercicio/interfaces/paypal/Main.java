package secao16.exercicio.interfaces.paypal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner (System.in);
		PayService paypal = new Paypal();
		
		System.out.println("Input the service value :");
		double value = scanner.nextDouble();
		
	
		
		
		
		
		System.out.println("Total: \n" + paypal.calcularTotal(value));
		
		scanner.close();
	}

}
