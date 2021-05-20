package edu.sjsu.android.recipe1.ui.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import edu.sjsu.android.recipe1.R;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

/**
 * EditRecipe has one method. It retrieves the current recipeDesign information,
 * creates a visualization, and updates the recipe with user input.
 */
public class EditRecipe extends AppCompatActivity {
    ArrayList<ingredients> ingrediantsList = new ArrayList<>();
    EditText ingrediants1;
    EditText ingrediants2;
    EditText ingrediants3;
    EditText cookTime;
    Button add;
    Button addSteps;
    Button nextSteps;
    recipeDesign data;
    ingredients ingredient1;
    ingredients ingredient2;
    ingredients ingredient3;

    /**
     * Takes current saved state
     * updates ingredients, cookTime using user inputs with setOnClickListener
     * {@inheritDoc}
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.edit_steps);
        ingrediants1 = findViewById(R.id.textView);
        ingrediants2 = findViewById(R.id.textView2);
        ingrediants3 = findViewById(R.id.textView3);
        cookTime = findViewById(R.id.textView4);
        addSteps = findViewById(R.id.addSteps);
        add = findViewById(R.id.add);


        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ingrediant1 = ingrediants1.getText().toString();
                String ingrediant2 = ingrediants2.getText().toString();
                String ingrediant3 = ingrediants3.getText().toString();
                String cookTimer = cookTime.getText().toString().trim();

                ingredient1.add(ingrediant1);
                ingredient2.add(ingrediant2);
                ingredient3.add(ingrediant3);
                ingrediantsList.add(ingredient1);
                ingrediantsList.add(ingredient2);
                ingrediantsList.add(ingredient3);
                data.cookTime = cookTimer;
                data = new recipeDesign(ingrediantsList, cookTimer);

            }
        });

        addSteps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nextPage = new Intent(EditRecipe.this, Recipe_Steps.class);
                startActivity(nextPage);
            }
        });
    }
}
