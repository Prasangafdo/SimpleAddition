package com.fdo.prasanga.simpleaddition;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

Button btn_addition, btn_subtraction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_addition = (Button)findViewById(R.id.btn_addition);
        btn_subtraction = (Button)findViewById(R.id.btn_subtraction);

        btn_addition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent addition = new Intent(MainActivity.this, AdditionActivity.class);
                startActivity(addition);
            }
        });
        btn_subtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent subtraction = new Intent(MainActivity.this, SubtractionActivity.class);
                startActivity(subtraction);
            }
        });
    }
}
