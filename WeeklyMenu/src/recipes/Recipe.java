package recipes;

import java.util.HashMap;

import ingredients.*;

public class Recipe {
	private String recipeTitle;
	private Ingredients ingredients;
	private HashMap<String, Ingredients> recipe;

	public Recipe(String title, String[] ingredients) {
		this.recipeTitle = title;
		this.ingredients = populateIngredients(ingredients);
	}

	public String getRecipeTitle() {
		return recipeTitle;
	}

	public Ingredients getIngredients() {
		return ingredients;
	}

	public Ingredients populateIngredients(String[] ingredientList) {
		Ingredients result = new Ingredients();
		for (String ingredient : ingredientList) {
			if (!ingredient.trim().isEmpty()) {
				String[] nameAndAmount = ingredient.split(": ");
				String[] amountAndMeasure = nameAndAmount[1].split(" ");
				Ingredient in = new Ingredient(nameAndAmount[0],
						amountAndMeasure[0], amountAndMeasure[1]);
				result.add(in);
			}
		}
		return result;
	}

	/**
	 * Adds an ingredient not previously in the ingredients list
	 * 
	 * @TODO Will have this write to the recipe file and save the new
	 *       ingredients
	 * 
	 * @param ingredient
	 */
	public void addIngredient(Ingredient ingredient) {
		this.ingredients.add(ingredient);
	}

	public void print() {
		System.out.println(this.recipeTitle);
		for (int i = 0; i < this.ingredients.size(); i++) {
			this.ingredients.get(i).print();
		}
	}
}
