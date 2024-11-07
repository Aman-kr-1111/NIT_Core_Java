package oct25.animals;

public class Mammal extends Animals {
	private boolean hasFur;

	public Mammal(String name, boolean hasFur) {
		super(name);
		this.hasFur = hasFur;
	}

	public String getHasFur() {
		return hasFur ? "Yes" : "No";
	}

	public void setHasFur(boolean hasFur) {
		this.hasFur = hasFur;
	}

	@Override
	public void displayDetails() {
		System.out.println("Mammal Details!!!" + "\nAnimal Name : " + super.getName() + "               \nHas Fur : "
				+ getHasFur());
	}

}
