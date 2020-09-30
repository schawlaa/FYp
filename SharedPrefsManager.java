package com.shehryarkamran.pbms.Utils;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * This class is to manage data that are stored in the Shared Preferences file
 * these data are relative to the user profile details
 */
public class SharedPrefsManager {

    //the Shared Preferences file name
    private static final String SHARED_PREFS = "UserDetailSharedPrefs";

    //Shared Preferences attributes
    private static final String PREFS_IS_PROFILE = "isProfile";
    private static final String PREFS_USERNAME = "username";
    private static final String PREFS_BALANCE = "balance";
    private static final String PREFS_SAVINGS = "savings";
    private static final String PREFS_GROUPING = "grouping";
    private static final String PREFS_DAY_START = "dayStart";
    private static final String PREFS_BUDGET = "budget";
    private static final String PREFS_THEME_CHANGED = "themeChanged";


    //the SharedPreferences and Editor objects
    private final SharedPreferences prefs;
    private SharedPreferences.Editor editor;

    //constructor
    public SharedPrefsManager(Context context) {
        prefs = context.getSharedPreferences(SHARED_PREFS, Context.MODE_PRIVATE);
    }

    //commit all changes done to the editor
    public void commit() {
        editor.commit();
    }

    //open the editor object for commiting changes
    public void startEditing() {
        editor = prefs.edit();
    }

    /**
     * Below are the setters and getters for each attribute
     */


    public boolean getPrefsIsProfile() {
        return prefs.getBoolean(PREFS_IS_PROFILE, false);
    }

    public String getPrefsUsername() {
        return prefs.getString(PREFS_USERNAME, "");
    }

    public float getPrefsSavings() {
        return prefs.getFloat(PREFS_SAVINGS, 0);
    }

    public float getPrefsBudget() {
        return prefs.getFloat(PREFS_BUDGET, 500);
    }

    public float getPrefsBalance() {
        return prefs.getFloat(PREFS_BALANCE, 0);
    }



    public String getPrefsGrouping() {
        return prefs.getString(PREFS_GROUPING, "monthly");
    }

    //returns the position of the selected value in the string array
    public int getPrefsDayStart() {
        return prefs.getInt(PREFS_DAY_START, 0);
    }

    public boolean getPrefsThemeChanged() {
        return prefs.getBoolean(PREFS_THEME_CHANGED, false);
    }


    public void setPrefsIsProfile(boolean isProfile) {
        editor.putBoolean(PREFS_IS_PROFILE, isProfile);
    }

    public void setPrefsUsername(String username) {
        editor.putString(PREFS_USERNAME, username);
    }

    public void setPrefsSavings(float savings) {
        editor.putFloat(PREFS_SAVINGS, savings);
    }

    public void setPrefsBudget(float budget) {
        editor.putFloat(PREFS_BUDGET, budget);
    }


    public void setPrefsGrouping(String grouping) {
        editor.putString(PREFS_GROUPING, grouping);
    }

    public void setPrefsDayStart(int dayStart) {
        editor.putInt(PREFS_DAY_START, dayStart);
    }


    public void setPrefsThemeChanged(boolean value) {
        editor.putBoolean(PREFS_THEME_CHANGED, value);
    }
}