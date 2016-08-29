package controller;

import java.io.IOException;

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
		for (int i = 0; i < recipes.size(); i++) {
			recipes.get(i).print();
			System.out.println("\n");
		} // End for
	} // End main
} // End Controller
