package com.willdev.funfacts;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class FunFactsActivity extends Activity {


    private FactBook mFactbook = new FactBook();
    private ColorWheel mColors = new ColorWheel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        getActionBar().hide();

        //Declare our View variables and assign them the views from the layout files.f

        final TextView factLabel = (TextView) findViewById(R.id.textView2);
        final Button showFactButton = (Button) findViewById(R.id.button1);
        final Button composeNewFactButton = (Button) findViewById(R.id.button2);
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

        composeNewFactButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(FunFactsActivity.this, ComposeFactActivity.class);
                startActivity(intent);


            }
        });


    }


}
