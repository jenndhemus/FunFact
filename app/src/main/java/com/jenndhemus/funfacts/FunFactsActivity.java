package com.jenndhemus.funfacts;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;
//press Ctrl F10  to reload when changes are added
/*screen users can interact with*/
public class FunFactsActivity extends AppCompatActivity {
        // declare view variables
        private TextView factTextView;
        private Button showFactView;
        private RelativeLayout relativeLayout;
        private FactBook fact = new FactBook();
        private colorWheel color = new colorWheel();

    @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts); //tell the activity what layout to use

        //Assign the View from layout fields to the corresponding variables
        factTextView = findViewById(R.id.funFactTextView);
        showFactView = findViewById(R.id.ShowFactButton);
        relativeLayout = findViewById(R.id.layoutId);

        View.OnClickListener buttonListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //after button click update(factTextView) with a new fact
                //update screen with new fact
                factTextView.setText(fact.getFact());
                int colorSet = color.getColor();
                relativeLayout.setBackgroundColor(colorSet);
                showFactView.setTextColor(colorSet);

            }
        };

        showFactView.setOnClickListener(buttonListener);



    }
}
