package com.example.serviceexample;

import android.content.Context;
import android.os.Handler;
import android.widget.Toast;

import java.util.TimerTask;

public class CustomTimerTask extends TimerTask {

    int i =1;
    private Context context;
    private Handler mHandler = new Handler();

    public CustomTimerTask(Context con) {
        this.context = con;
    }




    @Override
    public void run() {
        new Thread(new Runnable() {

            public void run() {

                mHandler.post(new Runnable() {
                    public void run() {
                        Toast.makeText(context, "Count :"+i, Toast.LENGTH_SHORT).show();
                        i= i+4;

                    }
                });
            }
        }).start();

    }

}