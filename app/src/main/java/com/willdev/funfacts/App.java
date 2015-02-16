package com.willdev.funfacts;

import android.app.Application;

import com.parse.Parse;

/**
 * Created by rondalewilliams on 2/15/15.
 */
public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Parse.enableLocalDatastore(this);
        Parse.initialize(this, "tCBq46bIyjeu7YMDIVuvW7dDRxpdecKprTl7g5TC", "p5FtGZ0KPTMtWL5KxAMn3MWZMA5APY9jhCSl2geo");

    }
}
