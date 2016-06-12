package edu.galileo.android.tipcalc;

import android.app.Application;

/**
 * Created by josias on 11/06/16.
 */
public class TipCalcApp extends Application{
    private final static String ABOUT_URL = "http://josiasemanuel.me";



    public String getAboutUrl() {
        return ABOUT_URL;
    }
}
