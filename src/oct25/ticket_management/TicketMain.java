package oct25.ticket_management;

public class TicketMain {

	public static void main(String[] args) {
		Ticket regularTicket = new Ticket("Concert", 101, 50.0);
		regularTicket.displayDetails();
		System.out.println();

		VIPTicket vipTicket = new VIPTicket("VIP Concert", 201, 100.0, "Backstage Access");
		vipTicket.displayDetails();
		System.out.println();

		StudentTicket studentTicket = new StudentTicket("Student Event", 301, 30.0, true);
		studentTicket.displayDetails();
		System.out.println();
	}

}
