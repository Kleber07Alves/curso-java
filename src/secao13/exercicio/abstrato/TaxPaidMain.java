package secao13.exercicio.abstrato;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class TaxPaidMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		List<TaxPayer> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int numberTaxPayes = scanner.nextInt();
		
		for(int i = 0; i < numberTaxPayes; i++) {
			System.out.println("Tax payer #" + (i+1) + " data: ");
			System.out.print("Individual or company (i/c)? ");
			char c = scanner.next().charAt(0);
			System.out.print("Name: ");
			scanner.nextLine();
			String name = scanner.nextLine();
			System.out.print("Anual income: ");
			double currentIncome = scanner.nextDouble();
			if(c == 'i') {
				System.out.print("Health expenditures: ");
				double healthExpenses = scanner.nextDouble();
				list.add(new Individual(name, currentIncome, healthExpenses));
			}
			else {
				System.out.print("Number of employees: ");
				int numberEmployeees = scanner.nextInt();
				list.add(new LegalEntity(name, currentIncome, numberEmployeees));
			}	
		}
		System.out.println();
		System.out.println("TAXES PAID: ");
		double soma= 0;
		for(TaxPayer t : list) {
			System.out.println(t.toString());
			soma += t.taxCalc();
		}
		System.out.println();
		System.out.printf("TOTAL TAXES: $ %.2f",soma);
		
		
		scanner.close();
	}

}
