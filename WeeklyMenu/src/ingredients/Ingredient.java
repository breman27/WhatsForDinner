package ingredients;

/**
 * 
 * @author Brett Long
 * @version 8/27/2016
 * 
 *          Ingredient object holding different ingredients found in the txt
 *          files
 */
public class Ingredient {
	private String name;
	private String measurement;
	private String amount;

	public Ingredient(String name, String amount, String measurement) {
		this.name = name;
		this.amount = amount;
		this.measurement = measurement;
	} // End constructor

	/**
	 * Returns the name of this ingredient
	 */
	public String getName() {
		return this.name;
	} // End getName

	/**
	 * Returns the measurement needed for this ingredient
	 */
	public String getMeasurement() {
		return this.measurement;
	} // End getMeasurement

	/**
	 * Returns how much of this ingredient is needed
	 */
	public String getAmount() {
		return this.amount;
	} // End getAmount

	/**
	 * Pretty print this Ingredient object
	 */
	public void print() {
		System.out.print(this.getName() + ": " + this.getAmount() + " "
				+ this.getMeasurement());
	}// End print

}// End Ingredient
