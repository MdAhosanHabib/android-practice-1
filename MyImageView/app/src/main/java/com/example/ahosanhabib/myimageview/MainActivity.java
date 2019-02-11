package com.example.ahosanhabib.myimageview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private ImageView imageview1, imageview2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageview1 = findViewById(R.id.imageviewid1);
        imageview2 = findViewById(R.id.imageviewid2);

        imageview1.setOnClickListener(this);
        imageview2.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        if(v.getId()==R.id.imageviewid1){
            Toast.makeText(MainActivity.this,"Rakib in seatting mode",Toast.LENGTH_SHORT ).show();
        }else if(v.getId()==R.id.imageviewid2){
            Toast.makeText(MainActivity.this,"Rakib on stand mode",Toast.LENGTH_SHORT).show();
        }

    }
}
