package secao10.exercicio.vetores;

import java.util.Scanner;

public class Dados_Pessoas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Quantas pessoas irão participar da pesquisa?");
		int quantPessoas = scanner.nextInt();
		double [] altura = new double[quantPessoas];
		String[] genero = new String [quantPessoas];
		//int contGenero = 0;
		for (int i = 0; i<altura.length; i++) {
			System.out.println("Altura da " + i+1 + "a pessoa:");
			altura[i] = scanner.nextDouble();
			System.out.println("Genero da " + i+1 + "a pessoa:");
			genero[i] = scanner.next();
			
			if(genero[i] == "M") {
				
			}
		}
		scanner.close();;
		
	}

}
