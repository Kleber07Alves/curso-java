package secao10.exercicio.vetores;

import java.util.Scanner;

public class Pensionato {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner (System.in);
		System.out.println("Numero de estudantes que alugarao um quarto:");
		int n = scanner.nextInt();
		
		
		int quantQuartos = 10;

		
		String [] email = new String [quantQuartos];
		String [] nomeEstudante = new String [quantQuartos];
		int j = 0; // j é o quarto 
		for(int i = 0; i < n; i++) {
			System.out.println("Digite qual o numero do quarto vai alugar \n Quartos disponiveis de 0 a 9:");
			
			j = scanner.nextInt();
			
			if(nomeEstudante[j] == null) {
				System.out.println("Nome do studante:");
				nomeEstudante[j] = scanner.next();
				System.out.println("E-mail:");
				email[j] = scanner.next();	
			}
			else {
				System.out.println("Quarto ocupado");
			}	
		}
			
		for(int i = 0; i < quantQuartos; i++) {
			if(nomeEstudante[i] != null) {
				System.out.println("quartos alugados: \n" + " [" + i + "] = " + nomeEstudante [i] + ", "+ email [i]);				
			}			
		}
			
		scanner.close();
		
	}

}
