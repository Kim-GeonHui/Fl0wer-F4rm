package com.gunejjang.fl0werf4rm;

import android.app.Application;

import com.tsengvn.typekit.Typekit;

/**
 * Created by tahm_ on 2018-01-19.
 */

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        Typekit.getInstance()
                            .addItalic(Typekit.createFromAsset(this, "fonts/Sam3KRFont.otf"));
    }
}
