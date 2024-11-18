package nov18.hostel;

public class HostelRoom extends Hostel {
	private String bedType;

	{
		bedType = "Single Bed";
		System.out.println("Hostel Room initialized with default values.");
	}

	@Override
	public void bookRoom() {
		System.out.println("Hostel room booked with default settings.");
	}

	public void bookRoom(String roomType, String bedType) {
		if (bedType == null || bedType.isEmpty()) {
			System.err.println("Error: Bed type cannot be null or empty.");
			System.exit(0);
		} else {
			System.out.println(roomType + " with " + bedType + " booked successfully.");
		}
	}

	@Override
	public void cleanRoom() {
		System.out.println("Hostel room cleaning scheduled.");
	}
}
