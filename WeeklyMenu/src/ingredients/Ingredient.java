package ingredients;

public class Ingredient {
	private String name;
	private String measurement;
	private String amount;

	public Ingredient(String name, String amount, String measurement) {
		this.name = name;
		this.amount = amount;
		this.measurement = measurement;
	}

	public String getName() {
		return name;
	}

	public String getMeasurement() {
		return measurement;
	}

	public String getAmount() {
		return amount;
	}

	public void print() {
		System.out.print(this.getName() + ": " + this.getAmount() + " "
				+ this.getMeasurement());
	}
}
