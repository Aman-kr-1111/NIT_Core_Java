package nov21.food;

public class Egg extends Food {
	String type = "non-vegetarian";

	public Egg(double proteins, double fats, double carbs) {
		super();
		super.proteins = proteins;
		super.fats = fats;
		super.carbs = carbs;
		super.tastyScore = 7;
	}

	@Override
	public void getMacroNutrients() {
		System.out.println("An egg has [" + super.proteins + "] gms of protein, [" + super.fats + "] gms of fats and ["
				+ super.carbs + "] gms of carbohydrates.");
	}

	@Override
	String getType() {
		return "Egg is " + type;
	}

	@Override
	double getTaste() {
		return this.tastyScore;
	}
}
