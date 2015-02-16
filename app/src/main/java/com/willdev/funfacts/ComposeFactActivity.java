package com.willdev.funfacts;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;

import com.parse.ParseObject;


public class ComposeFactActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compose_fact);

        ActionBar actionBar = getActionBar();
        actionBar.setTitle("Cancel");
        actionBar.setDisplayHomeAsUpEnabled(true);



        final EditText newFact = (EditText)findViewById(R.id.compose_fact);

        String fact = newFact.getEditableText().toString();

        ParseObject object = new ParseObject("Facts");
        object.add("facts", fact);

    }



}
