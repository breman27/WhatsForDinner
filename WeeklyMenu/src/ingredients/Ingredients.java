package ingredients;

import java.util.ArrayList;

/**
 * 
 * @author Brett Long
 * @version 8/27/2016
 * 
 *          ArrayList of Ingredient objects
 */
public class Ingredients {
	private ArrayList<Ingredient> ingredientList;

	public Ingredients() {
		this.ingredientList = new ArrayList<Ingredient>();
	} // End constructor

	/**
	 * Returns an Ingredient object from the list of Ingredient(s)
	 */
	public Ingredient get(int index) {
		return this.ingredientList.get(index);
	} // End get

	/**
	 * Adds a new Ingredient to the list of Ingredient(s)
	 */
	public void add(Ingredient ingredient) {
		this.ingredientList.add(ingredient);
	} // End add

	/**
	 * Returns size of the Ingredients object
	 */
	public int size() {
		return this.ingredientList.size();
	}// End size

}// End Ingredients
