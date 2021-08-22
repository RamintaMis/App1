package com.example.block01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button buttonBlue, buttonPink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonBlue = findViewById(R.id.buttonBlue);
        buttonPink = findViewById(R.id.buttonPink);
    }

    public void toDo (View v){
        if (v.equals(buttonBlue)){
            v.setVisibility(View.INVISIBLE);
        }
        if (v.equals(buttonPink)){
            //pop-up
            Toast.makeText(getApplicationContext(), "to do to do to do...", Toast.LENGTH_SHORT).show();
        }
    }
}