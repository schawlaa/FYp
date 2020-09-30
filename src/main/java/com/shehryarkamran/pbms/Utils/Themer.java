package com.shehryarkamran.pbms.Utils;

import android.app.Activity;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.shehryarkamran.pbms.R;

//for Theme changing in app
public class Themer {

    public static void setThemeToActivity(Activity act) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(act);
        try {
            if (prefs.getInt("pref_key_theme", act.getResources().getColor(R.color.background_material_light)) == act.getResources().getColor(R.color.background_material_dark)) {
                act.setTheme(R.style.Theme_Appcompat_custom_dark);
            } else if (prefs.getInt("pref_key_theme",act.getResources().getColor(R.color.background_material_light)) == act.getResources().getColor(R.color.grey_colorPrimary)){
                act.setTheme(R.style.Theme_AppCompat_custom_grey);
            } else if(prefs.getInt("pref_key_theme",act.getResources().getColor(R.color.background_material_light)) == act.getResources().getColor(R.color.skyblue_colorPrimary)) {
                act.setTheme(R.style.Theme_AppCompat_custom_skyblue);
            } else {
                act.setTheme(R.style.Theme_Appcompat_custom_light);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}