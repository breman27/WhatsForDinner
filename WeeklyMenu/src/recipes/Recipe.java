package recipes;

//import java.util.HashMap;

import ingredients.*;

/**
 * 
 * @author Brett Long
 * @version 8/27/2016
 * 
 *          Keep track of the title and ingredients needed for each recipe
 */
public class Recipe {
	private String recipeTitle;
	private Ingredients ingredients;

	/*
	 * May change underlying DS to a hashmap so I can keep track of running
	 * totals for the shopping list
	 */
	// private HashMap<String, Ingredients> recipe;

	public Recipe(String title, String[] ingredients) {
		this.recipeTitle = title;
		this.ingredients = populateIngredients(ingredients);
	} // End constructor

	/**
	 * Returns the title of this Recipe object
	 * 
	 * @return recipeTitle
	 */
	public String getRecipeTitle() {
		return recipeTitle;
	} // End getRecipeTitle

	/**
	 * Return the ingredients required to make this Recipe
	 * 
	 * @return ingredients
	 */
	public Ingredients getIngredients() {
		return ingredients;
	} // End getIngredients

	/**
	 * Create an ingredient from the list of ingredients past in
	 * 
	 * Current format for the txt files:
	 * 
	 * First line is the title of the recipe followed by a blank line.
	 * 
	 * Each line after contains the title of an Ingredient followed by a colon.
	 * 
	 * This is followed by the amount and the measurement of that ingredient.
	 */
	public Ingredients populateIngredients(String[] ingredientList) {
		Ingredients result = new Ingredients();
		for (String ingredient : ingredientList) {
			if (!ingredient.trim().isEmpty()) {
				String[] nameAndAmount = ingredient.split(": ");
				String[] amountAndMeasure = nameAndAmount[1].split(" ");
				Ingredient in = new Ingredient(nameAndAmount[0],
						amountAndMeasure[0], amountAndMeasure[1]);
				result.add(in);
			}// End if
		} // End for
		return result;
	} // End populateIngredients

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
	} // End addIngredient

	/**
	 * Pretty print this Recipe object
	 */
	public void print() {
		System.out.println(this.recipeTitle);
		for (int i = 0; i < this.ingredients.size(); i++) {
			this.ingredients.get(i).print();
		} // End for
	} // End print

} // End Recipe
