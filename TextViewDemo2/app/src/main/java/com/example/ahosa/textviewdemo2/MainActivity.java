package com.example.ahosa.textviewdemo2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView nameTextView;
    private TextView ageTexView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameTextView = (TextView) findViewById(R.id.nameTextViewId);
        ageTexView = (TextView)findViewById(R.id.ageTextViewId);

        nameTextView.setText("Habib Ahosan");
        ageTexView.setText("22 years old");
    }
}
