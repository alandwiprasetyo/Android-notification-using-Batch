package com.alandwiprasetyo.androidnotificationusingbatch;

import android.app.Application;

import com.batch.android.Batch;
import com.batch.android.Config;

/**
 * Created by root on 22/03/16.
 */
public class App extends Application {
    @Override
    public void onCreate()
    {
        super.onCreate();

        super.onCreate();
        Batch.Push.setGCMSenderId("GCM_SENDER_ID");

        // TODO : switch to live Batch Api Key before shipping
        Batch.setConfig(new Config("BATCH_API_KEY")); // devloppement
        // Batch.setConfig(new Config("BATCH_API_KEY")); // live
    }
}