package secao12.exercicio.composicao.pedidos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class OrderSummary {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner (System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date moment = new Date();
		//List <Product> products = new ArrayList<>();
		//List <OrderItem> orderItems = new ArrayList<>();
		//OrderItem orderItems = new OrderItem();		
		
		
		System.out.println("Entercliente data: ");
		System.out.println("Name:");
		String name = scanner.nextLine();
		//Client client = new Client();
		//client.setName(scanner.nextLine());
		System.out.println("Email:");
		String email = scanner.nextLine();
		System.out.println("Birthdate (DD/MM/YYYY):");
		Date birthDate = sdf.parse(scanner.next());
		
		Client client = new Client (name, email, birthDate);
		
		System.out.println("Enter order data:");
		System.out.println("Status:");
		scanner.nextLine();
		String orderStatus = scanner.nextLine(); 
		
		System.out.println("How many items to this order? ");
		int qdtyItems = scanner.nextInt();
		
		Order order = new Order (moment, OrderStatus.valueOf(orderStatus), client);
		
		for(int i = 0; i < qdtyItems; i++) {
			scanner.nextLine();
			System.out.println("Enter#" + (i+1) + " item data: ");
			System.out.println("Product name: ");
			String productName = scanner.nextLine();
			System.out.println("Product price: ");
			double price = scanner.nextDouble();
			System.out.println("Quantity: ");
			Integer quantity = scanner.nextInt();
			
			
			Product product = new Product(productName, price);
			
			OrderItem orderItem = new OrderItem(quantity, price, product);
		
			order.addOrderItem(orderItem);
		}
		
		
		/*
		System.out.println("ORDER SUMMARY: ");
		System.out.println("Order moment: " + order.getMoment());
		System.out.println("Order status: " + order.getStatus());
		System.out.println("Client: " + client.getName() + " " + client.getBithDate() + " - " + client.getEmail());
		System.out.println("Order items: ");
		*/
		
		System.out.println(order);
		
		scanner.close();
	}

}
