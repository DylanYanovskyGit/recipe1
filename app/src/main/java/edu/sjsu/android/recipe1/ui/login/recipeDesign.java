package edu.sjsu.android.recipe1.ui.login;

import java.util.ArrayList;

public class recipeDesign {

    ArrayList<ingredients> ingredientList;
    int cookTime;


    public recipeDesign(ingredients ingredients)
    {

    }

    public void addIngrediant(ingredients ingredient)
    {
        ingredientList.add(ingredient);
    }

}
