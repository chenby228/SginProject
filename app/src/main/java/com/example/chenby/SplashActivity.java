package com.example.chenby;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.dk.view.patheffect.PathTextView;
import com.example.chenby.sign.MainActivity;
import com.example.chenby.androidclient.R;

public class SplashActivity extends AppCompatActivity {

    private PathTextView mPathTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_acitvity);
        mPathTextView = findViewById(R.id.path_text);
        mPathTextView.setPaintType(PathTextView.Type.SINGLE);
        mPathTextView.setTextSize(22);
        mPathTextView.init("W E L C O M E");

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashActivity.this, MainActivity.class));
                finish();
            }
        },3000);
    }
}
