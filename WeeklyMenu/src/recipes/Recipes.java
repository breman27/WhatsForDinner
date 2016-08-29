package recipes;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import org.apache.commons.io.FileUtils;

/**
 * 
 * @author Brett Long
 * @version 8/27/2016
 * 
 *          ArrayList of Recipe objects (may change)
 */
public class Recipes {
	private final static int TITLE = 0;

	private File folder;
	private static ArrayList<Recipe> recipes;

	public Recipes() throws IOException {
		recipes = new ArrayList<Recipe>();
		this.folder = new File("src/recipes");
		populateRecipes(this.folder);
	}// End constructor

	/**
	 * Iterate through each Recipe in the recipes directory and create a Recipe
	 * object from each of them.
	 */
	private static void populateRecipes(File folder) throws IOException {
		File[] listOfFiles;
		if (folder.canRead()) {
			listOfFiles = folder.listFiles();

			for (int i = 0; i < listOfFiles.length; i++) {
				File file = listOfFiles[i];
				if (file.isFile() && file.getName().endsWith(".txt")) {
					String content = FileUtils.readFileToString(file);
					String[] temp = content.split("\n");
					populateIngredients(temp[TITLE],
							Arrays.copyOfRange(temp, TITLE + 1, temp.length));
				}// End if
			}// End for
		}// End if
	}// End populateRecipes

	/**
	 * Add the ingredients found in the text file to the recipe and then add the
	 * recipe to the list
	 */
	private static void populateIngredients(String name, String[] ingredients) {
		Recipe recipe = new Recipe(name, ingredients);
		recipes.add(recipe);
	}// End populateIngredients

	/**
	 * Add a Recipe object to the list of Recipe(s)
	 */
	public void add(Recipe recipe) {
		recipes.add(recipe);
	}// End add

	/**
	 * Returns the Recipe object at the given index
	 */
	public Recipe get(int index) {
		return recipes.get(index);
	}// End get

	/**
	 * Returns the size of the Recipes object
	 */
	public int size() {
		return recipes.size();
	}// End size
}
