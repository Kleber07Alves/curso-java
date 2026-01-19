package secao13.heranca.polimorfismo.tags;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class InsertTagProductMain {

	public static void main(String[] args) throws ParseException {
		Scanner scanner = new Scanner (System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		List<Product> list = new ArrayList<>();
		
		System.out.println("Enter the number of products: ");
		int quantityProducts = scanner.nextInt();
		
		for(int i = 0; i<quantityProducts; i++) {
			System.out.println("Product # " + (i+1) + " data:");
			System.out.print("Common, used or imported(c/u/i)? ");
			char c = scanner.next().charAt(0);
			System.out.print("Name: ");
			scanner.nextLine();
			String name = scanner.nextLine();
			System.out.print("Price: ");
			Double price = scanner.nextDouble();
			
			
			if(c == 'i') {
				System.out.print("Customsfee: ");
				Double Customsfee = scanner.nextDouble();
				Product product = new ImportedProduct(name, price, Customsfee);
				list.add(product);
			}
			else if (c == 'c') {
				Product product = new Product(name, price);
				list.add(product);
			}
			else {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				scanner.nextLine();
				LocalDate  manufactureDate = LocalDate.parse(scanner.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));;
				Product product = new UsedProduct(name, price, manufactureDate);
				list.add(product);
			}
			
		}
		System.out.println("PRICE TAGS: ");
		
		for(Product p : list) {
			System.out.println(p.priceTag());
		}
		
		scanner.close();
	}

}
