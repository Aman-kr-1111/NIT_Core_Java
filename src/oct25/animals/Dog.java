package oct25.animals;

public class Dog extends Mammal {
	private String breed;

	public Dog(String name, boolean hasFur, String breed) {
		super(name, hasFur);
		this.breed = breed;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	@Override
	public void displayDetails() {
		System.out.println("Dog Details!!!" + "\nAnimal Name : " + super.getName() + "               \nHas Fur : "
				+ super.getHasFur() + "\nBreed : " + getBreed());
	}
}
