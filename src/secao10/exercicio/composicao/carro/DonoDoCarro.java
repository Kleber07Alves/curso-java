package secao10.exercicio.composicao.carro;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DonoDoCarro {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//Carro carro = new Carro();
		List<Parafuso> listParafuso = new ArrayList<>();
		List<Porta> listPorta = new ArrayList<>();
		Porta porta = new Porta();

		
		System.out.println("Digite a potencia do motor:");
		String potenciaMotor = scanner.nextLine();
		System.out.println("Digite o tipo do motor: ");
		String tipoMotor = scanner.nextLine();
		
		System.out.println("digite o numero de parafusos do carro: ");		
		int qtdParafusos = scanner.nextInt();
		
		for(int i = 0; i < qtdParafusos; i++) {
			System.out.println("Tamanho do parafuso: ");
			double tamanho = scanner.nextDouble();
			System.out.println("Peso do parafuso: ");
			double peso = scanner.nextDouble();
			
			Parafuso parafuso = new Parafuso(tamanho, peso);
			listParafuso.add(parafuso);			
		}
		System.out.println("digite o numero de portas do carro: ");		
		//int qtdPortas = scanner.nextInt();
		
		for(int i = 0; i < qtdParafusos; i++) {
			System.out.println("Tamanho da porta: ");
			double tamanho = scanner.nextDouble();
			System.out.println("Ela está aberta ou fechada? ");
			scanner.nextLine();
			String estadoPorta = scanner.nextLine();
			if (estadoPorta.equals("Aberta") || estadoPorta.equals("aberta")) {
				porta.abrirPorta();
			}
			else{
				porta.fecharPorta();
			}
			
			//Porta tamanhoPorta = new Porta (tamanho);
			listPorta.add(porta);			
		}
	
		Motor motor = new Motor(potenciaMotor, tipoMotor);
		
		Carro carro = new Carro(motor, listParafuso, listPorta);
		
		System.out.println(carro);

		scanner.close();
	}

}
