package edu.sjsu.android.recipe1.ui.login;

import java.util.ArrayList;

public class recipeDesign {

    ArrayList<ingredients> ingredientList;
    ArrayList<String> recipe_steps;

    int cookTime;


    public recipeDesign(ArrayList<ingredients> ingredients,  int cookTime)
    {
        this.ingredientList = ingredients;
        this.cookTime = cookTime;
    }

    public void addRecipeSteps(ArrayList<String> recipe_steps)
    {
        this.recipe_steps = recipe_steps;
    }



}
