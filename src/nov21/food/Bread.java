package nov21.food;

public class Bread extends Food {
	String type = "vegetarian";

	public Bread(double proteins, double fats, double carbs) {
		super();
		super.proteins = proteins;
		super.fats = fats;
		super.carbs = carbs;
		super.tastyScore = 8;
	}

	@Override
	public void getMacroNutrients() {
		System.out.println("A slice bread has [" + super.proteins + "] gms of protein, [" + super.fats
				+ "] gms of fats and [" + super.carbs + "] gms of carbohydrates.");
	}

	@Override
	String getType() {
		return "Bread is " + type;
	}

	@Override
	double getTaste() {
		return this.tastyScore;
	}

}
