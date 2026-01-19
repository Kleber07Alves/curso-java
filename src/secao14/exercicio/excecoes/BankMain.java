package secao14.exercicio.excecoes;

import java.util.Locale;
import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		
		try {
			System.out.println("Enter account data");
			System.out.print("Number: ");
			Integer number = scanner.nextInt();
			System.out.print("Holder: ");
			scanner.nextLine();
			String holder = scanner.nextLine();		
			System.out.print("Initial balance: ");
			Double initialBalace = scanner.nextDouble();
			System.out.print("Withdraw limit: ");
			Double withdrawLimit = scanner.nextDouble();
			
			Account account = new Account(number, holder, initialBalace, withdrawLimit);
			
			//System.out.println(account.getBalance());
			
			System.out.print("Enter amount for withdraw: ");
			Double withdrawQuantity = scanner.nextDouble();
			account.withdraw(withdrawQuantity);
			System.out.printf("New balance: %.2f", account.getBalance());
			System.out.println();
		}catch(WithdrawException e){
			System.out.println(e.getMessage());
		}
		
		
		
		scanner.close();
	}

}
