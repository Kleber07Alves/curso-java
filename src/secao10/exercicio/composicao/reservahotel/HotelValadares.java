package secao10.exercicio.composicao.reservahotel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class HotelValadares {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		//System.out.println("=== HOTEL RESERVATION SUMMARY ===");
		/*System.out.println("Guest: ");
		String name = scanner.nextLine();
		System.out.println("CPF: ");
		String cpf = scanner.nextLine();
		System.out.println("Email: ");
		String email = scanner.nextLine();
		Guest guest = new Guest(name, email , cpf);
		*/
		Guest guest = new Guest("kleber", "klleber@gmail.com", "550048922");

		System.out.println("Check-in: ");
		LocalDate checkIn = LocalDate.now();
		System.out.println("Check-out: ");
		LocalDate checkOut = LocalDate.now();
		
		Reservation reservation = new Reservation(checkIn, checkOut, guest);
		
		//System.out.println(reservation.duration(checkIn, checkOut));
		System.out.println(reservation);
		
		
		//System.out.println(guest);

	}

}
