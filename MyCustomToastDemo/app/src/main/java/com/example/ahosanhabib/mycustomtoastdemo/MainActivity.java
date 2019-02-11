package com.example.ahosanhabib.mycustomtoastdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button ButtonView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButtonView = (Button) findViewById(R.id.ButtonViewId);

        ButtonView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LayoutInflater inflater = getLayoutInflater();
                View customView = inflater.inflate(R.layout.customtoastlayout, (ViewGroup) findViewById(R.id.CustomToast_Id));

                Toast toast = new Toast(MainActivity.this);
                toast.setDuration(Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER,0,0);
                toast.setView(customView);
                toast.show();
            }
        });
    }
}
