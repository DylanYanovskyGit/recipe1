package edu.sjsu.android.recipe1.ui.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

import edu.sjsu.android.recipe1.R;

public class  ingredients extends AppCompatActivity {

    String ingredientsName;
    int ingredientsCount;
    ArrayList<String> ingredients;

    /**
     * creates an ingredient given name, ingredient, and increases ingredientsCount
     * @param ingrediant
     */
    public ingredients(String ingrediant)
    {
        this.ingredientsName = ingrediant;
        ingredientsCount++;

    }

    /**
     * add an ingredient name to the ingredient arraylist
     * @param name
     */
    public void add(String name)
    {
        ingredients.add(name);
    }
}

