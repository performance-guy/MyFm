package com.example.admin.myfm.Util;

import android.app.Application;

import com.example.admin.myfm.R;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

/**
 * Created by admin on 12-08-2017.
 */

public class CalligraphyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        super.onCreate();
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("font/lato_regular.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build()
        );
    }
}
