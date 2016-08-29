package recipes;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import org.apache.commons.io.FileUtils;

public class Recipes {
	private final static int TITLE = 0;

	private File folder;
	private static ArrayList<Recipe> recipes;

	public Recipes() throws IOException {
		recipes = new ArrayList<Recipe>();
		this.folder = new File("src/recipes");
		populateRecipes(this.folder);
	}

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
				}
			}
		}
	}

	private static void populateIngredients(String name, String[] ingredients) {
		Recipe recipe = new Recipe(name, ingredients);
		recipes.add(recipe);
	}
	
	public void add(Recipe recipe) {
		recipes.add(recipe);
	}

	public Recipe get(int index) {
		return recipes.get(index);
	}
	
	public int size(){
		return recipes.size();
	}
}
