package edu.sjsu.android.recipe1.ui.login;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import edu.sjsu.android.recipe1.R;

public class Recipe_Steps extends  AppCompatActivity{
        ArrayList<String> steps;
        EditText textfield1;
        EditText textField2;
        EditText textField3;
        Button add;
        recipeDesign design;
        EditRecipe recipe;



        @Override
        public <T extends View> T findViewById(int id) {
            return super.findViewById(id);
        }

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_recipe_steps);
            textfield1 = findViewById(R.id.textView5);

            textField2 = findViewById(R.id.textView6);
            textField3 = findViewById(R.id.textView7);
            add = findViewById(R.id.addSteps);
            steps = new ArrayList<>(3);



            add.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    steps.add(textfield1.getText().toString().trim());
                    steps.add(textField2.getText().toString().trim());
                    steps.add(textField3.getText().toString().trim());
                    design.addRecipeSteps(steps);
                   display display = new display(design);
                    display.display();
                }
            });


        }

}