package edu.sjsu.android.recipe1.ui.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import edu.sjsu.android.recipe1.R;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

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
    ingredients ingredient;


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
                int cookTimer = Integer.parseInt(cookTime.getText().toString().trim());
                ingredient.add(ingrediant1);
                ingredient.add(ingrediant2);
                ingredient.add(ingrediant3);
                data.addIngrediant(ingredient);
                data.cookTime = cookTimer;

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
