package nov09.test.set_B.sport_model;

public class Sports {
	private int teamSize;
	private String sportName;
	private String sportType;

	public Sports() {
		super();
		this.teamSize = 0;
		this.sportName = null;
		this.sportType = null;
	}

	public Sports(int teamSize, String sportName) {
		super();
		if (teamSize <= 0) {
			System.err.println("Error : invalid input");
			System.exit(0);
		}

		this.teamSize = teamSize;
		this.sportName = sportName;
	}

	public Sports(int teamSize, String sportName, String sportType) {
		super();
		if (teamSize <= 0) {
			System.err.println("Error : invalid input");
			System.exit(0);
		}

		this.teamSize = teamSize;
		this.sportName = sportName;
		this.sportType = sportType;
	}

	public void displayInfo() {
		System.out.println(
				"Sports [teamSize=" + teamSize + ", sportName=" + sportName + ", sportType=" + sportType + "]");
	}
}
