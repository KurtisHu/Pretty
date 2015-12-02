package com.dreamfactory.kurtishu.pretty;

import android.app.Application;
import android.content.Context;

import com.orhanobut.logger.Logger;

/**
 * Created by kurtishu on 11/30/15.
 */
public class PrettyApp extends Application {

    private static PrettyApp instance;

    @Override
    public void onCreate() {
        super.onCreate();

        Logger.init();

        instance = this;
    }

    public static Context getContext() {
        return instance;
    }
}
