package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter cliente data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(sc.next());
		sc.nextLine();
		System.out.println("Enter order data: ");
		System.out.print("Status: ");
		String status = sc.nextLine();
		System.out.print("How many items to this order: ");
		int items = sc.nextInt();
		
		Client client = new Client(name, email, birthDate);
		
		Date orderDate = new Date();
		
		Order order = new Order(orderDate, OrderStatus.valueOf(status), client);
		
		OrderItem orderItem = new OrderItem();
		
		for(int i=1; i<=items; i++) {
			sc.nextLine();
			System.out.println("Enter #" + i + " item data:");
			System.out.println("Product Name: ");
			String nameItem = sc.nextLine();
			orderItem.setName(nameItem);
			
			System.out.println("Product Price: ");
			double priceItem = sc.nextDouble();
			orderItem.setPrice(priceItem);
			
			System.out.println("Quantity: ");
			Integer quantity = sc.nextInt();
			orderItem.setQuantity(quantity);
			
			order.addItems(orderItem);
		}
		
		System.out.print(order.toString());
		
		sc.close();
	}
}
