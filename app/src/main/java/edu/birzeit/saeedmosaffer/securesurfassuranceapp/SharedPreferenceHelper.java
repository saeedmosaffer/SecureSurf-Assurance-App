package edu.birzeit.saeedmosaffer.securesurfassuranceapp;

import android.content.Context;
import android.content.SharedPreferences;

public class SharedPreferenceHelper {
    private static final String PREF_NAME = "AppPreferences";
    private static final String FIRST_TIME_KEY = "isFirstTime";

    private final SharedPreferences sharedPreferences;

    public SharedPreferenceHelper(Context context) {
        sharedPreferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
    }

    public boolean isFirstTime() {
        return sharedPreferences.getBoolean(FIRST_TIME_KEY, true);
    }

    public void setFirstTime(boolean isFirstTime) {
        sharedPreferences.edit().putBoolean(FIRST_TIME_KEY, isFirstTime).apply();
    }
}

