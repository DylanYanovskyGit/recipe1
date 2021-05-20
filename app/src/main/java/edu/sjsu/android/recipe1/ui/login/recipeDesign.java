package edu.sjsu.android.recipe1.ui.login;

import java.util.ArrayList;

/**
 * The recipeDesign class is the recipe object itself
 * You can add recipe steps, set cooktime, and retrieve recipe variables
 * Variables: ArrayList<ingredients> ingredientList,
 *            ArrayList<String> recipe_steps, String cookTime
 */
public class recipeDesign {

    ArrayList<ingredients> ingredientList;
    ArrayList<String> recipe_steps;
    String cookTime;

    /**
     * Using arraylist of ingredients and cooktime
     * set the ingredients and cooktime of the current recipedesign
     * @param ingredients
     * @param cookTime
     */
    public recipeDesign(ArrayList<ingredients> ingredients, String cookTime)
    {
        this.ingredientList = ingredients;
        this.cookTime = cookTime;
    }

    /**
     * set recipe steps of current recipedesign to given arraylist
     * @param recipe_steps
     */
    public void addRecipeSteps(ArrayList<String> recipe_steps)
    {
        this.recipe_steps = recipe_steps;
    }

    /**
     * retrieve cookTime string
     * @return cookTime
     */
    public String getCookTime(){
        return this.cookTime;
    }

    /**
     * retrieve current recipe design's arraylist ingredientList
     * @return ingredientList
     */
    public ArrayList<ingredients> getIngredientList(){
        return ingredientList;
    }

    /**
     * retrieve current recipe design's arraylist recipe steps
     * @return recipe_steps
     */
    public ArrayList<String> getRecipe_steps(){
        return recipe_steps;
    }

    /**
     * retrieve current recipe design's string cooktime
     * @param cookTime
     */
    public void setCookTime(String cookTime){
        this.cookTime = cookTime;
    }

}
