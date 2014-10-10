package com.willdev.funfacts;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.graphics.Color;
import android.widget.Toast;

import java.util.Random;


public class FunFactsActivity extends Activity {


    private FactBook mFactbook = new FactBook();
    private ColorWheel mColors = new ColorWheel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        //Declare our View variables and assign them the views from the layout files.f

        final TextView factLabel = (TextView) findViewById(R.id.textView2);
        final Button showFactButton = (Button) findViewById(R.id.button1);
        final RelativeLayout relativeLayout =  (RelativeLayout) findViewById(R.id.mainLayout);

        View.OnClickListener listener = new View.OnClickListener() {


            @Override
            public void onClick(View v) {

               //The button was clicked, so update the fact label with a new fact
                String fact = mFactbook.getFact();


                //Convert the random number to a text fact

                factLabel.setText(fact);

                int color = mColors.getColor();
                relativeLayout.setBackgroundColor(color);
                showFactButton.setTextColor(color);


            }
        };
        showFactButton.setOnClickListener(listener);



    }



}
