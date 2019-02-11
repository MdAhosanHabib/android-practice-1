package com.example.ahosa.mybuttondemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button loginbutton,logoutbutton;
    private TextView textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginbutton = (Button)findViewById(R.id.LoginButtonViewId);
        logoutbutton = (Button) findViewById(R.id.LogoutButtonViewId);
        textview = (TextView)findViewById(R.id.TextViewId);

    }

    public void showMassege(View v){
        if(v.getId()==R.id.LoginButtonViewId){
            Log.d("tag","Login Button is Clicked");
        }else if(v.getId()==R.id.LogoutButtonViewId){
            Log.d("tag","Logout Button is Clicked");
        }
    }

}
