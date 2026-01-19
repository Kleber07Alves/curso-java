package secao10.exercicio.vetores;

import java.util.Scanner;

public class Negativo {

	public static void main(String[] args) {

		Scanner scanner = new Scanner (System.in);
		
		System.out.println("How many numbers do you want to enter?");
		int n = scanner.nextInt();
		int numbers [] = new int [n];
		
		for(int i = 0; i < n; i++) {
			numbers[i] = scanner.nextInt();
		}
		System.out.println("Negative numbers:");
		for(int i = 0; i < n; i++) {
			if(numbers[i] < 0) {
				System.out.println(numbers[i]);
			}
			
		}
		
		scanner.close();
	}

}
