package edu.sjsu.android.recipe1.ui.login;

import java.util.ArrayList;

public class recipeDesign {

    ArrayList<ingredients> ingredientList;
    ArrayList<String> recipe_steps;
    String cookTime;


    public recipeDesign(ArrayList<ingredients> ingredients, String cookTime)
    {
        this.ingredientList = ingredients;
        this.cookTime = cookTime;
    }

    public void addRecipeSteps(ArrayList<String> recipe_steps)
    {
        this.recipe_steps = recipe_steps;
    }

    public String getCookTime(){
        return this.cookTime;
    }

    public ArrayList<ingredients> getIngredientList(){
        return ingredientList;
    }

    public ArrayList<String> getRecipe_steps(){
        return recipe_steps;
    }

    public void setCookTime(String cookTime){
        this.cookTime = cookTime;
    }

}
