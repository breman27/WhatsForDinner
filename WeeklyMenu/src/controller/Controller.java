package controller;

import java.io.IOException;

import recipes.Recipe;
import recipes.Recipes;

/**
 * 
 * @author Brett Long
 * @version 8/27/2016
 * 
 *          Generate a list of meals for the week as well as a shopping list for
 *          the ingredients required to make the dish.
 * 
 **/
public class Controller {
	/**
	 * Program entry point.
	 */
	public static void main(String[] args) throws IOException {
		Recipes recipes = new Recipes();
		Recipe[] r = new Recipe[7];
		boolean[] visited = new boolean[recipes.size()];
		int i = 0;
		while (i < 2) {
			int index = (int) Math.floor(Math.random()
					* recipes.size());
			if (!visited[index]) {
				visited[index] = true;
				r[i] = recipes.get(index);
				i++;
			}
		}
		for (int j = 0; j < r.length; j++) {
			if (r[j] != null) {
				r[j].print();
				System.out.println("\n");
			}
		}
	} // End main
} // End Controller
