package com.willdev.funfacts;

import com.parse.FindCallback;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseQuery;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by rondalewilliams on 10/10/14.
 */
public class FactBook {


    public ArrayList<String> mFacts = new ArrayList<String>();


    public String getFact() {


        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mFacts.size());

        final ParseObject myFact = new ParseObject("Facts");

        ParseQuery<ParseObject> query = ParseQuery.getQuery("Facts");
        query.whereEqualTo("facts", myFact);

        query.findInBackground(new FindCallback<ParseObject>() {
            @Override
            public void done(List<ParseObject> parseObjects, ParseException e) {

              for (ParseObject fact: parseObjects)
                mFacts.add(fact.toString());
            }
        });


        String facts = mFacts.get(randomNumber);

        return facts;

    }

    public void addFact(String fact) {

        ParseObject facts = new ParseObject("Facts");
        facts.put("facts",fact);
        mFacts.add(fact);
    }
}