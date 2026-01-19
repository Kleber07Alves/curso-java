package secao12.exercicio.pensionamento;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner (System.in);
		Rent [] vect = new Rent[10];
		//Rent rent = new Rent ("Kleber", "kleber@gmail.com");
		
		
		
		System.out.println("How many rooms will be rent?");
		int rooms = scanner.nextInt();
		
		for(int i = 0; i < rooms; i++) {
			System.out.println("Rent #" + (i+1) + ":");
			System.out.println("Name: ");
			scanner.nextLine();
			String name = scanner.nextLine();
			System.out.println("Email: ");
			String email = scanner.next();
			System.out.println("Room: ");
			int roomNumber = scanner.nextInt();
			
			//Rent rent = new Rent (name, email);
			
			vect [roomNumber] = new Rent (name, email);
		}
		System.out.println("\nBusy rooms: ");
		for(int i = 0; i < vect.length; i++) {
			if(vect[i] != null) {
				
				System.out.println(i + ": " + vect[i]);
			}
		}
		System.out.println("==================================");
		scanner.close();
	}

}
