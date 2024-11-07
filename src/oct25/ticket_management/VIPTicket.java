package oct25.ticket_management;

public class VIPTicket extends Ticket {
	private String specialAccess;

	public VIPTicket(String eventName, int seatNumber, double price, String specialAccess) {
		super(eventName, seatNumber, price);
		this.specialAccess = specialAccess;
	}

	public String getSpecialAccess() {
		return specialAccess;
	}

	public void setSpecialAccess(String specialAccess) {
		this.specialAccess = specialAccess;
	}

	@Override
	public void displayDetails() {
		System.out.println("VIP Ticket!!!" + "\nEvent : " + super.getEventName() + "                \nSeat Number :"
				+ super.getSeatNumber() + "\nPrice : $" + super.getPrice() + "\nSpecial Access : "
				+ getSpecialAccess());
	}

}
