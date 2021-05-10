package edu.sjsu.android.recipe1.ui.login;

import android.os.Bundle;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import edu.sjsu.android.recipe1.R;

public class display extends AppCompatActivity {


    EditText step1;
    EditText step2;
    EditText step3;
    ArrayList<String> steps;
    EditRecipe recipedata;
    recipeDesign recipedesign;
    EditText cookTime;
    EditText ingredientField;
    String concat = "";

    public display(ArrayList<String> steps, EditRecipe recipe, recipeDesign design) {
        this.steps = steps;
        this.recipedata = recipe;
        this.recipedesign = design;

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        ingredientField = findViewById(R.id.ingredientField);
        cookTime = findViewById(R.id.cookTime);

        step2= findViewById(R.id.step2);
        step3= findViewById(R.id.step3);

    }


    public void display() {
        step1.setText(steps.get(0));
        step2.setText(steps.get(1));
        step3.setText(steps.get(2));
        cookTime.setText(recipedesign.cookTime);   //create a text field in the .xml file
        for(ingredients ingredient : recipedesign.ingredientList)
        {

            concat += ingredient.toString();

        }
        ingredientField.setText(concat);


    }

}
