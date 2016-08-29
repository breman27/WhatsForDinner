package ingredients;

import java.util.ArrayList;

/*
 * Ingredients needed for each meal
 */
public class Ingredients {
	private ArrayList<Ingredient> ingredientList;

	public Ingredients() {
		this.ingredientList = new ArrayList<Ingredient>();
	}

	/*
	 * Returns an Ingredient object from the list of Ingredient(s)
	 */
	public Ingredient get(int index) {
		return this.ingredientList.get(index);
	}

	/*
	 * Adds a new Ingredient to the list of Ingredient(s)
	 */
	public void add(Ingredient ingredient) {
		this.ingredientList.add(ingredient);
	}
	
	public int size(){
		return this.ingredientList.size();
	}
}
