package com.example.chenby.sign;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;


import com.example.chenby.androidclient.ChatListActivity;
import com.example.chenby.androidclient.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button mBtuRegister;
    private Button mBtnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        mBtuRegister = findViewById(R.id.bt_login_register);
        mBtnLogin = findViewById(R.id.bt_login_submit);

        mBtuRegister.setOnClickListener(this);
        mBtnLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.bt_login_register:
                startActivity(new Intent(MainActivity.this, RegisterActivity.class));
                break;
            case R.id.bt_login_submit:
                startActivity(new Intent(MainActivity.this, ChatListActivity.class));
                break;
        }
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.addCategory(Intent.CATEGORY_HOME);
        startActivity(intent);
    }
}
