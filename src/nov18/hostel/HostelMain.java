package nov18.hostel;

public class HostelMain {

	public static void main(String[] args) {
		HostelRoom hRoom = new HostelRoom();
		hRoom.bookRoom("Deluxe Hostel Room", "");
		hRoom.bookRoom("Deluxe Hostel Room", "Double Bed");

		hRoom.cleanRoom();
	}

}
