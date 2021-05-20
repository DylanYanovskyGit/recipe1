package edu.sjsu.android.recipe1.ui.login;

import android.os.Bundle;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import edu.sjsu.android.recipe1.R;


/**
 * The class display manages the information to display
 * It simplifies/combines the data for easier handling
 */
public class display extends AppCompatActivity {

    EditText step1;
    EditText recipeStepsDisplay;
    EditText step3;
    ArrayList<String> steps;
    EditRecipe recipedata;
    recipeDesign recipedesign;
    Recipe_Steps recipe_steps;
    EditText cookTime;
    EditText ingredientField;
    String concat = "";

    public display(recipeDesign design) {

        this.recipedesign = design;

    }

    /**
     * Starts new activity, creates view from state
     * From state, retrieves ingredients, cook time, recipe steps
     * {@inheritDoc}
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        ingredientField = findViewById(R.id.ingredientField);
        cookTime = findViewById(R.id.cookTime);

        recipeStepsDisplay= findViewById(R.id.step2);
        step3= findViewById(R.id.step3);

    }

    /**
     * creates two strings, concat: ingredients concatenated
     *                      steps:  recipe steps concatenated
     */
    public void display() {
        String concat = "";
        String steps = "";
        for(ingredients ingredients : recipedesign.ingredientList)
        {
            concat += ingredients.toString();
        }
        ingredientField.setText(concat);
        cookTime.setText(recipedesign.cookTime);
        for(String step: recipedesign.recipe_steps)
        {
            steps += step;
        }
        recipeStepsDisplay.setText(steps);

    }

}
