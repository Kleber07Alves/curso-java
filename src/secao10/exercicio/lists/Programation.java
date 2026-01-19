package secao10.exercicio.lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Programation {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner (System.in);
		List<Employe> list = new ArrayList<>();
		
		System.out.println("How many employees will be registered?");
		int employeNumber = scanner.nextInt();
		
		
		
		for (int i = 0; i < employeNumber; i++) {
            System.out.println("\nEmployee #" + (i + 1) + ":");
            System.out.print("Id: ");
            Integer id = scanner.nextInt();
            
            System.out.print("Name: ");
            scanner.nextLine(); 
            String name = scanner.nextLine();
            
            System.out.print("Salary: ");
            Double salary = scanner.nextDouble();

            Employe emp = new Employe(id, name, salary);
            list.add(emp);
        }
		System.out.print("\nEnter the employee id that will have salary increase: ");
        int idSearch = scanner.nextInt();
        
        
        Employe emp = list.stream().filter(x -> x.getId() == idSearch).findFirst().orElse(null);
        
        
        	
        
	        if (emp == null) {
	            System.out.println("This id does not exist!");
	        } else {
	            System.out.print("Enter the percentage: ");
	            double percentage = scanner.nextDouble();
	            emp.increaseSalary(percentage);
	        }
	        
        
        
        System.out.println("Lists of employees: " + list);
        
        System.out.println("\nList of employees:");
        for (Employe e : list) {
            System.out.println(e);
        }
        
        scanner.close();
        }

	
}
