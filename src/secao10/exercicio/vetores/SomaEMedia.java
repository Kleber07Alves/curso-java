package secao10.exercicio.vetores;

//import java.util.Locale;
import java.util.Scanner;

public class SomaEMedia {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		//Locale.US;
		
		System.out.println("Quantos valores quer digitar?");
		int quant = scanner.nextInt();
		int[] vet = new int [quant];
		int soma = 0;
		double media = 0.0;

		for(int i = 0; i < quant; i++) {
			vet[i] = scanner.nextInt();
			soma += vet[i];
		}
		
		System.out.println("Valores:");
		
		for(int i = 0; i < quant; i++) {
				System.out.print(vet[i] + " ");
		}
		media = soma/quant;
		System.out.println("\nSoma " + soma);
		System.out.println("Media  " + media);
		scanner.close();
	}

}
