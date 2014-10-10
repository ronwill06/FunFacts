package com.willdev.funfacts;

import java.util.Random;

/**
 * Created by rondalewilliams on 10/10/14.
 */
public class FactBook {


    public String[] mFacts = {"Ants stretch when they wake up in the morning",
            "Ostriches run faster than horses",
            "Olympic gold medals are actually made mostly of silver"};

    public String getFact() {


        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(3);


        String facts = mFacts[randomNumber];

        return facts;

    }
}