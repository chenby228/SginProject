package com.example.chenby.androidclient;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.dk.view.patheffect.PathTextView;

public class ChatListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_list);

        PathTextView mPathTextView = findViewById(R.id.path);
        mPathTextView.setPaintType(PathTextView.Type.SINGLE);
        mPathTextView.setTextSize(44);

        mPathTextView.init("Hello World");
    }
}
