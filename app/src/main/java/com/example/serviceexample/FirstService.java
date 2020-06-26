package com.example.serviceexample;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class FirstService extends Service {

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        // اینجا کارهایی که نیازه فقط یک بار و موقع ساخته شدن سرویس انجام بشه اجرا میشن
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        // اینجا کارهای مربوط به سرویس استارت شده انجام میشه
        // برای مثال ما فقط 5 ثانیه صبر میکنیم
        Toast.makeText(getApplicationContext(),"Hello ",Toast.LENGTH_LONG).show();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return START_NOT_STICKY;
    }
}
