package oct25.ticket_management;

public class StudentTicket extends Ticket {
	private boolean studentDiscount;

	public StudentTicket(String eventName, int seatNumber, double price, boolean studentDiscount) {
		super(eventName, seatNumber, price);
		this.studentDiscount = studentDiscount;
	}

	public boolean isStudentDiscount() {
		return studentDiscount;
	}

	public void setStudentDiscount(boolean studentDiscount) {
		this.studentDiscount = studentDiscount;
	}

	@Override
	public void displayDetails() {
		System.out.println("VIP Ticket!!!" + "\nEvent : " + super.getEventName() + "                \nSeat Number :"
				+ super.getSeatNumber() + "\nPrice : $" + super.getPrice() + "\nStudent Discount : " + studentDiscount);
	}

}
