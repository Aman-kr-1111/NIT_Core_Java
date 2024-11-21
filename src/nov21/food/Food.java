package nov21.food;

public abstract class Food {
	double proteins;
	double fats;
	double carbs;
	double tastyScore;

	public abstract void getMacroNutrients();

	abstract String getType();

	abstract double getTaste();
}
